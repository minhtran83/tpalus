// Copyright 2010 Google Inc. All Rights Reserved.

package palus.testgen;

import palus.Log;
import palus.PalusUtil;
import palus.analysis.MethodRecommender;
import palus.main.PalusOptions;
import palus.model.BugInPalusException;
import palus.model.ClassModel;
import palus.model.ModelNode;
import palus.model.Transition;
import plume.Pair;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import randoop.ExecutableSequence;
import randoop.ForwardGenerator;
import randoop.Globals;
import randoop.InputsAndSuccessFlag;
import randoop.RConstructor;
import randoop.RMethod;
import randoop.Sequence;
import randoop.SequenceCollection;
import randoop.SequenceGeneratorStats;
import randoop.StatementKind;
import randoop.Variable;
import randoop.main.GenInputsAbstract;
import randoop.util.Randomness;
import randoop.util.Reflection;
import randoop.util.Timer;

/**
 * A generator which uses built model to guide the creation of sequences.
 * 
 * @author saizhang@google.com (Sai Zhang)
 *
 */
public class ModelBasedGenerator extends ForwardGenerator {
  /*all customizable properties*/
  /**
   * the percentage of time in filling the component with random generated tests
   * */
  public static float percentage_of_random_gen = 0.0f;//1.0f;
  /**
   * the percentage of create of a new object from root
   * */
  public static float ratio_start_from_root = 0.3f;
  /**
   * the max times in trying to generate a new root sequence
   * */
  public static int max_tries_for_new_sequence = 3;
  /**
   * the max times in trying to extend an existing sequence
   * */
  public static int max_tries_for_extend_sequence = 5;
  /**
   * delete the extended sequences in the model?
   * */
  public static boolean delete_extended_seq_in_model = true;
  /**
   * Do random testing before model-based testing? (the palulu way)
   * */
  public static boolean random_test_before_model = false;
  /**
   * Do random testing after model-based testing
   * */
  public static boolean random_test_after_model = false;
  /**
   * Only randomizes the model uncovered statements?
   * */
  public static boolean only_random_uncovered_statements = true;
  /**
   * Should the tool use abstract object profile for argument selection
   * */
  public static boolean use_abstract_state_as_selector = false;
  /**
   * Should the tool merge redundant decorations
   * */
  public static boolean merge_equivalent_decoration = false;
  /**
   * Should the tool automaticcally switch to random testing if the model coverage
   * does not change for 10s
   * */
  public static boolean auto_switch_to_random_test = false;

  
  /**
   * Two timers to record the time for random test generation
   * */
  private final Timer random_gen_timer_before = new Timer();
  private final Timer random_gen_timer_after = new Timer();
  /**
   * the model for guiding test generation
   * */
  public final Map<Class<?>, ClassModel> models;
  /**
   * Keeps track of all model uncovered statement, which should be tested afterwards
   * */
  public final List<StatementKind> modelUncovered;
  /**
   * Keeps the relations between generated sequence with model node
   * */
  protected final ModelSequences modelSequences;
  /**
   * A map keeping the result of sequences to abstract states
   * */
  protected final StatesOfSequences sequenceStates;
  /**
   * Values collected from method annotation
   * */
  protected final ParamValueCollections valueCollections;
  /**
   * Helper class for selecting method inputs
   * */
  protected final MethodInputSelector inputSelector;
  /**
   * The sequence diversifier which diversifies the sequence by adding additional
   * related sequence
   * */
  protected final SequenceDiversifier diversifier;
  /**
   * A method recommender which recommends related method
   * */
  protected final MethodRecommender recommender;
  
  /**
   * Temp vars to keep the frequency of model node selection.
   * */
  private int root_count = 0;
  private int ext_count = 0;
  
