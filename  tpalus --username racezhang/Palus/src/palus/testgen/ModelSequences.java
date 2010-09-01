// Copyright 2010 Google Inc. All Rights Reserved.

package palus.testgen;

import palus.Log;
import palus.PalusUtil;
import palus.model.ClassModel;
import palus.model.ModelNode;
import palus.model.Transition;
import plume.Pair;
import randoop.Globals;
import randoop.Sequence;
import randoop.util.Randomness;
import randoop.util.Reflection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author saizhang@google.com (Your Name Here)
 *
 * This class keeps history of all generated sequence, and maps them to  the
 * built model
 */
public class ModelSequences {

  /**
   * Some configurable options of this repository
   * */
  public static boolean removeExtendedSequence = true;
  //not purely randomly select a transition for extension
  public static boolean adaptiveSelectTransition = false;
  
  /**
   * the built model
   * */
  private final Map<Class<?>, ClassModel> models;
  
  /**
   * the sequence which maps ModelNode to the sequence
   * */
  private final Map<Class<?>, Map<ModelNode, List<Sequence>>> modelSequences;
  
  /**
   * Keep the statistics of which model node has been covered, and how many times.
   * Also keep track of which (and how many) transitions have been covered.
   * */
  private final ModelSequencesStats stats;
  
  /**
   * The internal state for keep which sequence has been returned for extension
   * */
  private Sequence currSequence = null;
  
  /**
   * The default constructor
   * */
  public ModelSequences(Map<Class<?>, ClassModel> models) {
    PalusUtil.checkNull(models);
    this.models = models;
    this.modelSequences = new LinkedHashMap<Class<?>, Map<ModelNode, List<Sequence>>>();
    this.stats = new ModelSequencesStats(models);
  }
  
  /**
   * Indicate whether the current model is an empty one
   * */
  public boolean isEmptyClassModel() {
    return this.models.isEmpty();
  }
  
  public int size() {
    return this.modelSequences.size();
  }
  
  /**
   * Get the statistic data
   * */
  public ModelSequencesStats getSequenceStats() {
    return this.stats;
  }
  
  /**
   * Indicate whether there are sequences already generated for extension
   * */
  public boolean hasNoSequenceToExtend() {
    return this.modelSequences.isEmpty();
  }
  
  public Map<ModelNode, List<Sequence>> getSequenceMap(Class<?> clazz) {
    PalusUtil.checkNull(clazz);
    return this.modelSequences.get(clazz);
  }
  
  /**
   * Pick up a transition from the model root randomly
   * */
  public Transition nextRandomTransitionFromRoot() {
    if(this.isEmptyClassModel()) {
      return null;
    }
    //how many class models we have
    int numOfModels = this.models.size();
    Set<Class<?>> allClasses = this.models.keySet();
    Class<?> clazz = new LinkedList<Class<?>>(allClasses).get(Randomness.nextRandomInt(numOfModels));
    //check the visibility of the class
    if(!Reflection.isVisible(clazz)) {
      Log.log("Warning! The class which current Model represents:, " + clazz + " is not visible.");
      return null;
    }
    //get the current class model
    ClassModel classModel = this.models.get(clazz);
    
    //double check the consistence of selected model
    PalusUtil.checkNull(classModel);
    PalusUtil.checkNull(classModel.getRoot());
    
    //get the root, and randomly pick up a root transition
    ModelNode root = classModel.getRoot();
    List<Transition> transitions = root.getAllOutgoingEdges();
    if(transitions.isEmpty()) {
      Log.log("The model is empty for: " + classModel.getModelledClass());
      return null;
    }
    
    Transition transition = transitions.get(Randomness.nextRandomInt(transitions.size()));
    
    //update the statistic
    this.stats.incrRootCount();
    this.stats.incrModelNodeCoverage(clazz, root);
    this.stats.incrTransitionCoverage(clazz, transition);
    
    return transition;
  }
  
  /**
   * Pick up a transition to extend from the already generated model sequence 
   * */
  public Pair<Sequence, Transition> nextRandomSequenceToExtend() {
    if(this.hasNoSequenceToExtend()) {
      Log.log("   there is no sequence generated. No transition for extension.");
      return null;
    }
    
    //the number of corresponding models of generated sequence
    int numOfCoveredModels = this.modelSequences.keySet().size();
    //all classes whose model has been covered
    List<Class<?>> allClasses = new ArrayList<Class<?>>(this.modelSequences.keySet());
    Class<?> modelClass = allClasses.get(Randomness.nextRandomInt(numOfCoveredModels));
    //get model node and its corresponding sequence list
    Map<ModelNode, List<Sequence>> nodeSequencesMap = this.modelSequences.get(modelClass);
    
    //double check
    PalusUtil.checkNull(nodeSequencesMap);
    
    //randomly pick up a start node
    int numOfModelNode = nodeSequencesMap.keySet().size();
    List<ModelNode> allNodes = new ArrayList<ModelNode>(nodeSequencesMap.keySet());
    ModelNode startNode = allNodes.get(Randomness.nextRandomInt(numOfModelNode));
    
    //double check
    PalusUtil.checkNull(startNode);
    //get the sequence list which produce the model node
    List<Sequence> seqList = nodeSequencesMap.get(startNode);
    PalusUtil.checkNull(seqList);
//    PalusUtil.checkTrue(!seqList.isEmpty());
    if(seqList.isEmpty()) {
      Log.log(" the sequence is empty. bug?");
      return null;
    }
    
    //get the base sequence, and start to extend it
    Sequence baseSequence = seqList.get(Randomness.nextRandomInt(seqList.size()));
    //pick up a transition from the startNode
    List<Transition> transitions = startNode.getAllOutgoingEdges();
    if(transitions.isEmpty()) {
      Log.log("    there is no outgoing edges for the selected ModelNode: " + startNode.getNodeId());
//      Log.log("      " + startNode.getNodeInfo());
      return null;
    }
    //get a sequence to extend
    Transition transitionToExtend = transitions.get(Randomness.nextRandomInt(transitions.size()));
    
    //save the state of selected sequence
    this.currSequence = baseSequence;
    
    //update statistic
    this.stats.incrExtCount();
    this.stats.incrModelNodeCoverage(modelClass, startNode);
    this.stats.incrTransitionCoverage(modelClass, transitionToExtend);
    
    return new Pair<Sequence, Transition>(baseSequence, transitionToExtend);
  }
  
