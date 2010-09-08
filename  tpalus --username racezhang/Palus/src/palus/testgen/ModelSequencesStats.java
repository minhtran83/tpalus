// Copyright 2010 Google Inc. All Rights Reserved.

package palus.testgen;

import palus.model.ClassModel;
import palus.model.ModelNode;
import palus.model.Transition;
import randoop.Globals;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Keeps the statistics of current model node, transition selection frequency,
 * as well as the number successfully executed transitions.
 * 
 * @author saizhang@google.com (Sai Zhang)
 *
 */
public class ModelSequencesStats {
  /**
   * A feedback flag indicating whether the model-based generation should stop
   * or not. The criteria is based on the coverage of provided models.
   * */
  static boolean stop_model_based_generation = false;
  
  /**
   * The time interval beyond which the mode-based test generation should stop,
   * if the model coverage does not increase any more.
   * */
  public static long time_interval_to_stop = 6000;
  
  /**
   * A set of provided class models.
   * */
  private final Map<Class<?>, ClassModel> models;
  
  /**
   * The frequency of model node coverage for each class.
   * */
  private final Map<Class<?>, Map<ModelNode, Integer>> nodeCoverage =
    new LinkedHashMap<Class<?>, Map<ModelNode, Integer>>();
  
  /**
   * The frequency of model transition coverage for each class.
   * */
  private final Map<Class<?>, Map<Transition, Integer>> transitionCoverage =
    new LinkedHashMap<Class<?>, Map<Transition, Integer>>();
  
  /**
   * The frequency of model transition been successfully executed by generated sequences.
   * It is different from {@link #transitionCoverage}. {@link #transitionCoverage}
   * represents the frequency of a transition been selected as a sequence extension
   * candidate. That could be fail when executing the constructed sequence.
   * */
  private final Map<Class<?>, Map<Transition, Integer>> executedTransitionCoverage =
    new LinkedHashMap<Class<?>, Map<Transition, Integer>>();
  
  
  /**
   * The number of selection from root
   * */
  private int root_count = 0;
  
  /**
   * The number of extending an existing sequence
   * */
  private int ext_count = 0;
  
  /**
   * Should the tool automatically switch to random testing?
   * */
  private final boolean auto_switch;

  /**
   * The total num of selected model node for test generation.
   * */
  private int selected_model_node = 0;
  /**
   * The total num of selected model edge for test generation
   * */
  private int selected_model_edge = 0;
  /**
   * The total num of correctly executed model edge for test generation
   * */
  private int executed_model_edge = 0;
  /**
   * The latest time stamp which the model coverage changes
   * */
  private long last_update_time = 0;
  
  /**
   * A package visible constructor.
   * */
  ModelSequencesStats(Map<Class<?>, ClassModel> models) {
    this.models = models;
    //the auto switch
    auto_switch = ModelBasedGenerator.auto_switch_to_random_test;
  }
  
  /**
   * Increases the frequency of root node selection.
   * */
  void incrRootCount() {
    this.root_count++;
  }
  
  /**
   * Increases the frequency of model node extension.
   * */
  void incrExtCount() {
    this.ext_count++;
  }
  
  /**
   * Increases the selection frequency of a given model node.
   * */
  void incrModelNodeCoverage(Class<?> clazz, ModelNode node) {
    if(!nodeCoverage.containsKey(clazz)) {
      nodeCoverage.put(clazz, new LinkedHashMap<ModelNode, Integer>());
    }
    Map<ModelNode, Integer> nodeMap = nodeCoverage.get(clazz);
    if(!nodeMap.containsKey(node)) {
      nodeMap.put(node, 0);
    }
    //replace it by a new value
    nodeMap.put(node, 1 + nodeMap.get(node));
    
    //check whether the model-based generation should stop
    this.checkModelCoverage();
  }
  
  /**
   * Increases the selection frequency of a given transition.
   * */
  void incrTransitionCoverage(Class<?> clazz, Transition transition) {
    this.updateTransitionMap(transitionCoverage, clazz, transition);
    
  //check whether the model-based generation should stop
    this.checkModelCoverage();
  }
  
  /**
   * Increases the execution frequency of a given model transition.
   * */
  void incrExecutedTransitionCoverage(Class<?> clazz, Transition transition) {
    this.updateTransitionMap(executedTransitionCoverage, clazz, transition);
    
  //check whether the model-based generation should stop
    this.checkModelCoverage();
  }
  
  /**
   * Internal method for updating the coverage map.
   * */
  private void updateTransitionMap(Map<Class<?>, Map<Transition, Integer>> transitionMap,
      Class<?> clazz, Transition transition) {
    if(!transitionMap.containsKey(clazz)) {
      transitionMap.put(clazz, new LinkedHashMap<Transition, Integer>());
    }
    Map<Transition, Integer> transMap = transitionMap.get(clazz);
    if(!transMap.containsKey(transition)) {
      transMap.put(transition, 0);
    }
    //replace it with a new value
    transMap.put(transition, 1 + transMap.get(transition));
  }
  
