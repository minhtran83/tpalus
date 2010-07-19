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
}