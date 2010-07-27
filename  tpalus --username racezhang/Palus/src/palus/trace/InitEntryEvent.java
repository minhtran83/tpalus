package palus.trace;

public class InitEntryEvent extends TraceEvent {

	public InitEntryEvent(int id, String className, String methodName, String methodDesc, Object thiz,
			Object[] params) {
		super(id, className, methodName, methodDesc, thiz, params);
	}

	@Override
	public boolean isEntryEvent() {
		return true;
	}
	
	@Override
	public String toString() {
		return "<Init> Entry:" + super.getMethodName() + ":"
		  + super.getMethodDesc() + ":" +super.getReceiverObjectID() + ":" 
		  + super.getParamsAsString();
	}

	@Override
	public boolean isStaticMethod() {
		return false;
	}
}
