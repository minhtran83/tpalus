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

public class Transition implements Serializable {
	
	private final int transitionId;
	private final Class<?> modelledClass;
	private final ModelNode srcNode;
	private final ModelNode destNode;
	// Note that this className might not be the same as modelClass
	// for instance this transition is a side-effected static call
	private final String className;
	private final String methodName;
	private final String methodDesc;
	//the captured values and the position of current class
	public final List<Decoration> decorations = new ArrayList<Decoration>();
	
	//the transition on position, depends on the outcome of a model nodes
	//private final List<ModelNode> dependence = new ArrayList<ModelNode>();
	
	//is this transition a method or constructor, true -> method, false -> constructor
	private /*final*/ boolean isMethodOrConstructor;	
	private transient /*final*/ Method method; /* need to call recover method after deserialization */
	private transient /*final*/ Constructor<?> constructor; /* need to call recover method after deserialization */
	
	//if it is a loop call, indicate how many loops there are
	private int loopNum = 0;
	
	public Transition(ModelNode srcNode, ModelNode destNode, String className, String methodName, String methodDesc) {
		PalusUtil.checkNull(srcNode);
		PalusUtil.checkNull(destNode);
		PalusUtil.checkNull(className);
		PalusUtil.checkNull(methodName);
		PalusUtil.checkNull(methodDesc);
		//model the same class
		//XXX check getClassModel() == getClassModel()?
		PalusUtil.checkTrue(srcNode.getModelledClass() == destNode.getModelledClass());
		
		this.modelledClass = srcNode.getModelledClass();
		this.srcNode = srcNode;
		this.destNode = destNode;
		this.className = className;
		this.methodName = methodName;
		this.methodDesc = methodDesc;
		this.transitionId = Stats.genTransitionID();
		
		//deciede it is a method or constructor
		Method m = this.tryToGetMethod();
		Constructor<?> c = this.tryToGetConstructor();
		PalusUtil.checkTrue( m != null || c != null);
		PalusUtil.checkTrue(m == null || c == null);
		this.isMethodOrConstructor = (m == null) ? false : true;
		this.method = m;
		this.constructor = c;
	}
	
	void saveForSerialization() {
	  //empty on purpose
	}
	
	/**
	 * This method must be called after recovering from serialization, to recover
	 * objec states
	 * */
	void recoverFromDeserialization() {
	//deciede it is a method or constructor
      Method m = this.tryToGetMethod();
      Constructor<?> c = this.tryToGetConstructor();
      PalusUtil.checkTrue( m != null || c != null);
      PalusUtil.checkTrue(m == null || c == null);
      this.isMethodOrConstructor = (m == null) ? false : true;
      this.method = m;
      this.constructor = c;
	}
	
	public int getTransitionID() {
		return this.transitionId;
	}
	
	public Class<?> getModelledClass() {
		return this.modelledClass;
	}
	
	public Class<?>[] getParamClasses() {
	    if(this.isMethod()) {
	      return this.getMethod().getParameterTypes();
	    } else {
	      return this.getConstructor().getParameterTypes();
	    }
	}
	
	//for constructor return the class owner
	//for other method, it is the return type
	public Class<?> getOutputType() {
	  if(this.isConstructor()) {
	    return this.getConstructor().getDeclaringClass();
	  } else {
	    return this.getMethod().getReturnType();
	  }
	}
	
	public boolean isLoopTransition() {
		return srcNode == destNode;
	}
	
	public boolean isMethod() {
	  return this.isMethodOrConstructor;
	}
	
	public boolean isConstructor() {
	  return !this.isMethodOrConstructor;
	}
	
	public Method getMethod() {
	  PalusUtil.checkTrue(this.isMethodOrConstructor);
	  PalusUtil.checkNull(this.method);
	  PalusUtil.checkTrue(this.constructor == null);
	  return this.method;
	}
	
	public Constructor<?> getConstructor() {
	  PalusUtil.checkTrue(!this.isMethodOrConstructor);
	  PalusUtil.checkNull(this.constructor);
	  PalusUtil.checkTrue(this.method == null);
	  return this.constructor;
	}
	
