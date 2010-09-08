// Copyright 2010 Google Inc. All Rights Reserved.

package palus.testgen;

import cov.Branch;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import palus.Log;
import palus.PalusUtil;
import palus.analysis.MethodRecommender;
import randoop.ExecutableSequence;
import randoop.FailureAnalyzer;
import randoop.RConstructor;
import randoop.RMethod;
import randoop.Sequence;
import randoop.SequenceCollection;
import randoop.StatementKind;
import randoop.Variable;
import randoop.util.Randomness;
import randoop.util.Reflection.Match;
import randoop.util.SimpleList;

/**
 * Diversifies a generated legal sequence with recommended related method by
 * static analysis.
 * 
 * There are several modes in diversifying a generated sequence:
 * 1. only append the most related method by static analysis
 * 2. append all methods in one class. That is, if there are 10 methods in a class.
 *    One generated sequence will become 10, after diversifiying.
 *    
 * The current implementation will reuse the outcome value of the generated sequence
 * for arguments as much as possible. This strategy could be replaced by others in
 * future.
 * 
 * @author saizhang@google.com (Sai Zhang)
 * 
 * Several possible directions for future improvement:
 * 1. using value replacement to find suspicious transition
 * 2. use dynamic tainting to find out irrelevant
 * 3. use adapative testing to wisely choose parameter
 * 4. record constrains during execution to guide parameter choosing
 */


public class SequenceDiversifier {
  
  /**
   * If this option is true, it will append every method to an existing sequence.
   * That is "replicating every generated sequence"
   * */
  public static boolean exhaustiveDiversifyModel = true;
  
  /**
   * Whether to add related methods in the return type class.
   * */
  public static boolean addReturnTypeRelatedStatement = false;
  
  
  /**
   * The test generator that uses this diversifier.
   * */
  private final ModelBasedGenerator generator;
  
  /**
   * The sequence pool of existing sequences. This collection will never
   * be mutated in this class.
   * */
  private final SequenceCollection components;
  
  /**
   * A method recommend in returning related methods for a given one.
   * */
  private final MethodRecommender recommender;
  
  /**
   * All generated sequence from diversify
   * */
  protected final Set<Sequence> diversifiedSequences
      = new LinkedHashSet<Sequence>();
  /**
   * All correctly executed generated sequence after diversifying.
   * */
  protected final Set<ExecutableSequence> diversifiedValidSequence
      = new LinkedHashSet<ExecutableSequence>();
  
  /**
   * Constructor. Use a method recommender to diversify the current sequence with other
   * related ones
   * */
  public SequenceDiversifier(ModelBasedGenerator generator, MethodRecommender recommender) {
    PalusUtil.checkNull(generator);
    this.generator = generator;
    this.components = generator.components;
    this.recommender = recommender;
  }
  
  /**
   * It diversifies the existence sequence, which just calls statement
   * @param statement is the method call it just extends
   * */
  public void diversifySequence(Sequence sequence, StatementKind statement) {
    PalusUtil.checkNull(sequence);
    PalusUtil.checkNull(statement);
    
    Log.log("Statement type: " + statement.getClass() + ", " + statement);
    
    //statement could be eitehr a constructor or a method
    Collection<StatementKind> related = null;
    if(statement instanceof RConstructor) {
      related = this.recommender.recommendAll(((RConstructor)statement).getConstructor().getDeclaringClass());
      this.diversifySequence(sequence, related);
    } else if (statement instanceof RMethod) {
      related = this.recommender.recommend(statement);
      //also consider the return type FIXME be aware of a null value here
      if(addReturnTypeRelatedStatement) {
        Class<?> retType = statement.getOutputType();
        related.addAll(this.recommender.recommendAll(retType));
      }
    } else {
      //do nothing here
      return;
    }
    
    if(related != null) {
      Log.log("Related sequence is not null: for " + statement);
      this.diversifySequence(sequence, related);
    } else {
      Log.log("Related sequence is null");
    }
  }
  
