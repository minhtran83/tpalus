// Copyright 2010 Google Inc. All Rights Reserved.
package palus.model;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.objectweb.asm.Type;

import palus.AbstractState;
import palus.Log;
import palus.PalusUtil;
import palus.trace.Stats;

/**
 * Represents an edge entity in the built {@link ClassModel} object.
 * 
 * @author saizhang@google.com (Sai Zhang)
 *
 */
public class Transition implements Serializable {
	/**
	 * A unique id for the transition object
	 * */
	private final int transitionId;
	/**
	 * The class for which this transition models
	 * */
	private final Class<?> modelledClass;
	/**
	 * The source node of the transition
	 * */
	private final ModelNode srcNode;
	/**
     * The destination node of the transition
     * */
	private final ModelNode destNode;
	
	/**
	 * A transition corresponds to a method or constructor call.
	 * The following three fields stores the clas name, method name, and
	 * method descriptor of the wrapper method call.
	 * 
	 * <em>Note: </em> this className might not be the same as {@link #modelledClass}
     * For instance, this transition could be a side-effected static call, and
     * models one of this parameter.
	 * */
	private final String className;
	private final String methodName;
	private final String methodDesc;
	
	/**
	 * The captured decorations of this transition
	 * */
	public final List<Decoration> decorations = new ArrayList<Decoration>();
	
	/**
	 * * A flag indicating this transition a method or constructor.
	 * True -> method, false -> constructor 
	 * */
	private /*final*/ boolean isMethodOrConstructor;
	
	/**
	 * The {@link Method} object this transition represents. If the transition
	 * corresponds to a normal method call.
	 * 
	 * <em>Note: </em> need to call recover method after de-serialization to recover
	 * this field.
	 * */
	private transient /*final*/ Method method;
	
	/**
     * The {@link Constructor} object this transition represents. If the transition
     * corresponds to a constructor call.
     * 
     * <em>Note: </em> need to call recover method after de-serialization to recover
     * this field.
     * */
	private transient /*final*/ Constructor<?> constructor;
	
	/**
	 * An unused flag.
	 * To indicate if it is a loop call, how many loops there are.
	 * */
	private int loopNum = 0;
	
	/**
	 * Constructor. Create a new transition object.
	 * */
	public Transition(ModelNode srcNode, ModelNode destNode, String className, String methodName, String methodDesc) {
		PalusUtil.checkNull(srcNode, "The src node argument could not be null!");
		PalusUtil.checkNull(destNode, "The dest node argument could not be null!");
		PalusUtil.checkNull(className, "The class name argument could not be null!");
		PalusUtil.checkNull(methodName, "The method name argument could not be null!");
		PalusUtil.checkNull(methodDesc, "The method descriptor argument could not be null!");
		//make sure source/dest node are modelling the same class
		PalusUtil.checkTrue(srcNode.getModelledClass() == destNode.getModelledClass(),
		    "The modelled class of srcNode: " + srcNode.getModelledClass() + " should == "
		    + " that of the destNode: " + destNode.getModelledClass());
		
		this.modelledClass = srcNode.getModelledClass();
		this.srcNode = srcNode;
		this.destNode = destNode;
		this.className = className;
		this.methodName = methodName;
		this.methodDesc = methodDesc;
		this.transitionId = Stats.genTransitionID();
		
		//decide it is a method or constructor
		Method m = this.tryToGetMethod();
		Constructor<?> c = this.tryToGetConstructor();
		PalusUtil.checkTrue( m != null || c != null,
		    "Either method or constructor field should NOT be null.");
		PalusUtil.checkTrue(m == null || c == null,
		    "One of the method and constructor fields should  be null.");
		this.isMethodOrConstructor = (m == null) ? false : true;
		this.method = m;
		this.constructor = c;
	}
	
	/**
	 * Save the un-serializable fields' states
	 * */
	void saveForSerialization() {
	  //empty on purpose
	}
	
	/**
	 * This method must be called after recovering from serialization, to recover
	 * the object states of several fields
	 * */
	void recoverFromDeserialization() {
	//deciede it is a method or constructor
      Method m = this.tryToGetMethod();
      Constructor<?> c = this.tryToGetConstructor();
      PalusUtil.checkTrue( m != null || c != null,
          "Either method or constructor field should NOT be null.");
      PalusUtil.checkTrue(m == null || c == null,
          "One of the method and constructor field should be null.");
      this.isMethodOrConstructor = (m == null) ? false : true;
      this.method = m;
      this.constructor = c;
	}
	
