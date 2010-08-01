// Copyright 2010 Google Inc. All Rights Reserved.

package palus.theory;

import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import palus.PalusUtil;
import randoop.ObjectContract;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author saizhang@google.com (Your Name Here)
 *
 */
public class TheoryFinder {
  private final List<Class<?>> classList;
  
  public TheoryFinder(List<Class<?>> classList) {
    PalusUtil.checkNull(classList);
    //this.classList = classList;
    //for testing
    this.classList = this.getSampleTheoryClass();
  }
  
  public List<ObjectContract> findAllTheories() {
    //classList.getClass().get
    List<ObjectContract> contracts = new ArrayList<ObjectContract>();
    
    for(Class<?> clazz : classList) {
      RunWith annotation = clazz.getAnnotation(RunWith.class);
      if(annotation.value() != Theories.class) {
        continue;
      }
      //then iterate through each 
      Method[] methods = clazz.getDeclaredMethods();
      for(Method method : methods) {
        int modifier = method.getModifiers();
        Theory t = method.getAnnotation(Theory.class);
        if(t == null) {
          continue;
        }
        if(!Modifier.isPublic(modifier) || Modifier.isStatic(modifier)) {
          continue;
        }
        if(method.getReturnType() != void.class) {
          continue;
        }
        if(method.getParameterTypes().length == 0) {
          continue;
        }
        TheoryContract contract = new TheoryContract(method);
        contracts.add(contract);
      }
    }
    
    return contracts;
  }
  
  
  private List<Class<?>> getSampleTheoryClass() {
    List<Class<?>> retClasses = new LinkedList<Class<?>>();
    try {
      retClasses.add(Class.forName("tests.SomeTest"));
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
    return retClasses;
  }
}