  /**
   * The only constructor with a model parameter
   * */
  public ModelBasedGenerator(List<StatementKind> statements, List<Class<?>> covClasses,
      long timeMillis, int maxSequences, SequenceCollection seeds, Map<Class<?>, ClassModel> models,
      ParamValueCollections valueCollections, MethodRecommender recommender) {
    super(statements, covClasses, timeMillis, maxSequences, seeds);
    PalusUtil.checkNull(models, "The class models for generator could not be null.");
    PalusUtil.checkNull(recommender, "The method recommender for generator could not be null.");
    //initialize the model and model sequences
    this.models = models;
    if(merge_equivalent_decoration) {
      int numOfMerged = ClassModel.mergeEquivalentDecorations(this.models);
      System.out.println(Globals.lineSep + numOfMerged + " equivalent decorations merged!");
      int remaining = ClassModel.getDecorationNum(this.models);
      System.out.println("There are: " + remaining + " decorations remained!" + Globals.lineSep);
    }
    
    modelSequences = new ModelSequences(models);
    sequenceStates = new StatesOfSequences();
    //initialize the value collection
    if(valueCollections == null) {
      this.valueCollections = new ParamValueCollections();
    } else {
      this.valueCollections = valueCollections;
    }
    this.inputSelector = new MethodInputSelector(this.valueCollections);
    this.modelUncovered = this.getModelUncoveredStatements(statements, models);
    
    //log the statement
    Log.log("All statements:");
    for(StatementKind statement : statements) {
      Log.log("   " + statement);
    }
    Log.log(Globals.lineSep + Globals.lineSep);
    
    //log all uncovered statements
    Log.log("All uncovered statements: ");
    for(StatementKind statement : modelUncovered) {
      Log.log("    " + statement);
    }
    Log.log(Globals.lineSep + Globals.lineSep);
    
    //initialize the sequence diversifier, and recommender
    this.diversifier = new SequenceDiversifier(this, recommender);
    this.recommender = recommender;

    //FIXME not a perfect place here
    this.random_gen_timer_before.startTiming();
    this.random_gen_timer_after.startTiming();
    if(random_test_before_model) {
        System.out.println(Globals.lineSep + Globals.lineSep
            + "....First generating tests randomly..."
            + Globals.lineSep +  Globals.lineSep);
    }
  }
  
  /**
   * Make a new executable sequence each step
   * this is called by the abstractgenerator's explorer method
   * */
  @Override
  public ExecutableSequence step() {
    //only use model-base generator creates a certain amount of tests
    if(PalusOptions.max_seq_num_model_tests > 0) {
      if(this.stats.outSeqs.size() > PalusOptions.max_seq_num_model_tests) {
        return super.step();
      }
    }
    
    //we first try to generate a few sequences randomly
    if(random_test_before_model && !randomGenerationStop()) {
      return super.step();
    }
    if(auto_switch_to_random_test) {
      this.modelSequences.getSequenceStats().checkModelCoverage();
    }
    if((random_test_after_model && randomGenerationStart())
        || (random_test_after_model && auto_switch_to_random_test && ModelSequencesStats.stop_model_based_generation)) {
      //System.out.println("random");
      //return super.step();
      List<StatementKind> target = this.statements;
      if(only_random_uncovered_statements) {
        target = this.modelUncovered;
      }
      //SequenceGeneratorStats.steps ++;
      return randomSequenceForStatements(target);
    }
    
    //clear the component if needed
    long startTime = System.nanoTime();
    SequenceGeneratorStats.steps ++;
    if(this.components.size() % GenInputsAbstract.clear == 0) {
      this.components.clear();
    }
    
    //the generated sequence and corresponding transitions
    ExecutableSequence eSeq = null;
    Transition tran = null;
    //generate sequence by model. Transition is the current transition been executed
    Pair<ExecutableSequence, Transition> seqTranPair = this.generateSequenceByModel();
    if(seqTranPair == null) {
      return null;
    }
    //try to generate using model in the remaining time
    eSeq = seqTranPair.a;
    tran = seqTranPair.b;
    
    //check not null
    PalusUtil.checkNull(eSeq, "The created executable sequence could not be null.");
    PalusUtil.checkNull(tran, "The transiton which the sequence extends could not be null.");
    
    //no feedback
    if(GenInputsAbstract.dontexecute) {
      this.components.add(eSeq.sequence);
      return null;
    }
    
    //randoop detects possible hang, outputs last sequence
    //under execution. For debugging purpose, if randoop crashes, the current
    //sequence could be output for diagnose
    SequenceGeneratorStats.currSeq = eSeq.sequence;
    
    //record the sequence generation time
    long endTime = System.nanoTime();
    long genTime = endTime - startTime;
    startTime = endTime;
    
    //execute the statement
    eSeq.execute(this.executionVisitor);
    
    //record the sequence execution time
    endTime = System.nanoTime();
    eSeq.exectime = endTime - startTime;
    startTime = endTime;
    
    //process the execution result
    super.processSequence(eSeq);
    
    //if the current sequence has active flag, and could be used in the future
    if(eSeq.sequence.hasActiveFlags()) {
      components.add(eSeq.sequence);      
      //update the model sequence map if we have generated a legal one
      //this.updateModelSequenceMap(eSeq.sequence, tran);
      this.modelSequences.updateModelSequences(eSeq.sequence, tran);
      Log.log("execute pass. updated map size: " + this.modelSequences.size());
      
      //Save that to the sequence states
      this.sequenceStates.add(eSeq.sequence, eSeq.getAllResults());
      Log.log(this.sequenceStates.showContent());
      
      //diversify the legal sequence
      if(TestGenMain.diversifySequence) {
        //diverse the method
        this.diversifier.diversifySequence(eSeq.sequence, this.selectStatement(tran));
      }
    } else {
      Log.log("executing fail: " + eSeq.toCodeString());
    }
    
    //the total generation time, including creating sequence and executing it
    endTime = System.nanoTime();
    genTime += endTime - startTime;
    eSeq.gentime = genTime;
    
    return eSeq;
  }
  
