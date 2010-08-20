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
  
  public static boolean use_tf_idf = false;
  
  private final MethodRelations relations;
  
  public MethodRecommender(Collection<Class<?>> classes) {
    PalusUtil.checkNull(classes);
    relations = new MethodRelations(classes);
    //this.buildDependence();
  }
  
  public void buildDependence(List<StatementKind> models) {
    try {
      relations.buildRelations(models);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
  
  public Collection<Method> recommend(Method method) {
    return relations.getRelatedMethods(method);
  }
  
  public Collection<StatementKind> recommend(StatementKind statement) {
    return relations.getRelatedStatements(statement);
  }
  
  public Collection<StatementKind> recommendAll(Class<?> clz) {
    Map<StatementKind, List<StatementKind>> statementMap
      = this.relations.statementDependences.get(clz);
    if(statementMap == null) {
      return new LinkedList<StatementKind>();
    }
    return statementMap.keySet();
  }
  
  public StatementKind randomRecommend(Class<?> clz) {
    Map<StatementKind, List<StatementKind>> statementMap
        = this.relations.statementDependences.get(clz);
    if(statementMap == null) {
      return null;
    }
    Set<StatementKind> set = statementMap.keySet();
    return Randomness.randomSetMember(set);
  }
  
  public String showDependence() {
    return this.relations.showDependence();
  }
  
  public static void main(String[] args) {
    List<Class<?>> list = new LinkedList<Class<?>>();
    list.add(java.util.Vector.class);
    MethodRecommender recommender = new MethodRecommender(list);
    //recommender.buildDependence();
    //System.out.println(recommender.relations.showFieldReadWrites());
  }
}