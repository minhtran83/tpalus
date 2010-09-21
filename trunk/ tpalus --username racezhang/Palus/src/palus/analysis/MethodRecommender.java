// Copyright 2010 Google Inc. All Rights Reserved.

package palus.analysis;

import palus.PalusUtil;
import randoop.StatementKind;
import randoop.util.Randomness;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The class for recommending a set of related method after static analysis
 * 
 * @author saizhang@google.com (Sai Zhang)
 */
public class MethodRecommender {
  /**
   * Uses tf idf algorithm for computing dependence or not
   * */
  public static boolean use_tf_idf = false;
  
  /**
   * A structure for saving all computed method dependence relations.
   * */
  private final MethodRelations relations;
  
  /**
   * Default constructor.
   * */
  public MethodRecommender(Collection<Class<?>> classes) {
    PalusUtil.checkNull(classes, "The class collection given to the method recommender "
        + "could not be null!");
    relations = new MethodRelations(classes);
    //this.buildDependence();
  }
  
  /**
   * Computes the method dependence relations.
   * */
  public void buildDependence(List<StatementKind> models) {
    try {
      relations.buildRelations(models);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
  
  /**
   * Returns a collection of related methods for a given {@code method}.
   * */
  public Collection<Method> recommend(Method method) {
    return relations.getRelatedMethods(method);
  }
  
  /**
   * Returns a collection of related StatementKind for a given {@code statement}.
   * */
  public Collection<StatementKind> recommend(StatementKind statement) {
    return relations.getRelatedStatements(statement);
  }
  
  /**
   * Returns all  methods for a given class {@code clz}.
   * */
  public Collection<StatementKind> recommendAll(Class<?> clz) {
    Map<StatementKind, List<StatementKind>> statementMap
      = this.relations.statementDependences.get(clz);
    if(statementMap == null) {
      return new LinkedList<StatementKind>();
    }
    return statementMap.keySet();
  }
  
  /**
   * Randomly returns a method from a given class {@code clz}.
   * */
  public StatementKind randomRecommend(Class<?> clz) {
    Map<StatementKind, List<StatementKind>> statementMap
        = this.relations.statementDependences.get(clz);
    if(statementMap == null) {
      return null;
    }
    Set<StatementKind> set = statementMap.keySet();
    return Randomness.randomSetMember(set);
  }
  
  /**
   * Dumps out the contents.
   * */
  public String showDependence() {
    return this.relations.showDependence();
  }
  
  /**
   * A simple test driver.
   * */
  public static void main(String[] args) {
    List<Class<?>> list = new LinkedList<Class<?>>();
    list.add(java.util.Vector.class);
    MethodRecommender recommender = new MethodRecommender(list);
    //recommender.buildDependence();
    //System.out.println(recommender.relations.showFieldReadWrites());
  }
}