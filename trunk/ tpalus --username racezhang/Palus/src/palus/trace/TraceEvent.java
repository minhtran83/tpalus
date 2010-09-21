// Copyright 2010 Google Inc. All Rights Reserved.
package palus.trace;

import org.objectweb.asm.Type;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import palus.AbstractState;
import palus.PalusUtil;
import randoop.Globals;

/**
 * The base class of all kinds of trace events.
 * 
 * @author saizhang@google.com (Sai Zhang)
 */
public abstract class TraceEvent implements Serializable {
	/**
	 * The traced method id during instrumentation.
	 * <em>Note: </em> it is useless here
	 * */
	private final int id;
	/**
	 * The declaration class name of the traced method
	 * */
	private final String className;	
	/**
	 * The name of the traced method
	 * */
	private final String methodName;
	/**
	 * The descriptor of the traced method
	 * */
	private final String methodDesc;	
	/**
	 * The receiver object id for the traced method.
	 * <em>Note: </em> we do not save an Object instance here, because you never
	 * you what its runtime type is. That may impede from serialization.
	 * */
	private final int thizID;
	/**
	 * The object id list for the parameters in the traced method.
	 * <em>Note: </em> we do not save an Object array here, because you never
	 * know what its runtime type is. That may impede from serialization.
	 * */
	private final int[] paramIDs;
	/**
	 * The type of the receiver in the traced method
	 * */
	private /*final*/ Class<?> cachedThisType = null;
	/**
	 * The types of parameters in the traced method
	 * */
	private final Class<?>[] cachedParamTypes;
	/**
	 * The abstract object profile value for the receiver in the traced method.
	 * <em>Note: </em> when an abstract state object is recovered from serialization,
	 * the client code needs to call its recover state method.
	 * */
	private final AbstractState thizProfile;
	/**
     * The abstract object profile values for the parameter objects in the traced method.
     * <em>Note: </em> when an abstract state object is recovered from serialization,
     * the client code needs to call its recover state method.
     * */
	private final AbstractState[] paramProfiles;
	/**
	 * The String value of the receiver object.
	 * <em>Note: </em> I believe it is useless here. This is only for a primitive
	 * or string type. However, such types wont be appear in the receiver place.
	 * */
	private final String serializableThis;
	/**
     * The String values of the parameter objects.
     * <em>Note: </em> They are only for primitive or string type parameters.
     * */
	private final String[] serializableParams;
	/**
	 * The structure for keeping the content of 1-dimension primitive or string array
	 * or keep the object id of non-primitive or string array
	 * for example, the content of this array is all NULL initially, if there are
	 * two parameters:
	 * param 1:  {"hello", "world"}
	 *  param 2:  {object1, object2}
	 * The content of this array will be:
	 *  serializableArrays[1] = {"hello", "world"}
	 *  serializableArrays[2] = {objectid(object1), objectid(object2)}
	 * */
	private final Object[] serializableArrays;
	/**
	 * A unique trace pair id, for quick matching the pair (entry and exit event)
	 * */
	private int unique_trace_pair_id = -1;
	/**
	 * The corresponding entry (or exit) event of the current exit (or entry) event.
	 * */
	private TraceEvent pair = null;	
	/**
	 * A unique trace sequence id based on occurrence time stamp,
     * for quick identify the consequences. The field is designed as final.
	 * */
	private int traceEventSequenceId = -1;	
	/**
	 * A positive id representing the stack of depth when this trace event occurs.
	 * */
	private int stackDepth = -1;
	
