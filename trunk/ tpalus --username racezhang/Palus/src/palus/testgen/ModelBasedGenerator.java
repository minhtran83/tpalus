// Copyright 2010 Google Inc. All Rights Reserved.

package palus.testgen;

import palus.Log;
import palus.PalusUtil;
import palus.model.ClassModel;
import palus.model.ModelNode;
import palus.model.Transition;
import plume.Pair;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import randoop.ExecutableSequence;
import randoop.ForwardGenerator;
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
import randoop.util.Timer;

/**
 * @author saizhang@google.com (Your Name Here)
 *
 */
public class ModelBasedGenerator extends ForwardGenerator {

  private final Timer random_gen_timer = new Timer();
  
  public final Map<Class<?>, ClassModel> models;

  /*customizable properties*/
  //the percentage of time in filling the component with random generated tests
  public static float percentage_of_random_gen = 0.4f;
  //the percentage of create of a new object from root
  public static float ratio_start_from_root = 0.3f;
  
  //the max times in trying to generate a new root sequence
  public static int max_tries_for_new_sequence = 3;
//the max times in trying to extend an existing sequence
  public static int max_tries_for_extend_sequence = 5;
  
  //some internal data structures for keep track of the generated object state
  private final Map<Class<?>, Map<ModelNode, List<Sequence>>> modelSequences
      = new LinkedHashMap<Class<?>, Map<ModelNode, List<Sequence>>>();
  
