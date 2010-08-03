package palus.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import palus.PalusUtil;
import palus.trace.Stats;

public class ModelNode implements Serializable {
	private final int nodeid;
	private final Class<?> modelledClass;
	//private final AbstractState state;
	
	private /*final*/ transient List<Transition> inEdges = new ArrayList<Transition>();
	private /*final*/ transient List<Transition> outEdges = new ArrayList<Transition>();

	//can not make it final because we need to merge models
    private ClassModel classModel;
    
    //a flag for test generation purpose. True means that this could be
    //a terminate node for test generation
    private boolean stopFlag = false;
    //use for serialization purpose
    private int[] in_edge_transition_id;
    private int[] out_edge_transition_id;
	
	public ModelNode(ClassModel classModel) {
		PalusUtil.checkNull(classModel);
		this.classModel = classModel;
		this.modelledClass = classModel.getModelledClass();
		this.nodeid = Stats.genModelNodeID();
		
		//XXX untouched yet
		//this.state = null;
	}
	
	/**
	 * called before serialization
	 * */
	void saveForSerialization() {
	  this.in_edge_transition_id = new int[this.inEdges.size()];
	  this.out_edge_transition_id = new int[this.outEdges.size()];
	  int i = 0;
	  for(Transition t : inEdges) {
	    this.in_edge_transition_id[i++] = t.getTransitionID();
	  }
	  i = 0;
	  for(Transition t : outEdges) {
	    this.out_edge_transition_id[i++] = t.getTransitionID();
	  }
	}
	
	void recoverFromDeserialization() {
	  PalusUtil.checkNull(classModel);
	  this.inEdges = new ArrayList<Transition>();
	  for(int in_edge_id : this.in_edge_transition_id) {
	    Transition t = classModel.findTransitionById(in_edge_id);
	    PalusUtil.checkNull(t);
	    this.inEdges.add(t);
	  }
	  this.outEdges = new ArrayList<Transition>();
	  for(int out_edge_id : this.out_edge_transition_id) {
	    Transition t = classModel.findTransitionById(out_edge_id);
	    PalusUtil.checkNull(t);
	    this.outEdges.add(t);
	  }
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
	
	public boolean hasStopFlag() {
	  return this.stopFlag;
	}
	
	public void setStopFlag() {
	  this.stopFlag = true;
	}
	
	public void removeStopFlag() {
	  this.stopFlag = false;
	}
	
	/** If there is no matched transition, just return null.
	 * A transitions's signature only consists of its class name, method desc,
	 * and method name*/
	public Transition getOutgoingTranisitionBySignature(Transition transition) {
	  for(Transition t : this.outEdges) {
	    if(t.toSignature().equals(transition.toSignature())) {
	      return t;
	    }
	  }
	  return null;
	}
	
	/**
	 * This method returns a matched transition based on its signature and the
	 * position of its decorations
	 * */
	public Transition getOutgoingTransitionBySignatureAndPosition(Transition transition) {
	  for(Transition t : this.outEdges) {
	    if(t.toSignature().equals(transition.toSignature())) {
	      // check the position of its decorations
	      // first need to check that both transitions (this and the parameter) should have unique position
	      PalusUtil.checkTrue(t.hasDecoration());
	      PalusUtil.checkTrue(t.hasUniqueDecorationPosition());
	      PalusUtil.checkTrue(transition.hasDecoration());
	      PalusUtil.checkTrue(transition.hasUniqueDecorationPosition());
	      if(t.getUniqueDecorationPosition() == transition.getUniqueDecorationPosition()) {
	        return t;
	      }
	    }
	  }
	  //can not find a matched transition
	  return null;
	}
	
	/**
	 * Dump the basic information of this node
	 * */
	public String getNodeInfo() {
	  StringBuilder sb = new StringBuilder();
	  sb.append("Node id: " + this.nodeid + ", Model: " + this.getModelledClass());
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
		    //only using the node id
			ModelNode modelNode = (ModelNode)node;
			return modelNode.getNodeId() == this.getNodeId();
		}
	}
	
	/**
	 * Checking the invariant of this class
	 * */
	public void checkRep() {
	    PalusUtil.checkTrue(this.nodeid >= 0);
		PalusUtil.checkTrue(this.modelledClass == this.classModel.getModelledClass());
		for(Transition transition : this.getAllIncomingEdges()) {
		  PalusUtil.checkTrue(transition.getDestNode() == this);
		}
		for(Transition transition : this.getAllOutgoingEdges()) {
		  PalusUtil.checkTrue(transition.getSourceNode() == this);
		}
	}
	
}