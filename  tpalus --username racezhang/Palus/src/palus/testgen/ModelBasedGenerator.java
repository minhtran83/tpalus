// Copyright 2010 Google Inc. All Rights Reserved.

package palus.testgen;

import palus.Log;
import palus.PalusUtil;
import palus.model.BugInPalusException;
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
import randoop.util.Reflection;
import randoop.util.Timer;

/**
 * @author saizhang@google.com (Your Name Here)
 *
 */
public class ModelBasedGenerator extends ForwardGenerator {

  /*customizable properties*/
  //the percentage of time in filling the component with random generated tests
  public static float percentage_of_random_gen = 0.0f;//1.0f;
  //the percentage of create of a new object from root
  public static float ratio_start_from_root = 0.3f;
  //the max times in trying to generate a new root sequence
  public static int max_tries_for_new_sequence = 3;
  //the max times in trying to extend an existing sequence
  public static int max_tries_for_extend_sequence = 5;
  //delete the extended trace ?
  public static boolean delete_extended_seq_in_model = true;

  
  //a time to record the time for random test generation
  private final Timer random_gen_timer = new Timer();
  //the model for guiding test generation
  public final Map<Class<?>, ClassModel> models;
  //some internal data structures for keep track of the generated object state
  private final Map<Class<?>, Map<ModelNode, List<Sequence>>> modelSequences
      = new LinkedHashMap<Class<?>, Map<ModelNode, List<Sequence>>>();
  //the current extended sequence
  private Sequence currentSeq = null;
  
  /**
   * The only constructor with a model parameter
   * */
  public ModelBasedGenerator(List<StatementKind> statements, List<Class<?>> covClasses,
      long timeMillis, int maxSequences, SequenceCollection seeds, Map<Class<?>, ClassModel> models) {
    super(statements, covClasses, timeMillis, maxSequences, seeds);
    PalusUtil.checkNull(models);
    this.models = models;
    
    //log the statement
    Log.log("All statements:");
    for(StatementKind statement : statements) {
      Log.log("   " + statement);
    }
    Log.log("\n\n");
    
    //FIXME not a perfect place here
    this.random_gen_timer.startTiming();
    System.out.println("\n\n....First generating tests randomly...\n\n");
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
    PalusUtil.checkNull(eSeq);
    PalusUtil.checkNull(tran);
    
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
      this.updateModelSequenceMap(eSeq.sequence, tran);      
      Log.log("execute pass. updated map size: " + this.modelSequences.size());
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
    //choose the create a new sequence or extend the existing one
    return createNewSequence ? this.generateSequenceFromModelRoot() : this.extendAnExistingSequence();
  }
  
