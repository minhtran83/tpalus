// Copyright 2010 Google Inc. All Rights Reserved.

package palus.trace;

import palus.PalusUtil;

/**
 * The instrumentation code for recording all trace information
 * 
 * @author saizhang@google.com (Sai Zhang)
 */
public class Tracer {

  /**
   * A reentrant flag to determine tracing the current method or not
   * */
  private static boolean switchOff = false;
  
  /**
   * A flag to control whether to output the current trace information
   * to standard output or not
   * */
  private static boolean verbose = true;
  
  /**
   * Turn off the reentrant flag. Stop tracing the trace event.
   * */
  public static void switchOff() {
	  switchOff = true;
  }
  
  /**
   * Turn on the reentrant flag. Continue tracing the trace event.
   * */
  public static void switchOn() {
	  switchOff = false;
  }
  
  /**
   * Turn off the verbose flag. Do not print out in the standard output.
   * */
  public static void verboseOff() {
      verbose = false;
  }
  
  /**
   * Turn on the verbose flag. Print out in the standard output.
   * */
  public static void verboseOn() {
      verbose = true;
  }
  
  /**
   * Tracing the method entry information
   * @param id  the unique id of the traced method
   * @param className  the class name of the traced method
   * @param methodName  the name of the traced method
   * @param desc  method descriptor
   * @param o  the this object of the traced method. It is null for static method
   * @param objs  the parameters of the traced method
   * */
  public static void traceMethodEntry(int id, String className, String methodName,
      String desc, Object o, Object[] objs) {
	  if(switchOff) {
		  return;
	  }
	  className = PalusUtil.transClassNameSlashToDot(className);
	  if(verbose) {
	      System.out.println("start call: " + id + "   " + className + "  "+ methodName
	          + "  " + desc + "  " + System.identityHashCode(o) + ",  arg num: " + objs.length);
	  }
	  //TraceStack.pushMethodToStack(id, null, /*no return value*/ className, methodName, desc, o, true);
	  TraceStack.pushToStack(id, null, className, methodName, desc, o, objs, true);
  }
  
  /**
   * Tracing the method exit information
   * @param ret the return object the traced method. It is null for void method.
   * @param methodName  the name of the traced method
   * @param desc  method descriptor
   * @param o  the this object of the traced method. It is null for static method
   * @param id  the unique id of the traced method
   * @param className  the class name of the traced method
   * @param objs  the parameters of the traced method
   * */
  public static void traceMethodExit(Object ret, String methodName, String desc,
      Object o, int id, String className, Object[] objs) {
	  if(switchOff) {
		  return;
	  }
	  className = PalusUtil.transClassNameSlashToDot(className);
	  if(verbose) {
	      System.out.println("end call: "  + id + "   " + className + "   " + methodName
	          + "  " + desc + "  " + System.identityHashCode(o) + " ret: " + System.identityHashCode(ret)
	          + ",  arg num: " + objs.length);
	  }
	  //TraceStack.pushMethodToStack(id, ret, className, methodName, desc, o, false);
	  TraceStack.pushToStack(id, ret, className, methodName, desc, o, objs, false);
  }
  
}
