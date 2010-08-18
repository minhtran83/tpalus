package palus.trace;

import java.util.LinkedList;
import java.util.List;


public class TraceStack {
	public static final List<TraceEvent> traces = new LinkedList<TraceEvent>();
	
	//ugly design here
	private static boolean hasMethodToPush = false;
	private static int currentId = -1;
	private static String currentClassName = null;
	private static String currentMethodName = null;
	private static String currentMethodDesc = null;
	private static Object currentThizObj = null;
	private static Object currentReturnObj = null;
	private static boolean currentEntryOrExit = false;
	
//	public static void pushMethodToStack(int id, Object ret, String className, String methodName,
//	    String methodDesc, Object thiz, boolean entryOrExit) {
//		if(hasMethodToPush) {
//			throw new RuntimeException("State error! Current method name, desc: " + currentMethodName
//					+ ",  " + currentMethodDesc+ ". But now pushing: " + methodName + ", " + methodDesc);
//		}
//		if(entryOrExit && ret != null) {
//			throw new RuntimeException("Method entry, why has ret value?");
//		}
//		
//		currentId = id;
//		currentClassName = className;
//		currentMethodName = methodName;
//		currentMethodDesc = methodDesc;
//		currentReturnObj = ret;
//		currentThizObj = thiz;
//		currentEntryOrExit = entryOrExit;
//		
//		hasMethodToPush = true;
//	}
//	
//	public static void pushParamsToStack(Object[] args, boolean entryOrExit) {
//		if(!hasMethodToPush) {
//			throw new RuntimeException("State error! There is no current method info ");
//		}
//		if (currentEntryOrExit != entryOrExit) {
//			throw new RuntimeException("State error! The currentEntryOrExit: " + currentEntryOrExit
//					+ ", now entry or exit: " + entryOrExit);
//		}
//		
//		pushToStack(currentId, currentReturnObj, currentClassName, currentMethodName,
//		    currentMethodDesc, currentThizObj, args, entryOrExit);
//		hasMethodToPush = false;
//	}
	
	public static void pushToStack(int id, Object retObj, String className, String methodName,
	    String methodDesc, Object thiz, Object[] params, boolean entryOrExit) { //true is entry, false is exit
		TraceEvent pushItem = null;
		if(methodName.equals("<init>")) {
			if(entryOrExit) {
				pushItem = new InitEntryEvent(id, className, methodName, methodDesc, thiz, params);
			} else {
				pushItem = new InitExitEvent(id, className, methodName, methodDesc, thiz, params);
			}
		} else if (methodName.equals("<clinit>")) {
			if(entryOrExit) {
				pushItem = new ClinitEntryEvent(id, className, methodName, methodDesc, thiz, params);
			} else {
				pushItem = new ClinitExitEvent(id, className, methodName, methodDesc, thiz, params);
			}
		} else {
			if(entryOrExit) {
				pushItem = new MethodEntryEvent(id, className, methodName, methodDesc, thiz, params);
			} else {
				pushItem = new MethodExitEvent(id, retObj /* return object only in method exit*/,
						className, methodName, methodDesc, thiz, params);
			}
		}
		traces.add(pushItem);
	}
}