  /**
   * Prints a snapshot report on the chosen transitions.
   * */
  String snapShotOnChosenTransition() {
    StringBuilder sb = new StringBuilder();
    
    sb.append("---------------start of chosen transition snapshot---------------" + Globals.lineSep);
    sb.append("Count from root selection: " + this.root_count + Globals.lineSep);
    sb.append("Count from extension: " + this.ext_count + Globals.lineSep);
    for(Entry<Class<?>, Map<Transition, Integer>> entry : transitionCoverage.entrySet()) {
      sb.append("Model for Class: " + entry.getKey().getName() +  Globals.lineSep);
      Map<Transition, Integer> tranNums = entry.getValue();
      sb.append("    the selection frequencey for transitions: ");
      for(Transition t : tranNums.keySet()) {
        sb.append("   " + t.getTransitionID() + " : " + tranNums.get(t));
      }
      sb.append(Globals.lineSep);
    }
    
    sb.append("===============end of chosen transition snapshot=================");
    
    return sb.toString();
  }
  
  /**
   * Prints the final model coveage report.
   * */
  String reportOnCoverage() {
    StringBuilder sb = new StringBuilder();
    
    sb.append("There are totally " + this.models.size() + " class models");
    sb.append(Globals.lineSep);
    
    for(Entry<Class<?>, ClassModel> entry : this.models.entrySet()) {
      Class<?> clazz = entry.getKey();
      ClassModel model = entry.getValue();
      sb.append("Class model for: " + clazz.getName());
      sb.append(Globals.lineSep);
      sb.append("   total node num: " + model.getAllNodes().size() + Globals.lineSep);
      sb.append("   total transition num: " + model.getAllTransitions().size() + Globals.lineSep);
      sb.append("   total decoration num: " + model.getDecorationNum() + Globals.lineSep);
      if(this.nodeCoverage.get(clazz) == null) {
        sb.append("    no node has been selected!" + Globals.lineSep);
      } else {
        sb.append("   selected node num: " + this.nodeCoverage.get(clazz).size() + Globals.lineSep);
        sb.append("      for each selected node, " + this.computeMinMaxAndAverage(this.nodeCoverage.get(clazz).values()) + Globals.lineSep);
      }
      
      if(this.transitionCoverage.get(clazz) == null) {
        sb.append("    no transition has been selected!" + Globals.lineSep);
      } else {
        sb.append("   selected transition num: " + this.transitionCoverage.get(clazz).size() + Globals.lineSep);
        sb.append("      for each selected transition, " + this.computeMinMaxAndAverage(this.transitionCoverage.get(clazz).values()) + Globals.lineSep);
      }
      
      if(this.executedTransitionCoverage.get(clazz) == null) {
        sb.append("    no transition has been executed!" + Globals.lineSep);
      } else {
        sb.append("   executed transition num: " + this.executedTransitionCoverage.get(clazz).size() + Globals.lineSep);
        sb.append("      for each executed transition, " + this.computeMinMaxAndAverage(this.executedTransitionCoverage.get(clazz).values()) + Globals.lineSep);
      }
    }
    
    return sb.toString();
  }
  
  /**
   * Checks and updats the model coverage, if something changes.
   * */
  void checkModelCoverage() {
    //System.out.println("check coverage");
    if(!auto_switch) {
      //System.out.println("not auto switched!");
      return;
    }
    
    int total_node = 0;
    for(Map<ModelNode, Integer> nodeMap : this.nodeCoverage.values()) {
      total_node = total_node + nodeMap.size();
    }
    int total_edge = 0;
    for(Map<Transition, Integer> transMap : this.transitionCoverage.values()) {
      total_edge = total_edge + transMap.size();
    }
    int total_exec = 0;
    for(Map<Transition, Integer> execMap : this.executedTransitionCoverage.values()) {
      total_exec = total_exec + execMap.size();
    }
    //see the update
    if(this.last_update_time == 0) {
      this.last_update_time = System.currentTimeMillis();
      this.selected_model_node = total_node;
      this.selected_model_edge = total_edge;
      this.executed_model_edge = total_exec;
    } else {
      if(total_node != this.selected_model_node || total_edge != this.selected_model_edge
          || total_exec != this.executed_model_edge) {
        this.last_update_time = System.currentTimeMillis();
        this.selected_model_node = total_node;
        this.selected_model_edge = total_edge;
        this.executed_model_edge = total_exec;
        //System.out.println("changed?");
      } else {
        long currentMill = System.currentTimeMillis();
        if(currentMill - this.last_update_time > time_interval_to_stop) {
          //stop model based generation
          stop_model_based_generation = true;
          //System.err.println("Switch back to random test generation.");
          //throw new Error("start random generation");
        }
      }
    }
  }
  
  /**
   * Computes min, max, and average values in an int collection, and converts
   * then to a string list.
   * */
  private String computeMinMaxAndAverage(Collection<Integer> statistic) {
    Integer max = Collections.max(statistic);
    Integer min = Collections.min(statistic);
    int total = 0;
    for(int num : statistic) {
      total += num;
    }
    float avg = 0.0f;
    if(!statistic.isEmpty()) {
      avg = ((float)total)/statistic.size();
    }
    return "max: " + max + ",   min: " + min + ",  average: " + avg;
  }
}
