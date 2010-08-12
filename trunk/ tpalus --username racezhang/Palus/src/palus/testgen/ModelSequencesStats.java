// Copyright 2010 Google Inc. All Rights Reserved.

package palus.testgen;

import palus.model.ClassModel;
import palus.model.ModelNode;
import palus.model.Transition;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author saizhang@google.com (Your Name Here)
 *
 */
public class ModelSequencesStats {
  
  private final Map<Class<?>, ClassModel> models;
  
  //keep track of the number of model node / model transition
  //being covered by the generated sequence
  private final Map<Class<?>, Map<ModelNode, Integer>> nodeCoverage =
    new LinkedHashMap<Class<?>, Map<ModelNode, Integer>>();
  
  private final Map<Class<?>, Map<Transition, Integer>> transitionCoverage =
    new LinkedHashMap<Class<?>, Map<Transition, Integer>>();
  
  private final Map<Class<?>, Map<Transition, Integer>> executedTransitionCoverage =
    new LinkedHashMap<Class<?>, Map<Transition, Integer>>();
  
  ModelSequencesStats(Map<Class<?>, ClassModel> models) {
    this.models = models;
  }
  
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
  }
  
  void incrTransitionCoverage(Class<?> clazz, Transition transition) {
    this.updateTransitionMap(transitionCoverage, clazz, transition);
  }
  
  void incrExecutedTransitionCoverage(Class<?> clazz, Transition transition) {
    this.updateTransitionMap(executedTransitionCoverage, clazz, transition);
  }
  
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
  
  public String reportOnCoverage() {
    StringBuilder sb = new StringBuilder();
    
    sb.append("There are totally " + this.models.size() + " class models");
    sb.append("\n");
    
    for(Entry<Class<?>, ClassModel> entry : this.models.entrySet()) {
      Class<?> clazz = entry.getKey();
      ClassModel model = entry.getValue();
      sb.append("Class model for: " + clazz.getName());
      sb.append("\n");
      sb.append("   total node num: " + model.getAllNodes().size() + "\n");
      sb.append("   total transition num: " + model.getAllTransitions().size() + "\n");
      sb.append("   total decoration num: " + model.getDecorationNum() + "\n");
      if(this.nodeCoverage.get(clazz) == null) {
        sb.append("    no node has been selected!\n");
      } else {
        sb.append("   selected node num: " + this.nodeCoverage.get(clazz).size() + "\n");
        sb.append("      for each selected node, " + this.computeMinMaxAndAverage(this.nodeCoverage.get(clazz).values()) + "\n");
      }
      
      if(this.transitionCoverage.get(clazz) == null) {
        sb.append("    no transition has been selected!\n");
      } else {
        sb.append("   selected transition num: " + this.transitionCoverage.get(clazz).size() + "\n");
        sb.append("      for each selected transition, " + this.computeMinMaxAndAverage(this.transitionCoverage.get(clazz).values()) + "\n");
      }
      
      if(this.executedTransitionCoverage.get(clazz) == null) {
        sb.append("    no transition has been executed!\n");
      } else {
        sb.append("   executed transition num: " + this.executedTransitionCoverage.get(clazz).size() + "\n");
        sb.append("      for each executed transition, " + this.computeMinMaxAndAverage(this.executedTransitionCoverage.get(clazz).values()) + "\n");
      }
    }
    
    return sb.toString();
  }
  
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