	/**
	 * Constructor. Initializes all fields properly.
	 * */
	public TraceEvent(int id, String className, String methodName, String methodDesc, Object thiz,
			Object[] params) {
		PalusUtil.checkNull(className, "The class name to set could not be null.");
		PalusUtil.checkNull(methodName, "The method name to set could not be null.");
		PalusUtil.checkNull(methodDesc, "The method descriptor to set could not be null.");
		//XXX can not check, thiz could be null for static and init
		//PalusUtil.checkNull(thiz); 
		PalusUtil.checkNull(params, "The parameter object array could not be null.");
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
		this.serializableArrays = new Object[params.length];
		for(int i = 0; i < params.length; i++) {
		  if(params[i] == null) {
		    this.serializableParams[i] = null;
		  } else {
		    if(PalusUtil.isPrimitiveOrStringType(params[i].getClass())) {
		      //primitive or string value
		      this.serializableParams[i] = params[i].toString();
		    } else {
		      //object value
		      this.serializableParams[i] = null;
		      //save the array object
		      if(PalusUtil.isPrimitiveOrStringOneDimensionArrayType(params[i].getClass())) {
		        this.serializableArrays[i] = params[i];
		      }
		      if(PalusUtil.isNonPrimitiveOrStringOneDimensionArray(params[i].getClass())) {
		        this.serializableArrays[i] = PalusUtil.computeObjectIdInArray(params[i]);
		      }
		    }
		  }
		}
		//compute the object id
		thizID = System.identityHashCode(thiz);
		paramIDs = new int[params.length];
		for(int i = 0; i < paramIDs.length; i++) {
		  paramIDs[i] = System.identityHashCode(params[i]);
		}
		
		//compute the type
		cachedThisType = this.getReceiverType();
		cachedParamTypes = new Class<?>[paramIDs.length];
		for(int i = 0; i < paramIDs.length; i++) {
		  cachedParamTypes[i] = this.getParamType(i);
		}
		
		//compute the abstract profiles
		boolean isInit = (thiz == null);
		thizProfile = new AbstractState(thiz, cachedThisType, isInit);
		paramProfiles = new AbstractState[params.length];
		for(int i = 0; i < paramIDs.length; i++) {
		  paramProfiles[i] = new AbstractState(params[i], cachedParamTypes[i]);
		}
		
		//check the consistence
		checkRep(methodDesc, params);
	}
	
	/**
	 * Gets the instrumentation id of the traced method.
	 * <em>Note: </em> it is useless here.
	 * */
	public int getId() {
		return this.id;
	}
	
	/**
     * Gets the unique trace pair id.
     * */
	public int getUniqueTracePairID() {
		return this.unique_trace_pair_id;
	}
	
	/**
     * Sets the unique trace pair id. The field {@link #unique_trace_pair_id}
     * could only be set once!
     * */
	public void setUniqueTracePairID(int uniqueId) {
		//this is actually designed for final
		PalusUtil.checkTrue(this.unique_trace_pair_id == -1, "The unique trace pair id "
		    + "should not be already set!");
		this.unique_trace_pair_id = uniqueId;
	}
	/**
     * Gets the timestamp-based trace event sequence id.
     * */
	public int getTraceEventSequenceID() {
	  return this.traceEventSequenceId;
	}
	/**
     * Sets the unique trace event sequence id. The field {@link #traceEventSequenceId}
     * could only be set once!
     * */
	public void setTraceEventSequenceID(int sequenceId) {
	  //actually designed for final
	  PalusUtil.checkTrue(this.traceEventSequenceId == -1, "The trace event sequence id "
	      + "should not be already set!");
	  this.traceEventSequenceId = sequenceId;
	}
	/**
     * Gets the stack depth of this method.
     * */
	public int getStackDepth() {
	  return this.stackDepth;
	}
	/**
     * Sets the stack depth of this trace event. The field {@link #stackDepth}
     * could only be set once!
     * */
	public void setStackDepth(int stackDepth) {
	  PalusUtil.checkTrue(this.stackDepth == -1, "The stack depth should not be already set!");
	  this.stackDepth = stackDepth;
	}
	/**
     * Gets the declared class name.
     * */
	public String getClassName() {
		return this.className;
	}
	/**
     * Gets the traced method name.
     * */
	public String getMethodName() {
		return this.methodName;
	}
	/**
     * Gets the traced method descriptor.
     * */
	public String getMethodDesc() {
		return this.methodDesc;
	}
	/**
     * Sets the corresponding pair of this event. The field {@link #pair}
     * could only be set once!
     * */
	public void setPair(TraceEvent event) {
		PalusUtil.checkNull(event, "The event pair to set could not be null.");
		PalusUtil.checkTrue(this.pair == null, "The event pair should not be already set!");
		this.pair = event;
	}
	/**
     * Gets the corresponding pair event.
     * */
	public TraceEvent getPairEvent() {
		return this.pair;
	}
	
