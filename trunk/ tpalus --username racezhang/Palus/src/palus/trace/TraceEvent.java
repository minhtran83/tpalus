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
	//private transient final Object thiz; /* can not serialize this, because you do not know what the runtime type it is*/
	private final int thizID;
	//private transient final Object[] params; /*can not serialize it, because you do not know what the runtime type it is*/
	private final int[] paramIDs;
	//serialization thiz
	private final String serializableThis;
	//serialization params
	private final String[] serializableParams;
	
	//a unique trace pair id, for quick matching the pair (entry vs exit)
	private int unique_trace_pair_id = -1;
	//currently each TraceEvent is paired with one entry and one exit
	private TraceEvent pair = null;
	
	//a unique trace sequence id based on occurrence time stamp,
	//for quick identify the consequences. The field is designed as final
	private int traceEventSequenceId = -1;
	
	//a positive id representing the stack of depth when this trace event
	//is recorded
	private int stackDepth = -1;
	
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
		//this.thiz = thiz;
		//this.params = params;
		//for serialization purpose we keep a copy of seriazable thiz value
		if(thiz != null) {
		  if(PalusUtil.isPrimitiveOrStringType(thiz.getClass())) {
		    this.serializableThis = thiz.toString();
		  } else {
		    this.serializableThis = null;
		  }
		} else {
		  this.serializableThis = null;
		}
		//for serialization purpose we keep a copy of serializable param value
		this.serializableParams = new String[params.length];
		for(int i = 0; i < params.length; i++) {
		  if(params[i] == null) {
		    this.serializableParams[i] = null;
		  } else {
		    if(PalusUtil.isPrimitiveOrStringType(params[i].getClass())) {
		      this.serializableParams[i] = params[i].toString();
		    } /*else if (PalusUtil.isPrimitiveOrStringOneDimensionArrayType(params[i].getClass())) {
		      
		    } */else {
		      this.serializableParams[i] = null;
		    }
		  }
		}
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
	
	public int getStackDepth() {
	  return this.stackDepth;
	}
	
	public void setStackDepth(int stackDepth) {
	  PalusUtil.checkTrue(this.stackDepth == -1);
	  this.stackDepth = stackDepth;
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
	
//	public Object getReceiver() {
//		return thiz;
//	}
	
	public String getSerializableThisValue() {
	  return this.serializableThis;
	}
	
	public int getReceiverObjectID() {
	  return this.thizID;
	}
	
//	public int getParamsNum() {
//		return params.length;
//	}
	
//	public Object[] getParams() {
//		return this.params;
//	}
	
	public String[] getSerializableParams() {
	  return this.serializableParams;
	}
	
	public int[] getParamObjectIDs() {
	  return this.paramIDs;
	}
	
//	public Object getParam(int i) {
//		PalusUtil.checkTrue(i >= 0 && i < this.params.length);
//		return this.params[i];
//	}
	
	public int getParamObjectID(int i) {
	  PalusUtil.checkTrue(i >= 0 && i < this.serializableParams.length);
	  return this.paramIDs[i];
	}
	
	public String getParamTypeName(int i) {
	  assert i >= 0 && i < this.serializableParams.length;
	  return Type.getArgumentTypes(this.methodDesc)[i].getClassName();
	}
	
	public Class<?> getReceiverType() throws ClassNotFoundException {
	  return Class.forName(this.className);
	}
	
	public Class<?> getParamType(int i) throws ClassNotFoundException {
		assert i >= 0 && i < serializableParams.length;
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
	    
    public String toParsableString() {
      PalusUtil.checkTrue(this.stackDepth != -1);
      StringBuilder sb = new StringBuilder();
      for(int i = 0; i < this.stackDepth; i++) {
        sb.append("  ");
      }
      sb.append(toString());
      sb.append(",,,, id:");
      sb.append(this.id + ",");
      sb.append("pair_id:");
      sb.append(this.unique_trace_pair_id + ",");
      sb.append("seq_id:");
      sb.append(this.traceEventSequenceId + ",");
      sb.append("stack_depth:");
      sb.append(this.stackDepth + ",");
      //sb.append("pair_trace:" + this.pair);
      
      return sb.toString();
    }
	
	public abstract boolean isStaticMethod();
	
	public abstract boolean isEntryEvent();
	
	protected String getParamsAsString() {
	  PalusUtil.checkTrue(this.paramIDs.length == this.serializableParams.length);
	  StringBuilder sb = new StringBuilder();
	  int[] ids = this.paramIDs;
	  sb.append("[");
	  for(int i = 0; i < ids.length; i++) {
	    sb.append(ids[i]);
	    sb.append(":");
	    sb.append(this.serializableParams[i]);
	    if( i != ids.length - 1) {
	      sb.append(",");
	    }
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