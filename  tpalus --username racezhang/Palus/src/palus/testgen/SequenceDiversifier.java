// Copyright 2010 Google Inc. All Rights Reserved.

package palus.testgen;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import palus.Log;
import palus.PalusUtil;
import palus.analysis.MethodRecommender;
import randoop.ExecutableSequence;
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
 * @author saizhang@google.com (Your Name Here)
 */

//TODO
//how to diversify the existing sequence
//1. append the most related method
//2. append all method in this class
//3. append multiple method?
//4. about argument choosing. using the object profile?

//limitations:
//1. the statistcs is problematic
//2. there might be redundant
//3. there are no dependence information on parameter constrains
//4. associate parameter values from execution to specific method

//using value replacement to find suspicious transition
//use dynamic tainting to find out irrelevant
//use adapative testing to wisely choose parameter
//record constrains during execution to guide parameter choosing

/***
 * 
 * 
 * **/

public class SequenceDiversifier {

  private final ModelBasedGenerator generator;
  
  /**this collection will never be mutated*/
  private final SequenceCollection components;
  private final MethodRecommender recommender;
  
  //all generated sequence from diversify
  protected final Set<Sequence> diversifiedSequences
      = new LinkedHashSet<Sequence>();
//all generated sequence from diversify
  protected final Set<ExecutableSequence> diversifiedValidSequence
      = new LinkedHashSet<ExecutableSequence>();

  
  public SequenceDiversifier(ModelBasedGenerator generator, MethodRecommender recommender) {
    PalusUtil.checkNull(generator);
    this.generator = generator;
    this.components = generator.components;
    this.recommender = recommender;
  }
  
  /**
   * it diversify the existence sequence, which just calls statement
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
  
  protected void diversifySequence(Sequence sequence, Collection<StatementKind> statementsToAppend) {
    if(statementsToAppend.isEmpty()) {
      return;
    }
    //choose different divisify strategy
    StatementKind statement = Randomness.randomSetMember(statementsToAppend);
    
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
      
      if(/*!eSeq.hasFailure() &&*/ !eSeq.hasNonExecutedStatements()) {
        this.diversifiedValidSequence.add(eSeq);
      }
    }
  }
  
  public Set<ExecutableSequence> allDiversifedExecutableSequences() {
    return this.diversifiedValidSequence;
  }
  
  public Set<Sequence> allDiversifiedSequences() {
    return this.diversifiedSequences;
  }
  
  private boolean generatedBeforeDiversifying(Sequence s) {
    return generator.allSequences.contains(s);
  }
  
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