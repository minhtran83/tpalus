package palus.model;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.objectweb.asm.Type;

import palus.PalusUtil;
import palus.trace.Stats;

public class Transition {
	
	private final int transitionId;
	private final Class<?> modelClass;
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
		PalusUtil.checkNull(methodName);
		PalusUtil.checkNull(methodDesc);
		//model the same class
		//XXX check getClassModel() == getClassModel()?
		PalusUtil.checkTrue(srcNode.getModelledClass() == destNode.getModelledClass());
		
		this.modelClass = srcNode.getModelledClass();
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
		return this.modelClass;
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
	
	public void addDecoration(Object thiz, Object[] params, Transition transition, Position p) {
	  Decoration decoration = new Decoration(thiz, params, transition, p.toIntValue());
	  this.addDecoration(decoration);
	}
	
	public void addDecoration(Decoration decoration) {
		PalusUtil.checkTrue(decoration.transition == this);
		PalusUtil.checkNull(decoration);
		this.decorations.add(decoration);
	}
	
	public List<Decoration> getDecorations() {
	    return this.decorations;
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
	
	/*
	 *This method is for invariant checking
	 * */
	public boolean checkRep() {
		
		if(loopNum != 0) {
			if (this.srcNode != this.destNode) {
				return false;
			}
		}
		
		return true;
	}
	
  private Method tryToGetMethod() {
//      System.out.println("In trying to get method: " + this.methodName +
//           ",  desc: " + this.methodDesc);
      Method[] methods = null;
      try {
          methods = Class.forName(this.className).getDeclaredMethods();
      } catch (SecurityException e) {
          throw new RuntimeException(e);
      } catch (ClassNotFoundException e) {
          throw new RuntimeException(e);
      }
      for (Method method : methods) {
//          System.out.println("    what we have: " + method.getName() + ", desc: "
//              + Type.getMethodDescriptor(method));
          if (Type.getMethodDescriptor(method).equals(this.methodDesc)
              && method.getName().equals(this.methodName)) {
              return method;
          }
      }
      
      return null;
  }
	
	private Constructor<?> tryToGetConstructor() {
	  //System.out.println("In trying to get constructor: " + this.methodName + ",  desc: " + this.methodDesc);
      Constructor<?>[] constructors = null;
      try {
          constructors = this.modelClass.getDeclaredConstructors();
      } catch (SecurityException e) {
          throw new RuntimeException(e);
      }
      for(Constructor<?> constructor : constructors) {        
           //System.out.println("    what we have: " + constructor.getName() + ", desc: " + Type.getConstructorDescriptor(constructor));
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
		public final int position;
		
		public Decoration(Object thiz, Object[] params, Transition transition, int position) {
			//check the input first
			PalusUtil.checkNull(transition);
			PalusUtil.checkNull(params);
			//System.out.println("position: " + position + ",  param length: " + params.length);
			PalusUtil.checkTrue(position >= -1 && position <= params.length);
			//get the type
			Class<?> thizType = transition.getModelClass();
			Class<?>[] paramTypes = transition.getParamClasses();
			
			this.thiz = new DecorationValue(thiz, thizType);
			this.params = new DecorationValue[params.length];
			for(int i = 0; i < this.params.length; i++) {
				this.params[i] = new DecorationValue(params[i], paramTypes[i]);
			}
			this.transition = transition;
			this.position = position;
		}
		
		public Decoration makeClone(Transition t) {
		    return new Decoration(thiz, params, t, position);
		}
		
		public boolean isInThisPosition() {
			return position == 0;
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
	}
	
	public static class DecorationValue {
		
		private final Object objValue;
		private final boolean isPrimitiveOrStringType;

		private DependenceEdge edge = null;
		
		public DecorationValue(Object obj, Class<?> type) {
			PalusUtil.checkNull(type);
			isPrimitiveOrStringType = type.isPrimitive() || PalusUtil.isPrimitive(type)
				|| type == java.lang.String.class;
			if(isPrimitiveOrStringType) {
				objValue = obj; //obj could be null
			} else {
				objValue = null;
			}
		}
		
		public boolean isPrimitiveOrStringType() {
			return this.isPrimitiveOrStringType;
		}
		
		public Object getValue() {
			if(this.isPrimitiveOrStringType()) {
				return objValue; //still could be null
			} else {
				return null;
			}
		}
		
		public void setDependenceEdge(DependenceEdge edge) {
			PalusUtil.checkNull(edge);
			this.edge = edge;
		}
		
		public DependenceEdge getDependenceEdge() {
			assert edge != null;
			return this.edge;
		}
	}
}