  /**
   * The only constructor with a model parameter
   * */
  public ModelBasedGenerator(List<StatementKind> statements, List<Class<?>> covClasses,
      long timeMillis, int maxSequences, SequenceCollection seeds, Map<Class<?>, ClassModel> models) {
    super(statements, covClasses, timeMillis, maxSequences, seeds);
    PalusUtil.checkNull(models);
    this.models = models;
    
    //XXX not a correct place
    this.random_gen_timer.startTiming();
    
    System.out.println("....First generating tests randomly...");
  }
  
  
  /**
   * Make a new executable sequence each step
   * */
  @Override
  public ExecutableSequence step() {
    //we first try to generate a few sequences randomly
    if(!randomGenerationStop()) {
      return super.step();
    }
    
    long startTime = System.nanoTime();
    SequenceGeneratorStats.steps ++;
    if(this.components.size() % GenInputsAbstract.clear == 0) {
      this.components.clear();
    }
    
    ExecutableSequence eSeq = null;
    Transition tran = null;

    //generate by model
    Pair<ExecutableSequence, Transition> seqTranPair = this.generateSequenceByModel();
    if(seqTranPair == null) {
      return null;
    }
    //try to generate using model in the remaining time
    eSeq = seqTranPair.a;
    tran = seqTranPair.b;
    
    //check not null
    PalusUtil.checkNull(eSeq);
    PalusUtil.checkNull(tran);
    
    //no feedback
    if(GenInputsAbstract.dontexecute) {
      this.components.add(eSeq.sequence);
      return null;
    }
    
    //randoop detects possible hang, outputs last sequence
    //under execution
    SequenceGeneratorStats.currSeq = eSeq.sequence;
    
    long endTime = System.nanoTime();
    long genTime = endTime - startTime;
    startTime = endTime;
    
    eSeq.execute(this.executionVisitor);
    
    endTime = System.nanoTime();
    eSeq.exectime = endTime - startTime;
    startTime = endTime;
    
    this.processSequence(eSeq);
    
    if(eSeq.sequence.hasActiveFlags()) {
      components.add(eSeq.sequence);
      
      //XXX add to the state-keeping hashmap here
      this.updateModelSequenceMap(eSeq.sequence, tran);
      
      Log.log("execute pass. updated map size: " + this.modelSequences.size());
    } else {
      Log.log("executing fail: " + eSeq.toCodeString());
    }
    
    endTime = System.nanoTime();
    genTime += endTime - startTime;
    eSeq.gentime = genTime;
    
    return eSeq;
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
    boolean createNewSequence = (nextRandomNum < ((int)(percentage_of_random_gen * 10)));
    
    return createNewSequence ? this.generateSequenceFromModelRoot() : this.extendAnExistingSequence();
  }
  
  
  /**
   * generate sequence from root
   * */
  private Pair<ExecutableSequence, Transition> generateSequenceFromModelRoot() {
    
    Log.log("Generating sequence from root");
    
    int numOfModels = this.models.size();
    Set<Class<?>> classSet = this.models.keySet();
    //randomly pick up one
    Class<?> selectedClass = new LinkedList<Class<?>>(classSet).get(Randomness.nextRandomInt(numOfModels));
    ClassModel classModel = this.models.get(selectedClass);
    
    PalusUtil.checkNull(classModel);
    PalusUtil.checkNull(classModel.getRoot());
    
    ModelNode root = classModel.getRoot();
    List<Transition> transitions = root.getAllOutgoingEdges();
    
    Transition selectedTransition = transitions.get(Randomness.nextRandomInt(transitions.size()));
    //try several times
    int numOfTry = 0;
    while(!this.isTransitionVisible(selectedTransition) && (numOfTry ++) < max_tries_for_new_sequence) {
      selectedTransition = transitions.get(Randomness.nextRandomInt(transitions.size()));
    }
    //return null if it is not visible
    if(!this.isTransitionVisible(selectedTransition)) {
      Log.log("    fail to pick up a visible transition from root");
      return null;
    }
    
    //here get a valid transition sequence, so start to extend it be a full sequence
    StatementKind statement = this.selectStatement(selectedTransition);
    //it can not be null
    if(statement == null) {
      Log.log("    why statement is null? from selected transition ");
      return null;
    }
    //PalusUtil.checkNull(statement);
    
    Log.log("    Get a statement: " + statement.toParseableString());
    
    //update the statistics
    this.stats.statStatementSelected(statement);
    
    //now start to choose parameters XXX this needs to be changed
    InputsAndSuccessFlag sequences = MethodInputSelector.selectInputsForRoot(statement, selectedTransition, components, this); 
      //XXX this.selectInputs(statement, this.components);
    
    if(!sequences.success) {
      this.stats.statStatementNoArgs(statement);
      Log.log("    Fail to find inputs");
      return null;
    }
    
    Log.log("    Find inputs for the selected statement");
    //concatenate all sequences
    int[] seqlengths = new int[sequences.sequences.size()];
    for(int i = 0; i < sequences.sequences.size(); i++) {
      Sequence oneseq = sequences.sequences.get(i);
      PalusUtil.checkTrue(oneseq.size() > 0);
      seqlengths[i] = oneseq.size();
    }
    
    Sequence concatSeq = Sequence.concatenate(sequences.sequences);
    
    //Figure out input variables
    List<Variable> inputs = new ArrayList<Variable>();
    for(Integer oneinput : sequences.variables) {
      Variable v = concatSeq.getVariable(oneinput);
      inputs.add(v);
    }
    Sequence newSequence = concatSeq.extend(statement, inputs);
    
    //no repeat here XXX
    
    if(newSequence.size() > GenInputsAbstract.maxsize) {
      stats.statStatementToBig(statement);
      Log.log("    ignore new sequence size too large: " + newSequence.size());
      return null;
    }
    
    super.randoopConsistencyTests(newSequence);
    
    if(this.allSequences.contains(newSequence)) {
      stats.statStatementRepeated(statement);
      Log.log("    new sequence is repeated as previously created one. ignore.");
      return null;
    }
    
    this.allSequences.add(newSequence);
    
    for(Sequence s : sequences.sequences) {
      s.lastTimeUsed = java.lang.System.currentTimeMillis();
    }
    
    super.randoopConsistencyTest2(newSequence);
    
    stats.statStatementNotDiscarded(statement);
    stats.checkStatsConsistent();
    
    for(Sequence is : sequences.sequences) {
      subsumed_sequences.add(is);
    }
    
    ExecutableSequence eSeq = new ExecutableSequence(newSequence);
    
    Log.log("    return eseq and transition from root");
    
    return new Pair<ExecutableSequence, Transition>(eSeq, selectedTransition); 
  }
  
