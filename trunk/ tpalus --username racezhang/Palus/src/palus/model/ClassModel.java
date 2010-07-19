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
	
	private ModelNode exit = null;
	
	public ClassModel(Class<?> modelledClass) {
		PalusUtil.checkNull(modelledClass);
		this.modelledClass = modelledClass;
		//is it a good to put add root/ add exit inside constructor?
	}
	
	public Class<?> getModelledClass() {
		return this.modelledClass;
	}
	
	public void addRoot(ModelNode root) {
		PalusUtil.checkTrue(this.root == null);
		PalusUtil.checkNull(root);
		if(!this.nodes.contains(root)) {
		  this.nodes.add(root);
		}
		this.root = root;
	}
	
	public ModelNode getRoot() {
		PalusUtil.checkNull(this.root);
		return this.root;
	}
	
	public void addExit(ModelNode exit) {
	  PalusUtil.checkTrue(this.exit == null);
	  PalusUtil.checkNull(exit);
	  if(!this.nodes.contains(exit)) {
	    this.nodes.add(exit);
	  }
	  
	  this.exit = exit;
	}
	
	public ModelNode getExit() {
	  PalusUtil.checkNull(this.exit);
	  return this.exit;
	}
	
	public void addModelNode(ModelNode node) {
	    PalusUtil.checkNull(node);
	    PalusUtil.checkTrue(this.root != null);
	    
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
		PalusUtil.checkNull(this.root);
		PalusUtil.checkNull(this.exit);
		PalusUtil.checkNull(model.root);
		PalusUtil.checkNull(model.exit);
		PalusUtil.checkTrue(model.getModelledClass() == this.getModelledClass());
		
		//throw new RuntimeException("Have not been implemented");
		//start from root, then begin merging
		//XXX think about is there any information loss here??
		
	}
	
	public void addTransition(Transition transition) throws ModelNodeNotFoundException {
	    ModelNode src = transition.getSourceNode();
	    ModelNode dest = transition.getDestNode();
	    this.checkExistence(src);
	    this.checkExistence(dest);
	    
	    if(!hasTransition(transition)) {
            this.transitions.add(transition);
            src.addOutgoingEdge(transition);
            dest.addIncomingEdge(transition);
        } else {
            //TODO we should add some actions here
        }
	}
	
	/**
	 * Print a brielf summary for the model
	 * */
	public String getModelInfo() {
	  PalusUtil.checkNull(this.root);
	  PalusUtil.checkNull(this.exit);
	  
	  StringBuilder sb = new StringBuilder();
	  sb.append("---------- model info start ----------\n");
	  sb.append("Class model: " + this.getModelledClass().getName() + "\n");
	  sb.append("Number of nodes: " + this.nodes.size() + "\n");
	  sb.append("Number of edges: " + this.transitions.size() + "\n");
	  sb.append("Root node id: " + this.root.getNodeId() + "\n");
	  sb.append("Exit root id: " + this.exit.getNodeId() + "\n");
	  sb.append("All nodes: \n");
	  sb.append("   ");
	  for(ModelNode node : this.nodes) {
	    sb.append(node.getNodeInfo() + "\n");
	  }
	  sb.append("\n");
	  sb.append("All transitions: \n");
	  for(Transition transition : this.transitions) {
	    sb.append("   " + transition.getSourceNode().getNodeId() + "   ------" + transition.getTransitionID()
	        + ":" + transition.getMethodName()  + ":" + transition.getMethodDesc() +  "----->  "
	        + transition.getDestNode().getNodeId() + "\n");
	  }
	  sb.append("\n");
	  sb.append("---------------------------------------");
	  
	  return sb.toString();
	}
	
	public void clear() {
	  this.nodes.clear();
	  this.transitions.clear();
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