  /**
   * Get all diversified tests.
   * It is not a good practice to get all diversified sequences along, since there
   * could be dependence between generated sequences and diversified ones.
   * */
  public Set<ExecutableSequence> getAllDiversifiedSequences() {
    if(!TestGenMain.diversifySequence) {
      return new LinkedHashSet<ExecutableSequence>();
    } else {
      return this.diversifier.allDiversifedExecutableSequences();
    }
  }

  /**
   * Model-based sequence generation
   * */
  private Pair<ExecutableSequence, Transition> generateSequenceByModel() {
    //the basic algorithm
    //1. randomly pick up a model, follow its root. randomly (or systematically?) pick up
    //   an outgoing edge (make sure it is public method). Then, create a new sequence
    //   and execute it. If it executes without exception, adds to the output component
    //   as well as updating the map (and remember its current state). Note that when creating
    //   the sequence, use the decoration
    //2. in the model sequence map, randomly pick up a class. get all its available states.
    //   pick up an available sequence, and pick up an outgoing edge of of its model, extend
    //   the current sequence, and update (delete and insert) the map.
    //or we could exhaustively do that.
    
    //it has percentage_of_random_gen ratio to create a new sequence
    int nextRandomNum = Randomness.nextRandomInt(10);
    boolean createNewSequence = (nextRandomNum < ((int)(ratio_start_from_root * 10)));
    
    //keep the statistic for error diagnose
    if(createNewSequence) {
      this.root_count++;
    } else {
      this.ext_count++;
    }
    Log.log("Root chosen count: " + root_count + ", extension count: " + ext_count);
    
    //choose the create a new sequence or extend the existing one
    return createNewSequence ? this.createSequenceFromModelRoot() : this.extendAnExistingSequence();
  }
  
