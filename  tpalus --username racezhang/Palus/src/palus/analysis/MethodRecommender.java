// Copyright 2010 Google Inc. All Rights Reserved.

package palus.analysis;

import palus.PalusUtil;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;

/**
 * @author saizhang@google.com (Your Name Here)
 *
 */
public class MethodRecommender {
  
  private final MethodRelations relations;
  
  public MethodRecommender(List<Class<?>> classes) {
    PalusUtil.checkNull(classes);
    relations = new MethodRelations(classes);
  }
  
  public void buildDependence() {
    try {
      relations.buildRelations();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
  
  public List<Method> recommend(Method method) {
    return relations.getRelatedMethods(method);
  }
  
  
  
  public static void main(String[] args) {
    List<Class<?>> list = new LinkedList<Class<?>>();
    list.add(java.util.Vector.class);
    MethodRecommender recommender = new MethodRecommender(list);
    recommender.buildDependence();
    System.out.println(recommender.relations.showFieldReadWrites());
  }
}
