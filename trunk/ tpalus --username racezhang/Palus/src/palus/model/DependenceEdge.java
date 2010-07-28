package palus.model;

import palus.PalusUtil;

/**
 * This class connect one transition to a model node.
 * */
public class DependenceEdge {
	
	/**A transition depends on a node*/
	private final Transition transition;
	private final ModelNode dependentNode;
	
	public DependenceEdge(Transition transition, ModelNode node) {
		PalusUtil.checkNull(transition);
		PalusUtil.checkNull(node);
		
		this.transition = transition;
		this.dependentNode = node;
	}
	
	public Transition getTransition() {
		return this.transition;
	}
	
	public ModelNode getDependentNode() {
		return this.dependentNode;
	}
	
	@Override
	public int hashCode() {
	  return 5*this.transition.hashCode() + 29*this.dependentNode.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
	  if(!(obj instanceof DependenceEdge)) {
	    return false;
	  } else {
	    DependenceEdge edge = (DependenceEdge)obj;
	    return this.transition.equals(edge.getTransition())
	        && this.dependentNode.equals(edge.getDependentNode());
	  }
	}
	
	@Override
	public String toString() {
	  return "Transition: " + transition.toSignature() + " depends on node: "
	      + dependentNode.getNodeId();
	}
}