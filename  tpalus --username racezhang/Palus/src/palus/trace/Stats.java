// Copyright 2010 Google Inc. All Rights Reserved.
package palus.trace;

/**
 * A simple class to keep all statistic information during instrumentation
 * and model construction
 * 
 * @author saizhang@google.com (Sai Zhang)
 */
public class Stats {
    /**
     * The unique trace id and its generation method
     * */
	private static int TRACE_ID = 0;
	public static int genTraceID() {
		return TRACE_ID++;
	}
	
	/**
	 * The unique class model id and its generation method
	 * */
	private static int CLASS_MODEL_ID = 0;
	public static int genClassModelID() {
	  return CLASS_MODEL_ID;
	}
	
	/**
	 * The unique model node id and its generation method
	 * */
	private static int MODEL_NODE_ID = 0;
	public static int genModelNodeID() {
		return MODEL_NODE_ID++;
	}
	
	/**
     * The unique transition id and its generation method
     * */
	private static int TRANSITION_ID = 0;
	public static int genTransitionID() {
		return TRANSITION_ID++;
	}
	
	/**
	 * The unique id for the matched entry/exit events for the same method
	 * */
	private static int TRACE_PAIR_ID = 0;
	public static int genTracePairID() {
		return TRACE_PAIR_ID++;
	}
	
	/**
	 * The sequence id represents the absolute trace sequential order
	 * during program execution
	 * */
	private static int TRACE_SEQUENCE_ID = 0;
	public static int genTraceSequenceID() {
	  return TRACE_SEQUENCE_ID++;
	}
}