  /**
   * Update the model sequence map after creating or extending a transition
   * @param sequence the sequence after extension
   * @param transition the transition that has been extended
   * */
  public void updateModelSequences(Sequence sequence, Transition transition) {
    //check the nullness
    PalusUtil.checkNull(sequence);
    PalusUtil.checkNull(transition);
    
    //get the source and dest nodes of the transition
    ModelNode sourceNode = transition.getSourceNode();
    ModelNode destNode = transition.getDestNode();
    Class<?> clz = transition.getModelledClass();
    
    //update the statistic
    this.stats.incrExecutedTransitionCoverage(clz, transition);
    
    //check nullness here
    PalusUtil.checkNull(sourceNode);
    PalusUtil.checkNull(destNode);
   
    //update the model sequence map according to whether it is an extended
    //transition or a newly created transition from root
    if(!sourceNode.isRootNode()) { 
      //it is an extension sequence, we need to first delete the original one
      if(!this.modelSequences.containsKey(clz)) {
        Log.log("A likely bug! There is no class: " + clz + " in the model sequences");
        return;
      }
      //get the sequence map
      Map<ModelNode, List<Sequence>> nodeSequencesMap = this.modelSequences.get(clz);
      PalusUtil.checkNull(nodeSequencesMap);
      if(!nodeSequencesMap.containsKey(sourceNode)) {
        Log.log("A likely bug! There is no source node: " + sourceNode.getNodeId()
            + " in the sequence map.");
        return;
      }
      
      if(this.currSequence != null) {
          if(removeExtendedSequence) {
              boolean removed = nodeSequencesMap.get(sourceNode).remove(this.currSequence);
              Log.log("Did we remove the current sequence: " + removed);
          } else {
            Log.log("Not plan to remove the existing sequence.");
          }
      } else {
        Log.log("High likely a bug, the current sequence is null!");
      }
      
      //add the current sequence
      if(!nodeSequencesMap.containsKey(destNode)) {
        nodeSequencesMap.put(destNode, new LinkedList<Sequence>());
      }
      nodeSequencesMap.get(destNode).add(sequence);
      
    } else {
      //It is a newly created sequence from root, and we need to add that to the
      //sequence map
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
  
  /***
   * Gets a snapshot of the current model sequence state. Dump the number of sequences
   * at each ModelNode
   * */
  public String snapshot() {
    StringBuilder sb = new StringBuilder();
    sb.append("-------------Start snapshot of current model sequence state-----------------"
        + Globals.lineSep);
    
    for(Entry<Class<?>, Map<ModelNode, List<Sequence>>> entry : modelSequences.entrySet()) {
      //get the clazz, node, and sequences
      Class<?> clazz = entry.getKey();
      Map<ModelNode, List<Sequence>> nodeSequences = entry.getValue();
      //get the corresponding class model
      ClassModel model = models.get(clazz);
      //get a snapshot of each class
      sb.append("Model for Class: " + clazz.getName() + Globals.lineSep);
      for(Entry<ModelNode, List<Sequence>> nodeEntry : nodeSequences.entrySet()) {
        ModelNode node = nodeEntry.getKey();
        List<Sequence> sequences = nodeEntry.getValue();
        sb.append("   node: " + node.getNodeId() + ": " + sequences.size() +  Globals.lineSep);
      }
      sb.append("Nodes without sequences: ");
      Set<ModelNode> allNodes = model.getAllNodes();
      Set<ModelNode> coveredNodes = nodeSequences.keySet();
      for(ModelNode node : allNodes) {
        if(!coveredNodes.contains(node)) {
          sb.append(", " + node.getNodeId());
        }
      }
      sb.append(Globals.lineSep);
    }
    
    Set<Class<?>> allClasses = models.keySet();
    Set<Class<?>> coveredClasses = modelSequences.keySet();
    if(allClasses.size() != coveredClasses.size()) {
      sb.append("Note, uncovered classes: ");
      for(Class<?> clazz : allClasses) {
        if(!coveredClasses.contains(clazz)) {
          sb.append(", " + clazz.getName());
        }
      }
    }
    sb.append(Globals.lineSep);
    sb.append("-------------End snapshot of current model sequence state__-----------------" 
        + Globals.lineSep);
    
    return sb.toString();
  }
}
