// Copyright 2010 Google Inc. All Rights Reserved.
package palus.trace;

/**
 * Represents the exit event of a constructor
 * 
 * @author saizhang@google.com (Sai Zhang)
 */
public class InitExitEvent extends TraceEvent {

	public InitExitEvent(int id, String className, String methodName, String methodDesc,
	    Object thiz, Object[] params) {
		super(id, className, methodName, methodDesc, thiz, params);
	}

	@Override
	public boolean isEntryEvent() {
		return false;
	}
	
	@Override
	public String toString() {
		return "<Init> Exit:" + super.getMethodName() + ":"
        + super.getMethodDesc() + ":" +super.getReceiverObjectID() + ":" 
        + super.getParamsAsString();
	}

	@Override
	public boolean isStaticMethod() {
		return false;
	}
}