  /**
   * Generate sequence from root
   * */
  private Pair<ExecutableSequence, Transition> generateSequenceFromModelRoot() {
    //first randomly pick up a transition from root
    Transition selectedTransition = this.pickUpTransitionFromRoot();
    if(selectedTransition == null ) {
      return null;
    }
    //When we get a valid transition sequence, so start to extend it be a full sequence
    StatementKind statement = this.selectStatement(selectedTransition);
    //it can not be null
    if(statement == null) {
      throw new BugInPalusException("The statement in transition: "
          + selectedTransition.toSignature() + " is null!");
    }
    
    Log.log("    Get a statement: " + statement.toParseableString());    
    //update the statistics
    this.stats.statStatementSelected(statement);    
    //now start to choose parameters XXX this needs to be changed
    InputsAndSuccessFlag sequences =
      MethodInputSelector.selectInputsForRoot(statement, selectedTransition, components, this); 
    
    //if we can not select desirable inputs
    if(!sequences.success) {
      this.stats.statStatementNoArgs(statement);
      Log.log("    Fail to find inputs");
      return null;
    }
    //find input, then we concatenate all sequences
    Log.log("    Find inputs for the selected statement");
    //concatenate all sequences
//    int[] seqlengths = new int[sequences.sequences.size()];
//    for(int i = 0; i < sequences.sequences.size(); i++) {
//      Sequence oneseq = sequences.sequences.get(i);
//      PalusUtil.checkTrue(oneseq.size() > 0);
//      seqlengths[i] = oneseq.size();
//    }
    
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
    Log.log("    return eseq and transition from root");
    
    return new Pair<ExecutableSequence, Transition>(eSeq, selectedTransition); 
  }
  
  
  /**
   * Randomly pick up a transition from root
   * */
  private Transition pickUpTransitionFromRoot() {
    Log.log("Generating sequence from root");    
    //first, randomly pick up a class model
    int numOfModels = this.models.size();
    Set<Class<?>> classSet = this.models.keySet();
    Class<?> selectedClass = new LinkedList<Class<?>>(classSet).get(Randomness.nextRandomInt(numOfModels));
    //check the visibility of the class
    if(!Reflection.isVisible(selectedClass)) {
      Log.log("When pick up transition from root, " + selectedClass + " is not visible.");
      return null;
    }
    
    ClassModel classModel = this.models.get(selectedClass);
    //check it is valid or it is a bug in Palus
    PalusUtil.checkNull(classModel);
    PalusUtil.checkNull(classModel.getRoot());
    
    //get the root, and randomly pick up a root transition
    ModelNode root = classModel.getRoot();
    List<Transition> transitions = root.getAllOutgoingEdges();
    Transition selectedTransition = transitions.get(Randomness.nextRandomInt(transitions.size()));
    //try several times
    int numOfTry = 0;
    while(!this.isTransitionVisible(selectedTransition) && (numOfTry ++) < max_tries_for_new_sequence) {
      selectedTransition = transitions.get(Randomness.nextRandomInt(transitions.size()));
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
   * Generate sequence from extending the existing one
   * */
  private Pair<ExecutableSequence, Transition> extendAnExistingSequence() {
    Log.log("Extending an existing sequence");    
    int numOfClassModel = this.modelSequences.keySet().size();
    if(numOfClassModel == 0) {
      Log.log("    there is no sequence for extend currently");
      return null;
    }
    
    //get a class model randomly
    List<Class<?>> allClasses = new ArrayList<Class<?>>(this.modelSequences.keySet());
    Class<?> modelClass = allClasses.get(Randomness.nextRandomInt(numOfClassModel));
    //get model node and its corresponding sequence list
    Map<ModelNode, List<Sequence>> nodeSequencesMap = this.modelSequences.get(modelClass);
    PalusUtil.checkNull(nodeSequencesMap);
    //randomly pick up a start node
    int numOfModelNode = nodeSequencesMap.keySet().size();
    List<ModelNode> allNodes = new ArrayList<ModelNode>(nodeSequencesMap.keySet());
    ModelNode startNode = allNodes.get(Randomness.nextRandomInt(numOfModelNode));
    PalusUtil.checkNull(startNode);
    //get the sequence list which preduce the model node
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
      Log.log("      " + startNode.getNodeInfo());
      return null;
    }
    //get a sequence to extend
    Transition extendTransition = transitions.get(Randomness.nextRandomInt(transitions.size()));
    StatementKind statement = this.selectStatement(extendTransition);
    
    Log.log("    in extension Select a transition: " + extendTransition);    
    if(statement == null) {
      throw new BugInPalusException("The statement in transition: "
          + extendTransition.toSignature() + " is null!");
    }    
    Log.log("    selected statement: " + statement.toParseableString());
    
    //start to extend it
    //problematic  XXX did not use the previous one
    InputsAndSuccessFlag sequences
        = MethodInputSelector.selectInputsForExtend(baseSequence, statement, extendTransition, components, this); 
      
//      super.selectInputs(statement, this.components);
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
    //XXXFIXME stats.checkStatsConsistent();    
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
      System.out.println("Finishing random generation phase.");
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
    return t.isPublicTransition();
  }
  
  /**
   * Fetch the statement from transition
   * */
  private StatementKind selectStatement(Transition transition) {
//    Log.log("\n\n");
//    Log.log("Looking for transition: " + transition.toSignature() + ", is constructor: " + transition.isConstructor());
    
    for(StatementKind statement : this.statements) {
      if(statement instanceof RConstructor && transition.isConstructor()) {
         RConstructor constructor = (RConstructor)statement;
         
         //Log.log("    - constructor: " + constructor.getConstructor().toGenericString());
         
         //for safety, do not use == for comparison
         if(constructor.getConstructor().toGenericString().equals(transition.getConstructor().toGenericString())) {
           return statement;
         }
      }
      if(statement instanceof RMethod && transition.isMethod()) {
        RMethod method = (RMethod)statement;
        
        //Log.log("    - method: " + method.getMethod().toGenericString());
        
        if(method.getMethod().toGenericString().equals(transition.getMethod().toGenericString())) {
          return statement;
        }
      }
    }
    //did not find
    return null;
  }
  
  /**
   * When creating a sequence, we need to update the map which stores the sequence
   * and their current state
   * */
  private void updateModelSequenceMap(Sequence sequence, Transition transition) {
    //get the source/dest node of the transition
    ModelNode sourceNode = transition.getSourceNode();
    ModelNode destNode = transition.getDestNode();
    Class<?> clz = transition.getModelledClass();    
    //check null here
    PalusUtil.checkNull(sourceNode);
    PalusUtil.checkNull(destNode);
   
    //update the model sequence map
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
      
      //FIXME do we need to remove here?
      //nodeSequencesMap.get(sourceNode).remove(0); //TODO remove the first?
      
      //then add it
      if(!nodeSequencesMap.containsKey(destNode)) {
        nodeSequencesMap.put(destNode, new LinkedList<Sequence>());
      }
      nodeSequencesMap.get(destNode).add(sequence);
      
    } else {
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
  
  /**
   * Get sequences from the map for particular ModelNode
   * */
  public List<Sequence> getSequenceFromModelSequence(ModelNode node) {
    Map<ModelNode, List<Sequence>> nodeSequences = this.modelSequences.get(node.getModelledClass());
    if(nodeSequences == null) {
      Log.log("There is no model node sequence for class: " + node.getModelledClass());
      return null;
    }
    List<Sequence> sequences = nodeSequences.get(node);
    return sequences;
  }
}
