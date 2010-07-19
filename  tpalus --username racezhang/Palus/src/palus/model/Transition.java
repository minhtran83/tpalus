package palus.model;

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
	private final String methodName;
	private final String methodDesc;
	
	public final List<Decoration> decorations = new ArrayList<Decoration>();
	
	//if it is a loop call, indicate how many loops it is
	private int loopNum = 0;
	
	public Transition(ModelNode srcNode, ModelNode destNode, String methodName, String methodDesc) {
		PalusUtil.checkNull(srcNode);
		PalusUtil.checkNull(destNode);
		PalusUtil.checkNull(methodName);
		PalusUtil.checkNull(methodDesc);
		//model the same class
		assert srcNode.getClassModel() == destNode.getClassModel();
		
		this.modelClass = srcNode.getModelledClass();
		this.srcNode = srcNode;
		this.destNode = destNode;
		this.methodName = methodName;
		this.methodDesc = methodDesc;
		this.transitionId = Stats.genTransitionID();
	}
	
	public int getTransitionID() {
		return this.transitionId;
	}
	
	public Class<?> getModelClass() {
		return this.modelClass;
	}
	
	public Class<?>[] getParamClasses() throws MethodNotExistInTransitionException {
		Method method = this.getTransitionMethod();
		return method.getParameterTypes();
	}
	
	public boolean isLoopTransition() {
		return srcNode == destNode;
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
	
	public String getMethodName() {
		return this.methodName;
	}
	
	public String getMethodDesc() {
		return this.methodDesc;
	}
	
	public void addDecoration(Decoration decoration) {
		assert decoration.transition == this;
		PalusUtil.checkNull(decoration);
		this.decorations.add(decoration);
	}
	
	public Method getTransitionMethod() throws MethodNotExistInTransitionException {
		Method[] methods = this.modelClass.getDeclaredMethods();
		for(Method method : methods) {
			if(Type.getMethodDescriptor(method).equals(this.methodDesc)
				&& method.getName().equals(this.methodName)	) {
				return method;
			}
		}
		
		throw new MethodNotExistInTransitionException("Method: "
				+ this.methodName + ", " + this.methodDesc
				+ " does not exist in transition: " + this);
	}
	
	@Override
	public boolean equals(Object t) {
		if(!(t instanceof Transition)) {
			return false;
		}
		Transition transition = (Transition)t;
		return transition.getSourceNode() == this.getSourceNode()
		    && transition.getDestNode() == this.getDestNode()
		    && transition.getMethodName().equals(this.getMethodName())
		    && transition.getMethodDesc().equals(this.getMethodDesc());
	}
	
	@Override
	public String toString() {
		return "Transition: (" + this.getMethodName() + ":" + this.getMethodDesc()
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
		 * represents the corresponding parameter value */
		public final int position;
		
		public Decoration(Object thiz, Object[] params, Transition transition, int position)
		    throws MethodNotExistInTransitionException {
			//check the input first
			PalusUtil.checkNull(transition);
			PalusUtil.checkNull(params);
			assert position >=0 && position <= params.length;
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