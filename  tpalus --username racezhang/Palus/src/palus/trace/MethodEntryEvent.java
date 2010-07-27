package palus.trace;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import org.objectweb.asm.Type;

public class MethodEntryEvent extends TraceEvent {

	public MethodEntryEvent(int id, String className, String methodName,
	    String methodDesc, Object thiz, Object[] params) {
		super(id, className, methodName, methodDesc, thiz, params);
	}

	@Override
	public boolean isEntryEvent() {
		return true;
	}
	
	@Override
	public String toString() {  
        return "<Method> Entry:" + super.getMethodName() + ":"
        + super.getMethodDesc() + ":" +super.getReceiverObjectID() + ":" 
        + super.getParamsAsString();
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
