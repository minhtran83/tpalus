package palus.model;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.objectweb.asm.Type;

import palus.PalusUtil;
import palus.trace.Stats;

public class Transition {
	
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
	
	//is this transition a method or constructor, true -> method, false -> constructor
	private final boolean isMethodOrConstructor;	
	private final Method method;
	private final Constructor<?> constructor;
	
	//if it is a loop call, indicate how many loops it is
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
	
	public int getTransitionID() {
		return this.transitionId;
	}
	
	public Class<?> getModelClass() {
		return this.modelledClass;
	}
	
	public Class<?>[] getParamClasses() {
	    if(this.isMethod()) {
	      return this.getMethod().getParameterTypes();
	    } else {
	      return this.getConstructor().getParameterTypes();
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
	    Transition transition, Position p) {
	  Decoration decoration = new Decoration(serializableThiz, serializableParams, transition, p.toIntValue());
	  this.addDecoration(decoration);
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
	
	public List<Decoration> getDecorations() {
	    return this.decorations;
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
		return "Transition: (" + this.getModelClass().getName() + " - " + this.getMethodName() + ":" + this.getMethodDesc()
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
	public static class Decoration {

		private final Transition transition;
		private final DecorationValue thiz;
		private final DecorationValue[] params;		
		/** the initial state, 0 represents this, number 1 - params.length
		 * -1 represents the return value
		 * represents the corresponding parameter value */
		private final int position;
		
		public Decoration(String seriazableThisValue, String [] seriazableParamValues,
		    Transition transition, int position) {
			//check the input first
			PalusUtil.checkNull(transition);
			PalusUtil.checkNull(seriazableParamValues);
			//System.out.println("position: " + position + ",  param length: " + params.length);
			PalusUtil.checkTrue(position >= -1 && position <= seriazableParamValues.length);
			//get the type
			Class<?> thizType = transition.getModelClass();
			Class<?>[] paramTypes = transition.getParamClasses();
			
			this.thiz = new DecorationValue(seriazableThisValue, thizType);
			this.params = new DecorationValue[seriazableParamValues.length];
			for(int i = 0; i < this.params.length; i++) {
				this.params[i] = new DecorationValue(seriazableParamValues[i], paramTypes[i]);
			}
			this.transition = transition;
			this.position = position;
		}
		
		/**
		 * Copy constructor
		 * */
		public Decoration(DecorationValue thizValue, DecorationValue[] paramValues, Transition transition,
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
	}
	
	public static class DecorationValue {
		//this field only stores the primitive or string value
		private final Object objValue;
		private final Class<?> type;
		private final boolean isPrimitiveOrStringType;

		//can not set this final, edge need to change during model creation
		private DependenceEdge edge = null;
		
		public DecorationValue(String objStr, Class<?> type) {
			PalusUtil.checkNull(type);
			this.type = type;
			isPrimitiveOrStringType = type.isPrimitive() || PalusUtil.isPrimitive(type)
				|| type == java.lang.String.class;
			if(isPrimitiveOrStringType && objStr != null) {
				objValue = objStr;
			} else {
				objValue = null; //either non-primitive, non-string, or null value
			}
		}
		
		public boolean isPrimitiveOrStringType() {
			return this.isPrimitiveOrStringType;
		}
		
		public Class<?> getDecorationType() {
		  return this.type;
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
			PalusUtil.checkNull(edge);
			return this.edge;
		}
		
		@Override
		public String toString() {
		  return isPrimitiveOrStringType ?
		          (objValue == null? "primitive-null" : objValue.toString()) :
		            (edge == null ? "dependence-edge-not-set" : "dependence-edge");
		}
	}
}