  /**
   * Generates a sequence from root
   * */
  private Pair<ExecutableSequence, Transition> createSequenceFromModelRoot() {
    //first randomly pick up a transition from root
    Transition selectedTransition = this.nextRandomTransitionFromRoot();
    if(selectedTransition == null ) {
      return null;
    }
    //When we get a valid transition sequence, so start to extend it be a full sequence
    StatementKind statement = this.selectStatement(selectedTransition);
    //it can not be null
    if(statement == null) {
      //XXXX it could be hashcode()
      String signature = selectedTransition.toSignature();
      //XXXX hard code
      if(signature.indexOf("hashCode") == -1 && signature.indexOf("toString") == -1) {
        throw new BugInPalusException("The statement in transition: "
            + selectedTransition.toSignature() + " is null!");
      } else {
      return null;
      }
    }
    
    Log.log("    Get a statement: " + statement.toParseableString());    
    //update the statistics
    this.stats.statStatementSelected(statement);    
    //now start to choose parameters XXX this needs to be changed
    InputsAndSuccessFlag sequences =
      inputSelector.selectInputsForRoot(statement, selectedTransition, components, this); 
    
    //if we can not select desirable inputs
    if(!sequences.success) {
      this.stats.statStatementNoArgs(statement);
      Log.log("    Fail to find inputs");
      return null;
    }
    //find input, then we concatenate all sequences
    Log.log("    Find inputs for the selected statement");
    
    Sequence concatSeq = Sequence.concatenate(sequences.sequences);
    //Figure out input variables
    List<Variable> inputs = new ArrayList<Variable>();
    for(Integer oneinput : sequences.variables) {
      Variable v = concatSeq.getVariable(oneinput);
      inputs.add(v);
    }
    Sequence newSequence = concatSeq.extend(statement, inputs);
    
    //no repeat here XXX    
    //if the sequence size is too big or already been created
    if(newSequence.size() > GenInputsAbstract.maxsize) {
      stats.statStatementToBig(statement);
      Log.log("    ignore new sequence size too large: " + newSequence.size());
      return null;
    }
    super.randoopConsistencyTests(newSequence);    
    if(this.allSequences.contains(newSequence)) {
//      this.allSequences.remove(newSequence);
//      this.allSequences.add(newSequence);
      stats.statStatementRepeated(statement);
      Log.log("    though new sequence is repeated as previously created one. we do not ignore.");
//      return null;
      ExecutableSequence eSeq = new ExecutableSequence(newSequence);
      return new Pair<ExecutableSequence, Transition>(eSeq, selectedTransition);
    } 
    
    //add to the all sequence set
    this.allSequences.add(newSequence); 
    for(Sequence s : sequences.sequences) {
      s.lastTimeUsed = java.lang.System.currentTimeMillis();
    }    
    //check and update the statistics
    super.randoopConsistencyTest2(newSequence);    
    stats.statStatementNotDiscarded(statement);
    //FIXME stats.checkStatsConsistent();
    //add its sub-sequence to subsumed sequence set
    for(Sequence is : sequences.sequences) {
      subsumed_sequences.add(is);
    }    
    //success in creating a sequence!
    ExecutableSequence eSeq = new ExecutableSequence(newSequence);    
    Log.log("    return eseq and transition from root " + selectedTransition.toSignature());
    
    return new Pair<ExecutableSequence, Transition>(eSeq, selectedTransition); 
  }
  
  
  /**
   * Randomly picks up a transition from root
   * */
  private Transition nextRandomTransitionFromRoot() {
    Log.log("Generating sequence from root");
    if(this.modelSequences.isEmptyClassModel()) {
      Log.log("Empty modes, we return!");
      return null;
    }
    //first, randomly pick up a class model
    Transition selectedTransition = this.modelSequences.nextRandomTransitionFromRoot();
    //try several times
    int numOfTry = 0;
    while(!this.isTransitionVisible(selectedTransition) && (numOfTry ++) < max_tries_for_new_sequence) {
      selectedTransition = this.modelSequences.nextRandomTransitionFromRoot();
    }
    if(selectedTransition == null) {
      Log.log("    fail to pick up a non-null transition from root");
      return null;
    }
    //return null if it is not visible
    if(!selectedTransition.isPublicTransition()) {
      Log.log("    fail to pick up a visible transition from root");
      return null;
    } else {
      Log.log("   success in pick up a visible transition from root (the owner class might not be public): "
          + selectedTransition.toSignature());
      if(!selectedTransition.isOwnerClassPublic()) {
        Log.log("   the owner class is not public: " + selectedTransition.getOwnerClass());
        return null;
      }
      Log.log("the owner is public, transition is public? " + selectedTransition.isPublicTransition());
      return selectedTransition;
    }
  }
  
