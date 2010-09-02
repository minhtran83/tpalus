// Copyright 2010 Google Inc. All Rights Reserved.
package palus.model;

import java.io.Serializable;

import palus.PalusUtil;

/**
 * Represents the direct state transition dependence relation from one transition
 * to another model node. It indicates that the transition (actually a method call)
 * requires the object state of the dependent model node.
 * 
 * @author saizhang@google.com (Sai Zhang)
 * 
 * <em>Note:</em> XXX Have not tested on serialization part
 * */
public class DependenceEdge implements Serializable {
	
	/**A transition depends on a node*/
	private final Transition transition;
	private final ModelNode dependentNode;
	
	/**
	 * The only constructor
	 * */
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