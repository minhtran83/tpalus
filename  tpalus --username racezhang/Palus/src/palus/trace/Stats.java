package palus.trace;

public class Stats {
	private static int TRACE_ID = 0;
	public static int genTraceID() {
		return TRACE_ID++;
	}
	
	private static int CLASS_MODEL_ID = 0;
	public static int genClassModelID() {
	  return CLASS_MODEL_ID;
	}
	
	private static int MODEL_NODE_ID = 0;
	public static int genModelNodeID() {
		return MODEL_NODE_ID++;
	}
	
	private static int TRANSITION_ID = 0;
	public static int genTransitionID() {
		return TRANSITION_ID++;
	}
	
	private static int TRACE_PAIR_ID = 0;
	public static int genTracePairID() {
		return TRACE_PAIR_ID++;
	}
}