  /**
   * Diversify the current sequence with a collection of statements.
   * Diversify one statement once
   * */
  protected void diversifySequence(Sequence sequence, Collection<StatementKind> statementsToAppend) {
    if(statementsToAppend.isEmpty()) {
      return;
    }
    if(exhaustiveDiversifyModel) {
      //extend it with all related one
      for(StatementKind statement : statementsToAppend) {
        this.diversifyOneSequence(sequence, statement);
      }
    } else  {
      //random extension
      StatementKind statement = Randomness.randomSetMember(statementsToAppend);
      this.diversifyOneSequence(sequence, statement);
    }
  }
  
  /**
   * Diversify (append) an sequence
   * */
  protected void diversifyOneSequence(Sequence sequence, StatementKind statement) {
    PalusUtil.checkNull(sequence);
    PalusUtil.checkNull(statement);
    
    List<Class<?>> inputClasses = statement.getInputTypes();
    int[] varIndex = new int[inputClasses.size()];
    
    //a list of sequence get from collection
    int totalseqlines = sequence.size();
    List<Sequence> extraSequences = new LinkedList<Sequence>();
    for(int i = 0; i < inputClasses.size(); i++) {
      Class<?> inputType = inputClasses.get(i);
      //first try to find from existing sequence
      int indexFromSequence = this.indexOfCompatibleType(sequence, inputType);
      if(indexFromSequence != -1) {
        varIndex[i] = indexFromSequence;
        continue;
      }
      
      //if not, try to find from the component
      SimpleList<Sequence> sequences = this.components.getSequencesForType(inputType, false);
      if(sequences.isEmpty()) {
        Log.log("Can not find input for: " + inputType);
        return;
      }
      
      Sequence seq = Randomness.randomMember(sequences);
      extraSequences.add(seq);
      
      Variable var = seq.randomVariableForTypeLastStatement(inputType, Match.COMPATIBLE_TYPE);
      varIndex[i] = totalseqlines + var.index;
      
      totalseqlines += seq.size();
    }
    
    //concatenate all sequences
    extraSequences.add(0, sequence);
    Sequence s = Sequence.concatenate(extraSequences);
    
    List<Variable> inputVars = new LinkedList<Variable>();
    for(int i = 0; i <varIndex.length; i++) {
      inputVars.add(s.getVariable(varIndex[i]));
    }
    s = s.extend(statement, inputVars);
    
    //update the statistics
    if(!generatedBeforeDiversifying(s)) {
      this.diversifiedSequences.add(s);
      Log.log("Succeed in Diversify ...");
      
      ExecutableSequence eSeq = new ExecutableSequence(s);
      
      //execute it,using the same executor
      eSeq.execute(generator.executionVisitor);
      
      //if(true || /*!eSeq.hasFailure() &&*/ !eSeq.hasNonExecutedStatements()) {
        //update the num of generated tests  
        FailureAnalyzer fa = new FailureAnalyzer(eSeq);
        this.generator.stats.updateStatistics(eSeq, new LinkedHashSet<Branch>()/*no branch info*/,
            fa);
      /* }*/
    }
  }
  
  /**
   * Returns all executable sequences.
   * Note, this method is not used.
   * */
  public Set<ExecutableSequence> allDiversifedExecutableSequences() {
    return this.diversifiedValidSequence;
  }
  
  /**
   * All diversified sequences.
   * Note, this method is not used in the tool.
   * */
  public Set<Sequence> allDiversifiedSequences() {
    return this.diversifiedSequences;
  }
  
  /**
   * Has the given sequence been generated before.
   * */
  private boolean generatedBeforeDiversifying(Sequence s) {
    return generator.allSequences.contains(s);
  }
  
  /**
   * The index of a compatible type in the last statement of a given sequence.
   * */
  private int indexOfCompatibleType(Sequence sequence, Class<?> type) {
    int index = -1;
    
    for(int i = sequence.size() - 1; i >=0; i--) {
      StatementKind statement = sequence.getStatementKind(i);
      Class<?> outputType = statement.getOutputType();
      if(outputType == void.class) {
        continue;
      }
      if(type.isAssignableFrom(outputType)) {
        return i;
      }
    }
    
    return index;
  }
}