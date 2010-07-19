package palus.trace;

import org.objectweb.asm.Type;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import palus.PalusUtil;

public abstract class TraceEvent {
	
	private final int id; //is useless i think	
	private final String className;	
	private final String methodName;	
	private final String methodDesc;	
	private final Object thiz;	
	private final Object[] params;
	
	//a unique trace pair id
	private int unique_trace_pair_id = -1;
	//currently each TraceEvent is paired with one entry and one exit
	private TraceEvent pair = null;
	
	public TraceEvent(int id, String className, String methodName, String methodDesc, Object thiz,
			Object[] params) {
		PalusUtil.checkNull(className);
		PalusUtil.checkNull(methodName);
		PalusUtil.checkNull(methodDesc);
		//XXX can not check, thiz could be null for static and init
		//PalusUtil.checkNull(thiz); 
		PalusUtil.checkNull(params);
		this.id = id;
		this.className = className;
		this.methodName = methodName;
		this.methodDesc = methodDesc;
		this.thiz = thiz;
		this.params = params;
		//check the consistence
		checkRep(methodDesc, params);
	}
	
	public int getId() {
		return this.id;
	}
	
	public int getUniqueTracePairID() {
		return this.unique_trace_pair_id;
	}
	
	public void setUniqueTracePairID(int uniqueId) {
		//this is actually designed for final
		PalusUtil.checkTrue(this.unique_trace_pair_id == -1);
		this.unique_trace_pair_id = uniqueId;
	}
	
	public String getClassName() {
		return this.className;
	}
	
	public String getMethodName() {
		return this.methodName;
	}
	
	public String getMethodDesc() {
		return this.methodDesc;
	}
	
	public void setPair(TraceEvent event) {
		PalusUtil.checkNull(event);
		PalusUtil.checkTrue(this.pair == null);
		this.pair = event;
	}
	
	public TraceEvent getPairEvent() {
		return this.pair;
	}
	
	public Object getReceiver() {
		return thiz;
	}
	
	public boolean hasReceiver() {
		return thiz != null;
	}
	
	public int getParamsNum() {
		return params.length;
	}
	
	public Object[] getParams() {
		return this.params;
	}
	
	public Object getParam(int i) {
		PalusUtil.checkTrue(i >= 0 && i < this.params.length);
		return this.params[i];
	}
	
	public Class<?> getParamType(int i) throws ClassNotFoundException {
		assert i >= 0 && i < params.length;
		String paramTypeName = Type.getArgumentTypes(this.methodDesc)[i].getClassName();
		if(PalusUtil.isPrimitive(paramTypeName)) {
			return PalusUtil.getClassForPrimitiveType(paramTypeName);
		} else {
			return Class.forName(paramTypeName);
		}
	}
	
	public Class<?> getReturnType() throws ClassNotFoundException {
		String retClassName = Type.getReturnType(this.methodDesc).getClassName();
		if(retClassName.equals("void")) {
			return void.class;
		} else if (PalusUtil.isPrimitive(retClassName)) {
			return PalusUtil.getClassForPrimitiveType(retClassName);
		} else {
			return Class.forName(retClassName);
		}
	}
	
	public boolean isNonPublicMethod() {
	  Class<?> clazz;
      try {
          clazz = Class.forName(getClassName());
      } catch (ClassNotFoundException e) {
          throw new RuntimeException(e);
      }
      Method[] methods = clazz.getDeclaredMethods();
      for(Method method : methods) {
          if(method.getName().equals(getMethodName())
              && Type.getMethodDescriptor(method).equals(getMethodDesc())) {
              return !Modifier.isPublic(method.getModifiers());
          }
      }
      
      throw new RuntimeException("Method: " + toString() + " does not exist!");
	}
	
	public abstract boolean isStaticMethod();
	
	public abstract boolean isEntryEvent();
	
	protected String getParamValues() {
	  StringBuilder sb = new StringBuilder();
	  sb.append("Param values: [");
	  for(Object param : params) {
	    if(param != null) {
	      sb.append(param.toString());
	    } else {
	      sb.append("'null'");
	    }
        sb.append(", ");
	  }
	  sb.append("]");
	  return sb.toString();
	}
	
	private static void checkRep(String methodDesc, Object[] params) {
		if(Type.getArgumentTypes(methodDesc).length != params.length) {
			throw new RuntimeException("Method desc: " + methodDesc + " should have "
					+ Type.getArgumentTypes(methodDesc).length + " params. But we get "
					+ params.length);
		}
		
		//we could check more
	}
}