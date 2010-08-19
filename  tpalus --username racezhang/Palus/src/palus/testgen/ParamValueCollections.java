// Copyright 2010 Google Inc. All Rights Reserved.

package palus.testgen;


import palus.Log;
import palus.PalusUtil;
import randoop.Globals;
import randoop.util.Randomness;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author saizhang@google.com (Your Name Here)
 *
 */
public class ParamValueCollections {
  
  /**
   * A map from class name to map name and a list of objects
   */
  public final Map<String, Map<String, Set<Object>>> methodValues =
    new HashMap<String, Map<String, Set<Object>>>();
  
  /**
   * all unclaimed values, maybe due to the incorrect specification
   * by users (mis-spell class name)
   */
  public final Set<Object> unclaimed = new HashSet<Object>();
  
  /**
   * Classify and add value and object to the map
   * */
  public void addParamValue(ParamValue value, Object obj) {
    String className = value.className();
    String methodName = value.methodName();
    if(isValid(className, className)) {
      if(!methodValues.containsKey(className)) {
        methodValues.put(className, new HashMap<String, Set<Object>>());
      }
      if(!methodValues.get(className).containsKey(methodName)) {
        methodValues.get(className).put(methodName, new LinkedHashSet<Object>());
      }
      methodValues.get(className).get(methodName).add(obj);
    } else {
      unclaimed.add(obj);
    }
  }
  
  /**
   * Pick up randomly a value of a given type for a method
   * */
  public Object nextRandomObject(String className, String methodName, Class<?> type) {
    if(!this.methodValues.containsKey(className)) {
      return null;
    }
    
    Map<String, Set<Object>> methodObjects = this.methodValues.get(className);
    if(!methodObjects.containsKey(methodName)) {
      return null;
    }
    
    Set<Object> objects = methodObjects.get(methodName);
    if(objects.isEmpty()) {
      return null;
    }
    
    List<Object> allObjects = new LinkedList<Object>();
    for(Object obj : objects) {
      if(obj != null && type.isAssignableFrom(obj.getClass())) {
        allObjects.add(obj);
      }
    }
    
    if(allObjects.isEmpty()) {
      return null;
    }
    
    //XXXX problem with primitive type, boxing and unboxing
    
    return allObjects.get(Randomness.nextRandomInt(allObjects.size()));
  }
  
  /**
   * Get a set of all primitive unclaimed fields
   * */
  public Collection<Object> allUnclaimedPrimitiveObjects() {
    Set<Object> primitiveObjects = new HashSet<Object>();
    
    for(Object obj : this.unclaimed) {
      if(obj != null) {
        Class<?> clazz = obj.getClass();
        if(PalusUtil.isPrimitiveOrStringType(clazz)) {
          primitiveObjects.add(obj);
        }
      }
    }
    
    return primitiveObjects;
  }
  
  /**
   * Get a set of non-primitive unclaimed fields
   * */
  public Collection<Object> allNonPrimitiveUnclaimedObjects() {
    Set<Object> nonPrimitives = new HashSet<Object>();
    
    for(Object obj : this.unclaimed) {
      if(obj != null) {
        Class<?> clazz = obj.getClass();
        if(!PalusUtil.isPrimitiveOrStringType(clazz)) {
          nonPrimitives.add(obj);
        }
      }
    }
    
    return nonPrimitives;
  }
  
  /**
   * Print out the content
   * */
  public String showContent() {
    StringBuilder sb = new StringBuilder();
    
    sb.append("Values for each method:");
    sb.append(Globals.lineSep);
    for(Entry<String, Map<String, Set<Object>>> classEntry: methodValues.entrySet()) {
      sb.append("Class: ");
      sb.append(classEntry.getKey());
      sb.append(Globals.lineSep);
      for(Entry<String, Set<Object>> methodEntry : classEntry.getValue().entrySet()) {
        sb.append("   ");
        sb.append("Method: \"");
        sb.append(methodEntry.getKey());
        sb.append("\":    ");
        for(Object obj : methodEntry.getValue()) {
         if(obj==null) {
           sb.append("NULL, ");
         } else {
           sb.append(obj.toString() + ", ");
         }
        }
        sb.append(Globals.lineSep);
      }
    }
    sb.append("All unclaimed values: ");
    sb.append(Globals.lineSep);
    for(Object obj : this.unclaimed) {
      if(obj==null) {
        sb.append("NULL, ");
      } else {
        sb.append(obj.toString() + ", ");
      }
    }
    sb.append(Globals.lineSep);
    
    return sb.toString();
  }
  
  /**
   * Check is the class name and method name really exists
   * */
  private boolean isValid(String className, String methodName) {
    boolean valid = false;
    
    Class<?> clazz = null;
    try {
      clazz = Class.forName(className);
    } catch (ClassNotFoundException e) {
       Log.log("No class in param value collection: " + className);
       //System.err.println("No class: " + className);
       return valid;
    }
    
    Constructor<?>[] constructors = clazz.getDeclaredConstructors();
    for(Constructor<?> constructor : constructors) {
      //System.err.println(constructor.getName());
      if(constructor.getName().equals(methodName)) {
        valid = true;
        return valid;
      }
    } 
    
    Method[] declaredMethods = clazz.getDeclaredMethods();
    for(Method method : declaredMethods) {
      //System.err.println(method.getName());
      if(method.getName().equals(methodName)) {
        valid = true;
        return valid;
      }
    }    
    
    return valid;
  }
  
}