  /**
   * Generates sequence from extending the existing one
   * */
  private Pair<ExecutableSequence, Transition> extendAnExistingSequence() {
    Log.log("Extending an existing sequence");    
    Pair<Sequence,Transition> seqTransPair = this.modelSequences.nextRandomSequenceToExtend();
    if(seqTransPair == null) {
      return null;
    }
    
    Sequence baseSequence = seqTransPair.a;
    Transition extendTransition = seqTransPair.b;
    
    PalusUtil.checkNull(baseSequence, "The base sequence could not be null.");
    PalusUtil.checkNull(extendTransition, "The transition to extend could not be null.");
    
    StatementKind statement = this.selectStatement(extendTransition);
    
    Log.log("    in extension Select a transition: " + extendTransition + ", transition id:" + extendTransition.getTransitionID());    
    if(statement == null) {
      //there could be many possibilities, e.g. abstract type, void type, declaring class unvisibile, etc.
      if(Reflection.isVisible(extendTransition.getOutputType())) {
//          throw new BugInPalusException("The statement in transition: "
//              + extendTransition.toSignature() + " is null!");
        Log.log("Statement is null: " + extendTransition);
          return null;
      } else {
        //the bug in randoop, need to remove it
        return null;
      }
    }    
    Log.log("    selected statement: " + statement.toParseableString());
    
    //start to extend it
    //problematic  XXX did not use the previous one
    InputsAndSuccessFlag sequences
        = inputSelector.selectInputsForExtend(baseSequence, statement, extendTransition, components, this); 
      
    if(!sequences.success) {
      Log.log("    can not selected inputs for statement");
      stats.statStatementNoArgs(statement);
      return null;
    }
    
    //FIXME here
    Sequence concatSeq = Sequence.concatenate(sequences.sequences);    
    //figure out input variables
    List<Variable> inputs = new ArrayList<Variable>();
    for(Integer oneinput : sequences.variables) {
      Variable v = concatSeq.getVariable(oneinput);
      inputs.add(v);
    }
    
    Sequence newSequence = concatSeq.extend(statement, inputs);    
    if(newSequence.size() > GenInputsAbstract.maxsize) {
      stats.statStatementToBig(statement);
      Log.log("    ignore new sequence too long: " + newSequence.size());
      return null;
    }    
    super.randoopConsistencyTests(newSequence);
    //XXX did not check redundant here
//    if(this.allSequences.contains(newSequence)) {
//      stats.statStatementRepeated(statement);
//      Log.log("    repeated statement, ignore");
//      return null;
//    }    
    this.allSequences.add(newSequence);    
    for(Sequence s : sequences.sequences) {
      s.lastTimeUsed = java.lang.System.currentTimeMillis();
    }    
    super.randoopConsistencyTest2(newSequence);    
    stats.statStatementNotDiscarded(statement);
    //XXXFIXME stats.checkStatsConsistent();    
    for(Sequence is : sequences.sequences) {
      this.subsumed_sequences.add(is);
    }
    
    ExecutableSequence eSeq = new ExecutableSequence(newSequence);    
    Log.log("    return eseq and transition from extending, " + extendTransition.toSignature());
    
    return new Pair<ExecutableSequence, Transition>(eSeq, extendTransition);
  }
  
  /***
   * A method which roughly estimate whether the random generation phase should end or not
   * */
  private boolean randomGenerationStop() {
    
    if(!this.random_gen_timer_before.isRunning()) {
      return true;
    }
    
    long elapsedTime = this.random_gen_timer_before.getTimeElapsedMillis();
    if(elapsedTime > this.timeMillis * percentage_of_random_gen) {
      System.out.println("Finishing random generation phase.");
      this.random_gen_timer_before.stopTiming();
      return true;
    } else {
      return false;
    }
  }
  
  /**
   * Should the generator starts random generation.
   * */
  private boolean randomGenerationStart() {
    if((!this.random_gen_timer_after.isRunning())) {
      return false;
    }
    long elapsedTime = this.random_gen_timer_after.getTimeElapsedMillis();
    if(elapsedTime > this.timeMillis * (1- percentage_of_random_gen)) {
      //System.out.println("Start random generation phase.");
      //this.random_gen_timer_after.stopTiming();
      return true;
    } else {
      return false;
    }
  }
  
  /**
   * Prints out model coverage information.
   * */
  public String reportOnModelCoverage() {
    return this.modelSequences.getSequenceStats().reportOnCoverage();
  }
  
  /**
   * Filter all model uncovered method statement 
   **/
  private List<StatementKind> getModelUncoveredStatements(List<StatementKind> statements,
      Map<Class<?>, ClassModel> model) {
    List<StatementKind> uncovered = new LinkedList<StatementKind>();
    Set<Class<?>> modelledClasses = model.keySet();
    for(StatementKind statement : statements) {
      Class<?> declaringClass = PalusUtil.getDeclaringClass(statement);
      PalusUtil.checkTrue(declaringClass != null, "The declaring class for statement: "
          + statement + " should not be null.");
      if(!modelledClasses.contains(declaringClass)) {
        uncovered.add(statement);
      }
    }
    return uncovered;
  }
  
  /**
   * Check whether a transition is visible or not
   * */
  private boolean isTransitionVisible(Transition t) {
    if(t == null) {
      return false;
    }
    return t.isPublicTransition();
  }
  