	/**
	 * Returns the unique transition id
	 * */
	public int getTransitionID() {
		return this.transitionId;
	}
	
	/**
	 * Returns the type this transition models
	 * */
	public Class<?> getModelledClass() {
		return this.modelledClass;
	}
	
	/**
	 * Gets types of parameters to invoke this transition
	 * */
	public Class<?>[] getParamClasses() {
	    if(this.isMethod()) {
	      return this.getMethod().getParameterTypes();
	    } else {
	      return this.getConstructor().getParameterTypes();
	    }
	}
	
	/**
	 * Gets the return type of this transition. If it is a constructor,
	 * returns the type it will create. Else, get the return type of
	 * a normal method.
	 * */
	public Class<?> getOutputType() {
	  if(this.isConstructor()) {
	    return this.getConstructor().getDeclaringClass();
	  } else {
	    return this.getMethod().getReturnType();
	  }
	}
	
	/**
	 * Checks is it a loop transition
	 * */
	public boolean isLoopTransition() {
		return srcNode == destNode;
	}
	
	/**
	 * Checks is it wrapping a normal method
	 * */
	public boolean isMethod() {
	  return this.isMethodOrConstructor;
	}
	
	/**
     * Checks is it wrapping a constructor
     * */
	public boolean isConstructor() {
	  return !this.isMethodOrConstructor;
	}
	
	public Method getMethod() {
	  PalusUtil.checkTrue(this.isMethodOrConstructor, "This transition should be a method transition!");
	  PalusUtil.checkNull(this.method, "The method field could not be null!");
	  PalusUtil.checkTrue(this.constructor == null, "The constructor: " + constructor + " should be null!");
	  return this.method;
	}
	
	public Constructor<?> getConstructor() {
	  PalusUtil.checkTrue(!this.isMethodOrConstructor, "The transition should be a constructor transition!");
	  PalusUtil.checkNull(this.constructor, "The constructor field could not be null!");
	  PalusUtil.checkTrue(this.method == null, "The method field should be null!");
	  return this.constructor;
	}
	
	public boolean isPublicTransition() {
	  PalusUtil.checkTrue(this.method != null || this.constructor != null,
	      "Either method or constructor field should NOT be null.");
	  if(this.method != null) {
	    return Modifier.isPublic(this.method.getModifiers());
	  } else {
	    return Modifier.isPublic(this.constructor.getModifiers());
	  }
	}
	
	public boolean isOwnerClassPublic() {
	  PalusUtil.checkTrue(this.method != null || this.constructor != null,
	      "Either method or constructor field should NOT be null.");
	  Class<?> ownerClass = null;
	  if(this.method != null) {
	    ownerClass = this.method.getDeclaringClass();
	  } else {
	    ownerClass = this.constructor.getDeclaringClass();
	  }
	  return Modifier.isPublic(ownerClass.getModifiers());
	}
	
	public Class<?> getOwnerClass() {
	  PalusUtil.checkTrue(this.method != null || this.constructor != null,
	      "Either method or constructor field should NOT be null.");
      Class<?> ownerClass = null;
      if(this.method != null) {
        ownerClass = this.method.getDeclaringClass();
      } else {
        ownerClass = this.constructor.getDeclaringClass();
      }
      return ownerClass;
	}
	
	public int getLoopNum() {
		return this.loopNum;
	}
	
	public void setLoopNum(int loopNum) {
		assert this.srcNode == this.destNode;
		this.loopNum = loopNum;
	}
	
	public ModelNode getSourceNode() {
		return this.srcNode;
	}
	
