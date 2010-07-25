package palus.trace;

import org.objectweb.asm.Type;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import palus.PalusUtil;

public abstract class TraceEvent implements Serializable {
	
	private final int id; //is useless i think	
	private final String className;	
	private final String methodName;	
	private final String methodDesc;	
	private final Object thiz;
	private final int thizID;
	private final Object[] params;
	private final int[] paramIDs;
	
	//a unique trace pair id, for quick matching the pair (entry vs exit)
	private int unique_trace_pair_id = -1;
	//currently each TraceEvent is paired with one entry and one exit
	private TraceEvent pair = null;
	
	//a unique trace sequence id based on occurrence time stamp,
	//for quick identify the consequences. The field is designed as final
	private int traceEventSequenceId = -1;
	
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
		//compute the object id
		thizID = System.identityHashCode(thiz);
		paramIDs = new int[params.length];
		for(int i = 0; i < paramIDs.length; i++) {
		  paramIDs[i] = System.identityHashCode(params[i]);
		}
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
	
	public int getTraceEventSequenceID() {
	  return this.traceEventSequenceId;
	}
	
	public void setTraceEventSequenceID(int sequenceId) {
	  //actually designed for final
	  PalusUtil.checkTrue(this.traceEventSequenceId == -1);
	  this.traceEventSequenceId = sequenceId;
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
	
	public int getReceiverObjectID() {
	  return this.thizID;
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
	
	public int[] getParamObjectIDs() {
	  return this.paramIDs;
	}
	
	public Object getParam(int i) {
		PalusUtil.checkTrue(i >= 0 && i < this.params.length);
		return this.params[i];
	}
	
	public int getParamObjectID(int i) {
	  PalusUtil.checkTrue(i >= 0 && i < this.params.length);
	  return this.paramIDs[i];
	}
	
	public String getParamTypeName(int i) {
	  assert i >= 0 && i < params.length;
	  return Type.getArgumentTypes(this.methodDesc)[i].getClassName();
	}
	
	public Class<?> getParamType(int i) throws ClassNotFoundException {
		assert i >= 0 && i < params.length;
		String paramTypeName = Type.getArgumentTypes(this.methodDesc)[i].getClassName();
		if(this.isArrayType(paramTypeName)) {
		   return this.getClassForArrayType(paramTypeName);
		}
		if(PalusUtil.isPrimitive(paramTypeName)) {
			return PalusUtil.getClassForPrimitiveType(paramTypeName);
		} else {
			return Class.forName(paramTypeName);
		}
	}
	
	public Class<?> getReturnType() throws ClassNotFoundException {
		String retClassName = Type.getReturnType(this.methodDesc).getClassName();
		if(this.isArrayType(retClassName)) {
		  return this.getClassForArrayType(retClassName);
		}
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
	
	protected boolean isArrayType(String typeName) {
	  return typeName.contains("[]");
	}
	
	protected Class<?> getClassForArrayType(String typeName) throws ClassNotFoundException {
	  int dimension = 0;
	  //type name looks like the classname[][][][] 
	  int bracketIndex = typeName.indexOf("[]");
	  if(bracketIndex == -1) {
	    return Class.forName(typeName);
	  } else {
	    while(bracketIndex != -1) {
	      dimension ++;
	      typeName = typeName.substring(0, bracketIndex);
	      bracketIndex = typeName.indexOf("[]");
	    }
	    Class<?> baseType = Class.forName(typeName);
	    //XXX not a good way!
	    return Array.newInstance(baseType, dimension).getClass();
	  }
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