	/**
     * Gets the corresponding {@link AbstractState} object of this receiver object.
     * */
	public AbstractState getThisProfile() {
	  return this.thizProfile;
	}
	
	/**
     * Gets the corresponding {@link AbstractState} object arrays of the parameter
     * objects of the wrapped method.
     * */
	public AbstractState[] getParamProfiles() {
	  return this.paramProfiles;
	}
	
	/**
	 * Gets the serializable value of the receiver object. It returns null
	 * for non-primitive and non-string objects.
	 * */
	public String getSerializableThisValue() {
	  return this.serializableThis;
	}
	
	/**
	 * Gets the receiver object id for the wrapped method.
	 * */
	public int getReceiverObjectID() {
	  return this.thizID;
	}
	
	/**
     * Gets the serializable parameter array of the wrapped method. It returns null
     * for non-primitive and non-string parameter value.
     * */
	public String[] getSerializableParams() {
	  return this.serializableParams;
	}
    
	/**
     * Gets the serializable parameter array for the wrapped method.
     * For non-primitive/string one-dimension array, it returns null.
     * */
    public Object[] getSerializableArray() {
      return this.serializableArrays;
    }
	
    /**
     * Gets the parameter object id array for the wrapped method.
     * */
	public int[] getParamObjectIDs() {
	  return this.paramIDs;
	}
	
	/**
     * Gets the object id of the {@code i}-th parameter.
     * */
	public int getParamObjectID(int i) {
	  PalusUtil.checkTrue(i >= 0 && i < this.serializableParams.length, "The given index: "
	      + i + " should >=0 and < " + this.serializableParams.length);
	  return this.paramIDs[i];
	}
	
	/**
	 * Gets the type name of the {@code i}-th parameter.
	 * */
	public String getParamTypeName(int i) {
	  assert i >= 0 && i < this.serializableParams.length;
	  return Type.getArgumentTypes(this.methodDesc)[i].getClassName();
	}
	
	/**
	 * Gets the receiver type of the wrapped method.
	 * */
	public Class<?> getReceiverType()  {
	  if(this.cachedThisType == null) {
	    try {
          this.cachedThisType = Class.forName(this.className);
        } catch (ClassNotFoundException e) {
          throw new RuntimeException(e);
        }
	  }
	  return this.cachedThisType;// Class.forName(this.className);
	}
	