	public ModelNode getDestNode() {
		return this.destNode;
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
	
	public void addDecoration(String serializableThiz, String[] serializableParams,
	    Object[] serializableArray, AbstractState thizState, AbstractState[] paramStates,
	    Transition transition, Position p) {
	  //create a new decoration object, and add to this transition object.
	  Decoration decoration = new Decoration(serializableThiz, serializableParams, serializableArray,
	      thizState, paramStates, transition, p.toIntValue());
	  this.addDecoration(decoration);
	}

    public boolean hasDecorationValues(Decoration decoration) {
      for(Decoration d : this.decorations) {
        
        DecorationValue d_value_thiz = d.thiz;
        DecorationValue decoration_value_thiz = decoration.thiz;
        
        int d_position = d.position;
        int decoration_position = decoration.position;
        
        DecorationValue[] d_value_params = d.params;
        DecorationValue[] decoration_value_params = decoration.params;
        
        if(!d_value_thiz.equals(decoration_value_thiz)) {
          continue;
        }
        if(d_position != decoration_position) {
          continue;
        }
        if(d_value_params.length != decoration_value_params.length) {
          continue;
        }
        
        boolean matched = true;
        for(int i = 0; i < d_value_params.length; i++) {
          if(!d_value_params[i].equals(decoration_value_params[i])) {
            matched = false;
            break;
          }
        }
        
        if(matched) {
          return matched;
        }
        
      }
      return false;
    }
	
	public void addDecoration(Decoration decoration) {
		PalusUtil.checkTrue(decoration.transition == this, "The transition which decoration: "
		    + decoration + " represents should == this: " + this);
		PalusUtil.checkNull(decoration, "The decoration to add could not be null.");
		this.decorations.add(decoration);
	}
	
	public void addDecorations(List<Decoration> decorations) {
	  PalusUtil.checkNull(decorations, "The decoration list to add could not be null.");
	  for(Decoration decoration : decorations) {
	    this.addDecoration(decoration);
	  }
	}
	
	/**
	 * Returns how many decoration has been merged
	 * */
	int mergeEquivalentDecorations() {
	  int orig_num = this.decorations.size();
	  
	  Set<Decoration> decorationSet = new LinkedHashSet<Decoration>(this.decorations);
	  this.decorations.clear();
	  this.decorations.addAll(decorationSet);
	  
	  return orig_num - this.decorations.size();
	}
	
	public List<Decoration> getDecorations() {
	    return this.decorations;
	}
	
	public int getDecorationNum() {
	  return this.decorations.size();
	}
	
	public boolean hasDecoration() {
	  return this.decorations.size() != 0;
	}
	
	public boolean hasUniqueDecorationPosition() {
	    if(this.decorations.isEmpty()) {
	      Log.log("There are no decorations in transition: " + this.toSignature());
	      return true;
	    }
	    int position = Integer.MAX_VALUE;
	    for(Decoration decoration : this.decorations) {
	      if(position == Integer.MAX_VALUE) {
	        position = decoration.getPosition();
	      } else {
	        if(position != decoration.getPosition()) {
	          return false;
	        }
	      }
	    }
	    return true;
	}
	
	public Position getUniqueDecorationPositionObject() {
	  int intPosition = this.getUniqueDecorationPosition();
	  if(intPosition == 0) {
	    return Position.getThisPosition();
	  } else if (intPosition == -1) {
	    return Position.getRetPosition();
	  } else if (intPosition > 0) {
	    return Position.getParaPosition(intPosition);
	  } else {
	    throw new BugInPalusException("Illega position: " + intPosition
	        + " in transition: " + this.toSignature());
	  }
	}
	
	public int getUniqueDecorationPosition() {
	  PalusUtil.checkTrue(this.hasDecoration(), "This transition should have decorations.");
	  PalusUtil.checkTrue(this.hasUniqueDecorationPosition(),
	      "This transition should have unique decoration position.");
	  //return the position of any decoration
	  return this.decorations.get(0).getPosition();
	}
	
	public List<Decoration> makeClones(Transition t) {
	  PalusUtil.checkNull(t, "The transition to clone could not be null!");
	  List<Decoration> cloneDecorations = new LinkedList<Decoration>();
	  //clone the decoration
	  for(Decoration decoration : this.decorations) {
	    cloneDecorations.add(decoration.makeClone(t));
	  }
	  return cloneDecorations;
	}
	
	public boolean hasDecorationOnPosition(Position position) {
	  PalusUtil.checkNull(position, "The position argument could not be null!");
	  for(Decoration decoration : this.decorations) {
	    if(decoration.position == position.toIntValue()) {
	      return true;
	    }
	  }
	  return false;
	}
	
	//this is used for merging transitions
	public String toSignature() {
	  return this.getClassName() + ":" + this.getMethodName() + ":" + this.getMethodDesc();
	}
	
	@Override
	public int hashCode() {
	    return this.getSourceNode().hashCode() * 13 + this.getDestNode().hashCode()*23
	        + this.getClassName().hashCode() * 53 + this.getMethodName().hashCode() * 65
	        + this.getMethodDesc().hashCode() * 129;
	}
	
	@Override
	public boolean equals(Object t) {
		if(!(t instanceof Transition)) {
			return false;
		}
		Transition transition = (Transition)t;
		return transition.getSourceNode() == this.getSourceNode()
		    && transition.getDestNode() == this.getDestNode()
		    && transition.getClassName().equals(this.getClassName())
		    && transition.getMethodName().equals(this.getMethodName())
		    && transition.getMethodDesc().equals(this.getMethodDesc());
	}
	
	@Override
	public String toString() {
		return "Transition: (" + this.getModelledClass().getName() + " - " + this.getMethodName() + ":" + this.getMethodDesc()
		    + ") from ModelNode: " + this.getSourceNode().getNodeId() + " --> "
		    + this.getDestNode().getNodeId();
	}
	
	/**
	 *This method is for invariant checking
	 * */
	public void checkRep() {
	    //check the transition id
	    PalusUtil.checkTrue(this.transitionId > 0, "The transition id: " + this.transitionId
	        + " should > 0.");
	    //check the source and dest node
	    PalusUtil.checkTrue(this.srcNode.getModelledClass() == this.destNode.getModelledClass(),
	        "The modelled class for source node: " + this.srcNode.getModelledClass() + " should == "
	        + " that of the the dest node: " + this.destNode.getModelledClass());
		//if it is loop transition
		if(loopNum != 0) {
		    PalusUtil.checkTrue(this.srcNode == this.destNode, "The src node should == dest node"
		        + " for a loop node.");
		}
		if(this.isMethodOrConstructor) {
		  PalusUtil.checkNull(this.method, "The method field could not be null!");
		} else {
		  PalusUtil.checkNull(this.constructor, "The constructor field could not be null!");
		}
	}
	
  private Method tryToGetMethod() {
      Method[] methods = null;
      try {
          methods = Class.forName(this.className).getDeclaredMethods();
      } catch (SecurityException e) {
          throw new RuntimeException(e);
      } catch (ClassNotFoundException e) {
          throw new RuntimeException(e);
      }
      for (Method method : methods) {
          if (Type.getMethodDescriptor(method).equals(this.methodDesc)
              && method.getName().equals(this.methodName)) {
              return method;
          }
      }      
      return null;
  }
	
	private Constructor<?> tryToGetConstructor() {
      Constructor<?>[] constructors = null;
      try {
          constructors = this.modelledClass.getDeclaredConstructors();
      } catch (SecurityException e) {
          throw new RuntimeException(e);
      }
      for(Constructor<?> constructor : constructors) {
          if(Type.getConstructorDescriptor(constructor).equals(this.methodDesc)
              && "<init>".equals(this.methodName) ) {
              return constructor;
          }
      }
      return null;
    }
	
	/**
	 * This decoration represents the set of parameter values for a method
	 * call. It includes:
	 *   this, (param1, param2, param3, .., param n)
	 * 
	 * For each parameter (including this), if it is a primitive value
	 * or string, the decoration value stores its value. If not, it
	 * stores an dependence edge which leads to the desirable object
	 * state
	 * */
	public static class Decoration implements Serializable {

		private final Transition transition;
		private final DecorationValue thiz;
		private final DecorationValue[] params;
		
		/** the initial state, 0 represents this, number 1 - params.length
		 * -1 represents the return value
		 * represents the corresponding parameter value */
		private final int position;
		
		Decoration(String seriazableThisValue, String [] seriazableParamValues,
		    Object[] serializableArray, AbstractState thizState, AbstractState[] paramStates,
		    Transition transition, int position) {
			//check the input first
			PalusUtil.checkNull(transition, "The transition argument could not be null!");
			PalusUtil.checkNull(seriazableParamValues, "The seriazableParamValues argument could not be null!");
			PalusUtil.checkNull(serializableArray, "The serializableArray argument could not be null!");
			PalusUtil.checkNull(thizState, "The thizState argument could not be null!");
			PalusUtil.checkNull(paramStates, "The paramStates argument could not be null!");
			//System.out.println("position: " + position + ",  param length: " + params.length);
			PalusUtil.checkTrue(seriazableParamValues.length == serializableArray.length,
			    "The serializableParamValues' length: " + seriazableParamValues.length + " should == "
			     + " serializableArray's length: " + serializableArray.length);
			PalusUtil.checkTrue(seriazableParamValues.length == paramStates.length,
			    "The serializableParamValues' length: " + seriazableParamValues.length + " should == "
			    + " paramStates' length: " + paramStates.length);
			PalusUtil.checkTrue(position >= -1 && position <= seriazableParamValues.length,
			    "The decoration position: " + position + " should >= -1 and <= serializableParamValues'"
			    + " length: " + seriazableParamValues.length);
			//get the type
			Class<?> thizType = transition.getModelledClass();
			Class<?>[] paramTypes = transition.getParamClasses();
			
			this.thiz = new DecorationValue(seriazableThisValue, thizType, thizState);
			this.params = new DecorationValue[seriazableParamValues.length];
			for(int i = 0; i < this.params.length; i++) {
			    if(PalusUtil.isPrimitiveOrStringOneDimensionArrayType(paramTypes[i])) {
			      //the one dimension primitive or string array
			      this.params[i] = new DecorationValue(serializableArray[i], paramTypes[i], paramStates[i]);
			    } else {
				  this.params[i] = new DecorationValue(seriazableParamValues[i], paramTypes[i], paramStates[i]);
			    }
			}
			this.transition = transition;
			this.position = position;
		}
		
		/**
		 * Copy constructor
		 * */
		private Decoration(DecorationValue thizValue, DecorationValue[] paramValues, Transition transition,
		    int position) {
		  PalusUtil.checkNull(thizValue, "The thizValue argument could not be null!");
		  PalusUtil.checkNull(paramValues, "The paramValues argument could not be null!");
		  PalusUtil.checkNull(transition, "The transition argument could not be null!");
		  this.thiz = thizValue;
		  this.params = paramValues;
		  this.transition = transition;
		  this.position = position;
		}
		
		public Decoration makeClone(Transition t) {
		    return new Decoration(thiz, params, t, position);
		}
		
		public boolean isInThisPosition() {
			return position == 0;
		}
		
		public boolean isInRetPosition() {
		    return position == -1;
		}
		
		public int getPosition() {
		    return this.position;
		}
		
		public DecorationValue getDecorationByPosition(Position p) {
		  if(p.isRetPosition()) {
		    return null;
		  } else if(p.isThisPosition()) {
		    return this.getThisValue();
		  } else {
		    int pInt = p.toIntValue();
		    if(pInt < 1 || pInt > this.getParamValues().length) {
		      return null;
		    } else {
		      return this.getParamValues()[pInt - 1];
		    }
		  }
		}
		
		public DecorationValue getCurrentDecorationValue() {
			if(this.isInThisPosition()) {
				return this.getThisValue();
			} else {
				//because 1 - param.length represents parameter
				return this.getParamValues()[position - 1];
			}
		}
		
		public List<DecorationValue> getAllDecorationValues() {
		  List<DecorationValue> values = new LinkedList<DecorationValue>();
		  values.add(thiz);
		  for(DecorationValue param : this.params) {
		    values.add(param);
		  }
		  return values;
		}
		
		public List<DecorationValue> getDecorationValueByType(Class<?> type) {
		  PalusUtil.checkNull(type, "The type argument could not be null!");
		  List<DecorationValue> valuesOfType = new LinkedList<DecorationValue>();
		  if(thiz.type.equals(type)) {
		    valuesOfType.add(thiz);
		  }
		  for(DecorationValue param : this.params) {
		    if(param.type.equals(type)) {
		      valuesOfType.add(param);
		    }
		  }
		  
		  return valuesOfType;
		}
		
		public DecorationValue getThisValue() {
			return this.thiz;
		}
		
		public DecorationValue[] getParamValues() {
			return this.params;
		}
		
		@Override
		public String toString() {
		   StringBuilder sb = new StringBuilder();
		   sb.append(thiz.toString());
		   sb.append("[");
		   for(DecorationValue param : this.params) {
		     sb.append(param.toString() + " ");
		   }		  
		   sb.append("]");
		   return sb.toString();
		}
		
		@Override
		public boolean equals(Object obj) {
		  if(!(obj instanceof Decoration)) {
		    return false;
		  }
		  Decoration decoration = (Decoration)obj;
		  //use == here
		  if(this.transition != decoration.transition || this.position != decoration.position) {
		    return false;
		  }
		  if(!this.thiz.equals(decoration.thiz)) {
		    return false;
		  }
		  if(this.getParamValues().length != decoration.getParamValues().length) {
		    return false;
		  }
		  for(int i = 0; i < this.getParamValues().length; i++) {
		    if(!this.getParamValues()[i].equals(decoration.getParamValues()[i])) {
		      return false;
		    }
		  }
		  return true;
		}
		
		@Override
		public int hashCode() {
		  int paramCode = 0;
		  for(int i = 0; i < this.params.length; i++) {
		    paramCode += (i+1) * this.params[i].hashCode();
		  }
		  
		  return this.transition.hashCode() + 13 * this.thiz.hashCode() + 101 * this.position + paramCode;
		}
	}
	
	public static class DecorationValue implements Serializable {
		//this field only stores the primitive or string value
		private final Object objValue;
		private final Class<?> type;
		private final boolean isPrimitiveOrStringType;

		//can not set this final, edge need to change during model creation
		private DependenceEdge edge = null;
		
		//keep the abstract state of the value
		private final AbstractState state;
		
		//objStr could only be string and serializable primitive/string array
		DecorationValue(Object obj, Class<?> type, AbstractState state) {
			PalusUtil.checkNull(type, "The type argument could not be null!");
			PalusUtil.checkNull(state, "The AbstractState argument could not be null!");
			this.type = type;
			isPrimitiveOrStringType = type.isPrimitive() || PalusUtil.isPrimitive(type)
				|| type == java.lang.String.class;
			if(isPrimitiveOrStringType && obj != null) {
				objValue = obj;
			} else if(PalusUtil.isPrimitiveOrStringOneDimensionArrayType(type) && obj != null) {
			    //save the object of primitive or string one dimension array
			    objValue = obj;
			} else {
				objValue = null; //either non-primitive, non-string, or null value
			}
			//set the state here
			this.state = state;
		}
		
		public boolean isPrimitiveOrStringType() {
			return this.isPrimitiveOrStringType;
		}
		
		public Class<?> getDecorationType() {
		  return this.type;
		}
		
		public boolean isArray() {
		  return this.type.isArray();
		}
		
		public boolean isPrimitiveOrStringOneDimensionArray() {
		  if(!isArray()) {
		    return false;
		  } else {
		    Class<?> componentType = this.type.getComponentType();
		    return PalusUtil.isPrimitiveOrStringType(componentType);
		  }
		}
		
		public Object getArrayValue() {
		  if(this.isPrimitiveOrStringOneDimensionArray()) {
		    return objValue;
		  } else {
		    return null;
		  }
		}
		
		public Object getValue() {
			if(this.isPrimitiveOrStringType()) {
				return objValue; //still could be null
			} else {
				return null;
			}
		}
		
		public boolean hasDependenceEdge() {
		  return this.edge != null;
		}
		
		public void setDependenceEdge(DependenceEdge edge) {
			PalusUtil.checkNull(edge, "The dependentEdge to set could not be null!");
			this.edge = edge;
		}
		
		public DependenceEdge getDependenceEdge() {
		  //XXX have not touched
			//PalusUtil.checkNull(edge);
			return this.edge;
		}
		
		public AbstractState getAbstractState() {
		  return this.state;
		}
		
		@Override
		public int hashCode() {
		  return 13*this.type.hashCode() + 53 * (this.isPrimitiveOrStringType ? 1 : 0)
		      + 71 * (this.objValue ==  null? 33 : this.objValue.hashCode())
		      + 99 * this.state.hashCode();
		}
		
		@Override
		public boolean equals(Object obj) {
		  if(!(obj instanceof DecorationValue)) {
		    return false;
		  } else {
		    DecorationValue value = (DecorationValue)obj;
		    if(!this.type.equals(value.type)) {
		      return false;
		    }
		    //check the profile
            if(!this.state.equals(value.state)) {
              return false;
            }
		    //equal type
		    if(this.objValue != null && value.getValue() != null) {
		      //compare value if neither is null
		      return this.objValue.equals(value.getValue());
		    } else if ((this.objValue == null && value.getValue() != null)
		        || (this.objValue != null && value.getValue() == null)) {
		      //if one is null, but the other is not null
		      return false;
		    } else {
		      //if both values are null
		      if(this.isPrimitiveOrStringType == value.isPrimitiveOrStringType) {
		        //the same type
		        if(this.edge != null && value.getDependenceEdge() != null) {
		          //compare the dependence edge if neither is null
		          return this.edge.equals(value.getDependenceEdge());
		        } else if ((this.edge != null && value.getDependenceEdge() == null)
		            || (this.edge == null & value.getDependenceEdge() != null)) {
		          //if one is null and the other is not
		          return false;
		        } else {
		          //all null
		          return true;
		        }
		      } else {
		        //differen type
		        return false;
		      }
		    }
		  }
		}
		
		@Override
		public String toString() {
		  return (isPrimitiveOrStringType ?
		          (objValue == null? "primitive-null" : objValue.toString()) :
		            (edge == null ? "dependence-edge-not-set" : "dependence-edge"))
		           + " with abstract state: " + this.state.toString();
		}
	}
}