	public boolean isPublicTransition() {
	  PalusUtil.checkTrue(this.method != null || this.constructor != null);
	  if(this.method != null) {
//	    if(Modifier.isPublic(this.method.getDeclaringClass().getModifiers())) {
//	      return false;
//	    }
	    return Modifier.isPublic(this.method.getModifiers());
	  } else {
//	    if(Modifier.isPublic(this.constructor.getDeclaringClass().getModifiers())) {
//	      return false;
//	    }
	    return Modifier.isPublic(this.constructor.getModifiers());
	  }
	}
	
	public boolean isOwnerClassPublic() {
	  PalusUtil.checkTrue(this.method != null || this.constructor != null);
	  Class<?> ownerClass = null;
	  if(this.method != null) {
	    ownerClass = this.method.getDeclaringClass();
	  } else {
	    ownerClass = this.constructor.getDeclaringClass();
	  }
	  return Modifier.isPublic(ownerClass.getModifiers());
	}
	
	public Class<?> getOwnerClass() {
	  PalusUtil.checkTrue(this.method != null || this.constructor != null);
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
		PalusUtil.checkTrue(decoration.transition == this);
		PalusUtil.checkNull(decoration);
		this.decorations.add(decoration);
	}
	
	public void addDecorations(List<Decoration> decorations) {
	  PalusUtil.checkNull(decorations);
	  for(Decoration decoration : decorations) {
	    this.addDecoration(decoration);
	  }
	}
	
	/**
	 * return how many decoration has been merged
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
	
	public int getUniqueDecorationPosition() {
	  PalusUtil.checkTrue(this.hasDecoration());
	  PalusUtil.checkTrue(this.hasUniqueDecorationPosition());
	  //return the position of any decoration
	  return this.decorations.get(0).getPosition();
	}
	
	public List<Decoration> makeClones(Transition t) {
	  PalusUtil.checkNull(t);
	  List<Decoration> cloneDecorations = new LinkedList<Decoration>();
	  //clone the decoration
	  for(Decoration decoration : this.decorations) {
	    cloneDecorations.add(decoration.makeClone(t));
	  }
	  
	  return cloneDecorations;
	}
	
	public boolean hasDecorationOnPosition(Position position) {
	  PalusUtil.checkNull(position);
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
	    PalusUtil.checkTrue(this.transitionId > 0);
	    //check the source and dest node
	    PalusUtil.checkTrue(this.srcNode.getModelledClass() == this.destNode.getModelledClass());
		//if it is loop transition
		if(loopNum != 0) {
		    PalusUtil.checkTrue(this.srcNode == this.destNode);
		}
		if(this.isMethodOrConstructor) {
		  PalusUtil.checkNull(this.method);
		} else {
		  PalusUtil.checkNull(this.constructor);
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
	 * The static inner class <code>Decoration</code>
	 * A decoration represents the set of parameter values for a method
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
		
		//XXX add abstract state here
//		private final AbstractState thisState = null;
//		private final AbstractState[] paramStates = null;
		
		/** the initial state, 0 represents this, number 1 - params.length
		 * -1 represents the return value
		 * represents the corresponding parameter value */
		private final int position;
		
		Decoration(String seriazableThisValue, String [] seriazableParamValues,
		    Object[] serializableArray, AbstractState thizState, AbstractState[] paramStates,
		    Transition transition, int position) {
			//check the input first
			PalusUtil.checkNull(transition);
			PalusUtil.checkNull(seriazableParamValues);
			PalusUtil.checkNull(serializableArray);
			PalusUtil.checkNull(thizState);
			PalusUtil.checkNull(paramStates);
			//System.out.println("position: " + position + ",  param length: " + params.length);
			PalusUtil.checkTrue(seriazableParamValues.length == serializableArray.length);
			PalusUtil.checkTrue(seriazableParamValues.length == paramStates.length);
			PalusUtil.checkTrue(position >= -1 && position <= seriazableParamValues.length);
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
		  PalusUtil.checkNull(thizValue);
		  PalusUtil.checkNull(paramValues);
		  PalusUtil.checkNull(transition);
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
		
		public DecorationValue getCurrentDecorationValue() {
			if(this.isInThisPosition()) {
				return this.getThisValue();
			} else {
				//because 1 - param.length represents parameter
				return this.getParamValues()[position - 1];
			}
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
			PalusUtil.checkNull(type);
			PalusUtil.checkNull(state);
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
			PalusUtil.checkNull(edge);
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