	/**
	 * Gets the {@code i}-th parameter type.
	 * */
	public Class<?> getParamType(int i) {
		assert i >= 0 && i < serializableParams.length;
		if(this.cachedParamTypes[i] == null) {
		  String paramTypeName = Type.getArgumentTypes(this.methodDesc)[i].getClassName();
		  //System.out.println(paramTypeName + "xxxx");
	      if(this.isArrayType(paramTypeName)) {
	        try {
                this.cachedParamTypes[i] = this.getClassForArrayType(paramTypeName);
             } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
	      } else if(PalusUtil.isPrimitive(paramTypeName)) {
	        this.cachedParamTypes[i] =  PalusUtil.getClassForPrimitiveType(paramTypeName);
	      } else {
	        try {
                this.cachedParamTypes[i] =  Class.forName(paramTypeName);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
	      }
		}
		return this.cachedParamTypes[i];
	}
	
	/**
	 * Gets the return type of the method wrapped in this {@code TraceEvent} object.
	 * */
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
	
	/**
	 * Checks if the current trace event contains a non-public method.
	 * */
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
	
	/**
	 * Converts the current object into readable string.
	 * */
    public String toParsableString() {
      PalusUtil.checkTrue(this.stackDepth != -1, "The stack depth should not be -1.");
      StringBuilder sb = new StringBuilder();
      for(int i = 0; i < this.stackDepth; i++) {
        sb.append("  ");
      }
      sb.append(toString());
      sb.append(Globals.lineSep + "Abstract state profile: " + Globals.lineSep);
      sb.append("This: " + this.thizProfile + Globals.lineSep);
      for(AbstractState state : this.paramProfiles) {
        sb.append(" param: " + state + Globals.lineSep);
      }
//      sb.append(",,,, id:");
//      sb.append(this.id + ",");
//      sb.append("pair_id:");
//      sb.append(this.unique_trace_pair_id + ",");
//      sb.append("seq_id:");
//      sb.append(this.traceEventSequenceId + ",");
//      sb.append("stack_depth:");
//      sb.append(this.stackDepth + ",");
      //sb.append("pair_trace:" + this.pair);
      
      return sb.toString();
    }
    
    /**
     * Serializes the current object.
     * @throws IOException
     * */
    public void serialize(ObjectOutputStream oos) throws IOException {
      oos.writeObject(this);
    }
    
    /**
     * Reads a {@code TraceEvent} object from an object input stream.
     * */
    public static TraceEvent deserialize(ObjectInputStream ois) throws IOException, ClassNotFoundException {
      Object obj = ois.readObject();
      if(!(obj instanceof TraceEvent)) {
          throw new IOException("Contain object other than TraceEvent!");
      }
      TraceEvent event = (TraceEvent)obj;
//      event.getThisProfile().recoverFieldStates();
//      for(AbstractState state : event.getParamProfiles()) {
//        state.recoverFieldStates();
//      }
      return event;
    }
	
    /**
     * Abstract method for overriding. Checks if the current event contains a
     * static method.
     * */
	public abstract boolean isStaticMethod();
	
	/**
	 * Abstract method for overriding. Checks if the current event is an entry event.
	 * */
	public abstract boolean isEntryEvent();
	
	/**
	 * Dumps all parameter values as string for debugging
	 * */
	protected String getParamsAsString() {
	  PalusUtil.checkTrue(this.paramIDs.length == this.serializableParams.length,
	      "The parameter id length: " + this.paramIDs.length + " should == "
	      + " serializable param length: " + this.serializableParams.length);
	  StringBuilder sb = new StringBuilder();
	  int[] ids = this.paramIDs;
	  sb.append("[");
	  for(int i = 0; i < ids.length; i++) {
	    sb.append(ids[i]);
	    sb.append(":");
	    //print out the content of params
	    if(this.serializableParams[i] == null && this.serializableArrays[i] != null) {
	      sb.append(PalusUtil.convertArrayToFlatString(this.serializableArrays[i]));
	    } else {
	      sb.append(this.serializableParams[i]);
	    }
	    if( i != ids.length - 1) {
	      sb.append(",");
	    }
	  }
	  sb.append("]");
	  return sb.toString();
	}
	
	/**
	 * A simple way to decide whether the given type name is an array type
	 * */
	protected boolean isArrayType(String typeName) {
	  return typeName.contains("[]");
	}
	
	/**
	 * Converts an array type in string form into class.
	 * */
	protected Class<?> getClassForArrayType(String typeName) throws ClassNotFoundException {
	  int dimension = 0;
	  //type name looks like the classname[][][][] 
	  int bracketIndex = typeName.indexOf("[]");
	  if(bracketIndex == -1) {
	    if(PalusUtil.isPrimitive(typeName)) {
	      return PalusUtil.getClassForPrimitiveType(typeName);
	    }
	    return Class.forName(typeName);
	  } else {
	    while(bracketIndex != -1) {
	      dimension ++;
	      typeName = typeName.substring(0, bracketIndex);
	      bracketIndex = typeName.indexOf("[]");
	    }
	    //get the base type of an array
	    Class<?> baseType = null;
	    if(PalusUtil.isPrimitive(typeName)) {
	      //if it is a primitive type
	      baseType = PalusUtil.getClassForPrimitiveType(typeName);
	    } else {
	      //not a primitive type
	      baseType = Class.forName(typeName);
	    }
	    PalusUtil.checkNull(baseType, "The base type for array type: " + typeName
	        + " could not be null.");
	    //XXX not a good way!
	    return Array.newInstance(baseType, dimension).getClass();
	  }
	}
	
	/**
	 * Checks the invariants for this class
	 * */
	private static void checkRep(String methodDesc, Object[] params) {
		if(Type.getArgumentTypes(methodDesc).length != params.length) {
			throw new RuntimeException("Method desc: " + methodDesc + " should have "
					+ Type.getArgumentTypes(methodDesc).length + " params. But we get "
					+ params.length);
		}
		
		//we could check more
	}
}