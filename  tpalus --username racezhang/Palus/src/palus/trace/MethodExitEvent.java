package palus.trace;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import org.objectweb.asm.Type;

public class MethodExitEvent extends TraceEvent {

	private final Object retObj;
	
	public MethodExitEvent(int id, Object retObj, String className, String methodName, String methodDesc, Object thiz,
			Object[] params) {
		super(id, className, methodName, methodDesc, thiz, params);
		this.retObj = retObj;
	}

	public Object getRetObject() {
		return retObj;
	}

	@Override
	public boolean isEntryEvent() {
		return false;
	}
	
	@Override
	public String toString() {
		return "<Method> Exit: " + super.getMethodName() + ":"
		  + super.getMethodDesc() + ":" + super.getId() + " : " + super.getParamValues();
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
