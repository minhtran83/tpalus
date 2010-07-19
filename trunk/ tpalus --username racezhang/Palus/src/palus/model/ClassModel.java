package palus.model;
import java.util.HashSet;
import java.util.Set;

import palus.Log;
import palus.PalusUtil;

public class ClassModel {
	
	private final Class<?> modelledClass;
	private final Set<ModelNode> nodes = new HashSet<ModelNode>();
	private final Set<Transition> transitions = new HashSet<Transition>();
	
	private ModelNode root = null;
	
	public ClassModel(Class<?> modelledClass) {
		PalusUtil.checkNull(modelledClass);
		this.modelledClass = modelledClass;
	}
	
	public Class<?> getModelledClass() {
		return this.modelledClass;
	}
	
	public void setRoot(ModelNode root) throws ModelNodeNotFoundException {
		assert root == null;
		PalusUtil.checkNull(root);
		this.checkExistence(root);
		
		this.root = root;
	}
	
	public ModelNode getRoot() {
		assert root != null;
		return this.root;
	}
	
	public void addModelNode(ModelNode node) {
		if(!this.nodes.contains(node)) {
			this.nodes.add(node);
		} else {
			Log.log("ModeNode: " + node.getNodeId()
					+ " has already existed!");
		}
	}
	
	//merge the model into the current one
	public void mergeModel(ClassModel model) {
		PalusUtil.checkNull(model);
		PalusUtil.checkTrue(model.getModelledClass() == this.getModelledClass());
		
	}
	
	//XXX this should have more information in params
	public void addTransition(ModelNode src, ModelNode dest, String methodName, String methodDesc)
	    throws ModelNodeNotFoundException {
		this.checkExistence(src);
		this.checkExistence(dest);
		
		Transition transition = new Transition(src, dest, methodName, methodDesc);
		if(!hasTransition(transition)) {
		    this.transitions.add(transition);
		    src.addOutgoingEdge(transition);
		    dest.addIncomingEdge(transition);
		} else {
			//TODO we should add some actions here
		}
	}
	
	/**
	 * Check the invariant of this object
	 * */
	public boolean checkRep() {
		return false;
	}
	
	private boolean hasTransition(Transition transition) {
		for(Transition t : this.transitions) {
			if(t.equals(transition)) {
				return true;
			}
		}
		return false;
	}
	
	private void checkExistence(ModelNode nodeToCheck) throws ModelNodeNotFoundException {
		PalusUtil.checkNull(nodeToCheck);
		for(ModelNode node : this.nodes) {
			if(node.equals(nodeToCheck)) {
				return;
			}
		}
		
		throw new ModelNodeNotFoundException("Model node: " + nodeToCheck 
				+ " does not found in current ClassModel: " + this);
	}
	
	/**some model utility methods here for faciliting
	 * manipulate the model */
}
