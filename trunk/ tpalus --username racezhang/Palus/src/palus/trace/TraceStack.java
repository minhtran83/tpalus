// Copyright 2010 Google Inc. All Rights Reserved.
package palus.trace;

import palus.model.serialize.TraceSerializer;

import palus.model.TraceAnalyzer;

import palus.PalusUtil;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * A simple stack storing all the recorded traces.
 * 
 * @author saizhang@google.com (Sai Zhang)
 *
 */
public class TraceStack {
  
   /**
    * use checkpointing for recorded traces or not
    * */
    public static boolean use_check_point = false;  
  
    /**
     * The check pointing of recorded traces. If the recorded trace exceeds the
     * size. It will first dump it to disk, and reclaim the memory
     * */
    public static int check_point_size = 100000;
    
    /**
     * The number of splitted trace file to disk
     * */
    private static int split_file_count = 0;
  
    /**
     * The list keeping all recorded traces
     * */
	public static final List<TraceEvent> traces = new LinkedList<TraceEvent>();
	
	/**
	 * Push a trace item to the stack
	 * @param id the unique trace id
	 * @param retObj  the return object of the monitored event
	 * @param className  the class name of monitored event
	 * @param methodName  the method name of monitored event
	 * @param methodDesc the method descriptor of monitored event
	 * @param thiz  the this object of monitored event. It is null for static method.
	 * @param params the parameter object array of the monitored event
	 * @param entryOrExit the flag indicating whether it is an entry or exit event.
	 *                    True represents entry event, false represents exit event.
	 * */
	public static synchronized void pushToStack(int id, Object retObj, String className, String methodName,
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
		PalusUtil.checkNull(pushItem, "The trace event item to push into stack could not be null.");
		traces.add(pushItem);
		
		//if the traces grows too fast
		if(TraceStack.use_check_point && traces.size() >= TraceStack.check_point_size) {
		  check_point_recorded_traces();
		}
	}
	
	private static void check_point_recorded_traces() {
	  Tracer.switchOff();
	  
	  File dump_file = new File(TraceAnalyzer.PROJECT_NAME + "_partial_" + (split_file_count++)
	      + ".model");
	  try {
	    TraceSerializer objectSerializer = new TraceSerializer(traces, dump_file);
        objectSerializer.serializeTracesAsObject();
      } catch (IOException e1) {
        e1.printStackTrace();
        throw new RuntimeException(e1);
      }
      
      System.out.println("Split succeeds! " + dump_file.getAbsolutePath());
      
      //reclaim the memory
	  traces.clear();
	  
	  Tracer.switchOn();
	}
}