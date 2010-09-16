// Copyright 2010 Google Inc. All Rights Reserved.

package randoop;

import randoop.util.Files;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 * A class containing all error-ignorable methods. The method specified in this
 * class is treated as not interested
 * 
 * @author saizhang@google.com (Sai Zhang)
 *
 */
public class ErrorIgnoredMethods {
  
  /**
   * The set storing all the names of all uninterested methods
   * */
  private static Set<String> methodNames = new HashSet<String>();
  
  /**
   * Add ignorable methods to the set
   * */
  public static void addMethodsFromFile(String fileName) {
    assert fileName != null;
    File file = new File(fileName);
    if(!file.exists()) {
      throw new RuntimeException("File : " + file.getAbsolutePath() + " does not exist!");
    }
    try {
      List<String> methods = Files.readWhole(file);
      for(String method : methods) {
        if(method.trim().equals("") || method.trim().startsWith("#")) {
          continue;
        }
        methodNames.add(method.trim());
      }
    } catch (IOException e) {
      throw new RuntimeException("Errors in reading file: " + file.getAbsolutePath());
    }
    System.out.println("Add error-ignorable methods from: " + file.getAbsolutePath());
  }
  
  /**
   * Gets the method name of the statement
   * */
  public static boolean isErrorIgnorableMethod(StatementKind statement, boolean prefixMatch) {
    assert statement != null;
    
    String methodName = null;
    if(statement instanceof RMethod) {
      RMethod rmethod = (RMethod)statement;
      Method method = rmethod.getMethod();
      methodName = method.getDeclaringClass().getName() + "." + method.getName();
    } else if (statement instanceof RConstructor) {
      RConstructor rconstructor = (RConstructor)statement;
      methodName = rconstructor.getConstructor().getDeclaringClass().getName() + ".<init>";
    } else {
      throw new RuntimeException("Unexpected statement type: " + statement);
    }
    
    assert methodName != null;
    return isErrorIgnorableMethod(methodName, prefixMatch);
  }
  
  /**
   * Contains the give method.
   * 
   * If {@code prefixMatch} is set to true, it only checks whether the method has one of
   * the string in the set as its prefix.
   * */
  public static boolean isErrorIgnorableMethod(String methodName, boolean prefixMatch) {
    if(!prefixMatch) {
      return methodNames.contains(methodName);
    } else {
      boolean ignored = false;
      for(String prefix : methodNames) {
        if(methodName.trim().startsWith(prefix)) {
          ignored = true;
          break;
        }
      }
      return ignored;
    }
  }
}