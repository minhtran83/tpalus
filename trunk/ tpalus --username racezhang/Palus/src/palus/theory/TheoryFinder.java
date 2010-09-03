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
import java.util.Collection;
import java.util.List;

/**
 * A simple class to find all {@link Theory} declarations from bytecode.
 * 
 * @author saizhang@google.com (Sai Zhang)
 *
 */
public class TheoryFinder {
  /**
   * A list of classes from where to find theories
   * */
  private final Collection<Class<?>> classList;
  
  /**
   * Constructor. Initializes the class list. 
   * */
  public TheoryFinder(Collection<Class<?>> classList) {
    PalusUtil.checkNull(classList);
    //this.classList = classList;
    //for testing
    this.classList = classList;
  }
  
  /**
   * Search the method declarations in the given class list, and extract the
   * declared theories from them.
   * */
  public List<ObjectContract> findAllTheories() {
    //classList.getClass().get
    List<ObjectContract> contracts = new ArrayList<ObjectContract>();
    
    for(Class<?> clazz : classList) {
      RunWith annotation = clazz.getAnnotation(RunWith.class);
      if(annotation == null) {
        continue;
      }
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
}
