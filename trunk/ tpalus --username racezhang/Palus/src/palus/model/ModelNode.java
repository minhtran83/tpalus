package palus.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import palus.PalusUtil;
import palus.trace.Stats;

public class ModelNode {
	private final int nodeid;
	private final Class<?> modelledClass;
	//private final AbstractState state;
	
	private final List<Transition> inEdges = new ArrayList<Transition>();
	private final List<Transition> outEdges = new ArrayList<Transition>();

	//can not make it final because we need to merge models
    private ClassModel classModel;
	
	public ModelNode(ClassModel classModel) {
		PalusUtil.checkNull(classModel);
		this.classModel = classModel;
		this.modelledClass = classModel.getModelledClass();
		this.nodeid = Stats.genModelNodeID();
		
		//XXX untouched yet
		//this.state = null;
	}
	
	public boolean isRootNode() {
		//XXX not reliable enough
		return this.inEdges.size() == 0;
	}
	
	public boolean isExitNode() {
	  //XXX not reliable enough
	  return this.outEdges.size() == 0;
	}
	
	public List<Transition> getAllOutgoingEdges() {
		return this.outEdges;
	}
	
	public int numOfOutEdges() {
		return this.outEdges.size();
	}
	
	public void addOutgoingEdge(Transition transition) {
		PalusUtil.checkNull(transition);
		assert transition.getSourceNode() == this;
		
		if(!this.outEdges.contains(transition)) {
		    this.outEdges.add(transition);
		}
	}
	
	public List<ModelNode> getAllOutgoingNodes() {
	    List<ModelNode> subNodes = new LinkedList<ModelNode>();
	    for(Transition transition : this.outEdges) {
	      PalusUtil.checkTrue(transition.getSourceNode() == this);
	      PalusUtil.checkNull(transition.getDestNode());
	      subNodes.add(transition.getDestNode());
	    }
	    return subNodes;
	}
	
	public List<Transition> getAllIncomingEdges() {
		return this.inEdges;
	}
	
	public int numOfInEdges() {
		return this.inEdges.size();
	}
	
	public void addIncomingEdge(Transition transition) {
		PalusUtil.checkNull(transition);
		assert transition.getDestNode() == this;
		
		if(!this.inEdges.contains(transition)) {
		    this.inEdges.add(transition);
		}
	}
	
	public int getNodeId() {
		return this.nodeid;
	}
	
	public ClassModel getClassModel() {
		return this.classModel;
	}
	
	public void setClassModel(ClassModel newModel) {
	  //make sure they are modelling the same class
	  PalusUtil.checkTrue(newModel.getModelledClass() == this.modelledClass);
	  this.classModel = newModel;
	}
	
	public Class<?> getModelledClass() {
		return this.modelledClass;
	}
	
	/** If there is no matched transition, just return null */
	public Transition getOutgoingTranisitionBySignature(Transition transition) {
	  for(Transition t : this.outEdges) {
	    if(t.toSignature().equals(transition.toSignature())) {
	      return t;
	    }
	  }
	  return null;
	}
	
	public String getNodeInfo() {
	  StringBuilder sb = new StringBuilder();
	  sb.append(this.nodeid);
	  sb.append(" \n    ");
	  sb.append("incoming transitions: ");
	  for(Transition t : this.inEdges) {
	    sb.append(t.getTransitionID() + "  ");
	  }
	  sb.append("\n    ");
	  sb.append("outgoing transitions: ");
	  for(Transition t : this.outEdges) {
	    sb.append(t.getTransitionID() + "  ");
	  }
	  return sb.toString();
	}
	
	@Override
	public int hashCode() {
	  return 13 * this.getNodeId();
	}
	
	@Override
	public boolean equals(Object node) {
		if(!(node instanceof ModelNode)) {
			return false;
		} else {
			ModelNode modelNode = (ModelNode)node;
			return modelNode.getNodeId() == this.getNodeId();
		}
	}
	
	public boolean checkRep() {
		//check the property of this data structure
		return false;
	}
	
}