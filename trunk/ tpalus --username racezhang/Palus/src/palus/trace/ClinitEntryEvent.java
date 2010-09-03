// Copyright 2010 Google Inc. All Rights Reserved.
package palus.trace;

/**
 * Represents the entry event of a static init block
 * 
 * @author saizhang@google.com (Sai Zhang)
 */
public class ClinitEntryEvent extends TraceEvent {

	public ClinitEntryEvent(int id, String className, String methodName, String methodDesc,
	    Object thiz, Object[] params) {
		super(id, className, methodName, methodDesc, thiz, params);
	}

	@Override
	public boolean isEntryEvent() {
		return true;
	}
	
	@Override
	public String toString() {
		return "<Clinit> Entry: " + super.getMethodName() + ":"
		  + super.getMethodDesc() + ":" + super.getId();
	}

	@Override
	public boolean isNonPublicMethod() {
	  throw new RuntimeException("You can not tell Clinit<> is public or not");
	}
	
	@Override
	public boolean isStaticMethod() {
		return false;
	}
}