  /**
   * Generate sequence from extending the existing one
   * */
  private Pair<ExecutableSequence, Transition> extendAnExistingSequence() {
    
    Log.log("Extending an existing sequence");
    
    int numOfClassModel = this.modelSequences.keySet().size();
    
    if(numOfClassModel == 0) {
      Log.log("    there is no sequence for extend currently");
      return null;
    }
    
    Class<?> modelClass = new ArrayList<Class<?>>(this.modelSequences.keySet()).get(Randomness.nextRandomInt(numOfClassModel));
    
    Map<ModelNode, List<Sequence>> nodeSequencesMap = this.modelSequences.get(modelClass);
    PalusUtil.checkNull(nodeSequencesMap);
    
    int numOfModelNode = nodeSequencesMap.keySet().size();
    ModelNode startNode = new ArrayList<ModelNode>(nodeSequencesMap.keySet()).get(Randomness.nextRandomInt(numOfModelNode));
    PalusUtil.checkNull(startNode);
    
    List<Sequence> seqList = nodeSequencesMap.get(startNode);
    PalusUtil.checkNull(seqList);
    
    if(seqList.isEmpty()) {
      Log.log("    there is no sequence for the ModelNode");
      return null;
    }
    
    //get the base sequence, and start to extend it
    Sequence baseSequence = seqList.get(Randomness.nextRandomInt(seqList.size()));
    //pick up a transition from the startNode
    List<Transition> transitions = startNode.getAllOutgoingEdges();
    if(transitions.isEmpty()) {
      Log.log("    there is no outgoing edges for the selected ModelNode");
      return null;
    }
    
    Transition extendTransition = transitions.get(Randomness.nextRandomInt(transitions.size()));
    StatementKind statement = this.selectStatement(extendTransition);
    
    Log.log("    Select a transition: " + extendTransition);
    
    if(statement == null) {
      Log.log("    there is no statement in selected transition");
      return null;
    }
    
    Log.log("    selected statement: " + statement.toParseableString());
    
    //start to extend it
    //problematic  XXX did not use the previous one
    InputsAndSuccessFlag sequences = super.selectInputs(statement, this.components);
    if(!sequences.success) {
      Log.log("    can not selected inputs for statement");
      stats.statStatementNoArgs(statement);
      return null;
    }
    
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
    
    if(this.allSequences.contains(newSequence)) {
      stats.statStatementRepeated(statement);
      Log.log("    repeated statement, ignore");
      return null;
    }
    
    this.allSequences.add(newSequence);
    
    for(Sequence s : sequences.sequences) {
      s.lastTimeUsed = java.lang.System.currentTimeMillis();
    }
    
    super.randoopConsistencyTest2(newSequence);
    
    stats.statStatementNotDiscarded(statement);
    stats.checkStatsConsistent();
    
    for(Sequence is : sequences.sequences) {
      this.subsumed_sequences.add(is);
    }
    
    ExecutableSequence eSeq = new ExecutableSequence(newSequence);
    
    Log.log("    return eseq and transition from extending");
    
    return new Pair<ExecutableSequence, Transition>(eSeq, extendTransition);
  }
  
  /***
   * A method which roughly estimate whether the random generation phase should end or not
   * */
  private boolean randomGenerationStop() {
    
    if(!this.random_gen_timer.isRunning()) {
      return true;
    }
    
    long elapsedTime = this.random_gen_timer.getTimeElapsedMillis();
    if(elapsedTime > this.timeMillis * percentage_of_random_gen) {
      System.out.println("Finshing random generation phase.");
      this.random_gen_timer.stopTiming();
      return true;
    } else {
      return false;
    }
  }
  
  /**
   * Check whether a transition is visible or not
   * */
  private boolean isTransitionVisible(Transition t) {
    PalusUtil.checkNull(t);
    if(t.isConstructor()) {
      Constructor<?> con = t.getConstructor();
      PalusUtil.checkNull(con);
      return Modifier.isPublic(con.getModifiers());
    } else {
      Method method = t.getMethod();
      PalusUtil.checkNull(method);
      return Modifier.isPublic(method.getModifiers());
    }
  }
  
  /**
   * Fetch the statement from transition
   * */
  private StatementKind selectStatement(Transition transition) {
    for(StatementKind statement : this.statements) {
      if(statement instanceof RConstructor && transition.isConstructor()) {
         RConstructor constructor = (RConstructor)statement;
         //for safety, do not use == for comparison
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
    return null;
  }
  
  /**
   * When creating a sequence, we need to update the map which stores the sequence
   * and their current state
   * */
  private void updateModelSequenceMap(Sequence sequence, Transition transition) {
    ModelNode sourceNode = transition.getSourceNode();
    ModelNode destNode = transition.getDestNode();
    Class<?> clz = transition.getModelClass();
    
    //check null here
    PalusUtil.checkNull(sourceNode);
    PalusUtil.checkNull(destNode);
    
    if(!sourceNode.isRootNode()) { 
      //it is an extension sequence, we need to first delete the original one
      if(!this.modelSequences.containsKey(clz)) {
        return;
      }
      Map<ModelNode, List<Sequence>> nodeSequencesMap = this.modelSequences.get(clz);
      PalusUtil.checkNull(nodeSequencesMap);
      if(!nodeSequencesMap.containsKey(sourceNode)) {
        return;
      }
      //XXX do we need to remove here?
      //nodeSequencesMap.get(sourceNode).remove(0); //TODO remove the first?
    }
    
    //add the new state to the map
    if(!this.modelSequences.containsKey(clz)) {
      this.modelSequences.put(clz, new HashMap<ModelNode, List<Sequence>>());
    }
    Map<ModelNode, List<Sequence>> nodeSequencesMap = this.modelSequences.get(clz);
    if(!nodeSequencesMap.containsKey(destNode)) {
      nodeSequencesMap.put(destNode, new LinkedList<Sequence>());
    }
    nodeSequencesMap.get(destNode).add(sequence);
  }
}
