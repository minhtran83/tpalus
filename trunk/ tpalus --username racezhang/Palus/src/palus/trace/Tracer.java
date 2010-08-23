// Copyright 2010 Google Inc. All Rights Reserved.

package palus.trace;

import palus.PalusUtil;

/**
 * The instrumentation code for recording all trace information
 * 
 * @author saizhang@google.com (Sai Zhang)
 */
public class Tracer {
	
  private static boolean switchOff = false;
  
  private static boolean verbose = true;
  
  public static void switchOff() {
	  switchOff = true;
  }
  
  public static void switchOn() {
	  switchOff = false;
  }
  
  public static void verboseOff() {
      verbose = false;
  }
  
  public static void verboseOn() {
      verbose = true;
  }
   
//  public static void traceMethodEntryArgs(Object[] objs) {
//	  if(switchOff) {
//		  return;
//	  }
//	  //TraceStack.pushParamsToStack(objs, true);
//  }
//  
//  public static void traceMethodExitArgs(Object[] objs) {
//	  if(switchOff) {
//		  return;
//	  }
//	  //TraceStack.pushParamsToStack(objs, false);
//  }
  
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
