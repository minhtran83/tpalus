package palus.trace;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import org.objectweb.asm.Type;

import palus.PalusUtil;

public class MethodExitEvent extends TraceEvent {

	//private transient final Object retObj; /* can not serialize it, because you never know what is the runtime type*/
	private final int retObjID;
	//for serialization
	private final String retObjString;
	
	public MethodExitEvent(int id, Object retObj, String className, String methodName,
	    String methodDesc, Object thiz, Object[] params) {
		super(id, className, methodName, methodDesc, thiz, params);
		//this.retObj = retObj;
		this.retObjID = System.identityHashCode(retObj);
		//for serialization
		if(retObj != null && PalusUtil.isPrimitiveOrStringType(retObj.getClass())) {
		  retObjString = retObj.toString();
		} else {
		  retObjString = null;
		}
	}

//	public Object getRetObject() {
//		return retObj;
//	}
	
	public int getRetObjectID() {
	  return this.retObjID;
	}

	@Override
	public boolean isEntryEvent() {
		return false;
	}
	
	@Override
	public String toString() {
	  return "<Method> Exit:  method name & desc: " + super.getMethodName() + ":"
        + super.getMethodDesc() + ":   receiver obj id: " +super.getReceiverObjectID() + ":" 
        + super.getParamsAsString() + ":   return obj id: (" + this.retObjID + ":" +  this.retObjString + ")";
	}

	@Override
	public boolean isStaticMethod() {
		Class<?> clazz;
		try {
			clazz = Class.forName(super.getClassName());
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
		Method[] methods = clazz.getDeclaredMethods();
		for(Method method : methods) {
			if(method.getName().equals(super.getMethodName())
			    && Type.getMethodDescriptor(method).equals(super.getMethodDesc())) {
				return Modifier.isStatic(method.getModifiers());
			}
		}
		
		throw new RuntimeException("Method: " + toString() + " does not exist!");
	}
}