  /**
   * Fetch the statement from transition
   * */
  private StatementKind selectStatement(Transition transition) {
    for(StatementKind statement : this.statements) {
      if(statement instanceof RConstructor && transition.isConstructor()) {
         RConstructor constructor = (RConstructor)statement;
         if(constructor.getConstructor().toGenericString().equals(transition.getConstructor().toGenericString())) {
           return statement;
         }
      }
      if(statement instanceof RMethod && transition.isMethod()) {
        RMethod method = (RMethod)statement;
        if(method.getMethod().toGenericString().equals(transition.getMethod().toGenericString())) {
          return statement;
        }
      }
    }
    //did not find
    return null;
  }
  
  /**
   * Random sequence generation
   * */
  private ExecutableSequence randomSequenceForStatements(List<StatementKind> statements) {
    
    long startTime = System.nanoTime();
    SequenceGeneratorStats.steps++;
    
    if(components.size() % GenInputsAbstract.clear == 0) {
      components.clear();
    }
    ExecutableSequence eSeq = randomCreateSeqStatements(statements/*this.modelUncovered*/);
    
    //create here FIXME
    if(eSeq == null) {
      return null;
    }
    
    SequenceGeneratorStats.currSeq = eSeq.sequence;
    long endTime = System.nanoTime();
    long genTime = endTime - startTime;
    startTime = endTime;
    
    eSeq.execute(this.executionVisitor);
    
    endTime = System.nanoTime();
    
    eSeq.exectime = endTime - startTime;
    startTime = endTime;
    
    super.processSequence(eSeq);
    if(eSeq.sequence.hasActiveFlags()) {
      components.add(eSeq.sequence);
    }
    
    endTime = System.nanoTime();
    genTime += endTime - startTime;
    eSeq.gentime = genTime;
    
    
    return eSeq;
  }
  
  
  /**
   * Creates executable sequence for uncovered statements
   * XXX the following code is highly redundant!
   * */
  private ExecutableSequence randomCreateSeqStatements(List<StatementKind> statementCandidates) {
    StatementKind statement = null;
    
    if(statementCandidates.isEmpty()) {
      return null;
    }
    
    statement = Randomness.randomMember(statementCandidates);
    
    stats.statStatementSelected(statement);
    //pure random selection
    InputsAndSuccessFlag sequences = super.selectInputs(statement, this.components);
    
    if(!sequences.success) {
      return null;
    }
    
    int[] seqlengths = new int[sequences.sequences.size()];
    for(int i = 0; i < sequences.sequences.size(); i++) {
      Sequence oneseq = sequences.sequences.get(i);
      PalusUtil.checkTrue(oneseq.size() > 0, "The sequence size should > 0.");
      seqlengths[i] = oneseq.size();
    }
    
    Sequence concatSeq = Sequence.concatenate(sequences.sequences);
    
    List<Variable> inputs = new ArrayList<Variable>();
    for(Integer oneinput : sequences.variables) {
      Variable v = concatSeq.getVariable(oneinput);
      inputs.add(v);
    }
    
    Sequence newSequence = concatSeq.extend(statement, inputs);
    if(GenInputsAbstract.repeat_heuristic && Randomness.nextRandomInt(10) == 0) {
      int times = Randomness.nextRandomInt(10);
      newSequence = newSequence.repeatLast(times);
    }
    
    if(newSequence.size() > GenInputsAbstract.maxsize) {
      stats.statStatementToBig(statement);
      return null;
    }
    
    super.randoopConsistencyTests(newSequence);
    
    if(this.allSequences.contains(newSequence)) {
      stats.statStatementRepeated(statement);
      return null;
    }
    
    for(Sequence s : sequences.sequences) {
      s.lastTimeUsed = java.lang.System.currentTimeMillis();
    }
    
    super.randoopConsistencyTest2(newSequence);
    
    stats.statStatementNotDiscarded(statement);
    
    //FIXME did not check statistics
    
    for(Sequence is : sequences.sequences) {
      this.subsumed_sequences.add(is);
    }
    
    return new ExecutableSequence(newSequence);
  }
  
  /**
   * Gets sequences from the map for particular ModelNode
   * 
   * This method is used by {@link MethodInputSelector}
   * */
  List<Sequence> getSequenceFromModelSequence(ModelNode node) {
    Map<ModelNode, List<Sequence>> nodeSequences = this.modelSequences.getSequenceMap(node.getModelledClass());
    if(nodeSequences == null) {
      Log.log("There is no model node sequence for class: " + node.getModelledClass());
      return null;
    }
    List<Sequence> sequences = nodeSequences.get(node);
    return sequences;
  }
}
