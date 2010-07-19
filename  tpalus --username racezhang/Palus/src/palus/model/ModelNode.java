package palus.model;

import java.util.ArrayList;
import java.util.List;

import palus.AbstractState;
import palus.PalusUtil;
import palus.trace.Stats;

public class ModelNode {
	private final int nodeid;
	private final ClassModel classModel;
	private final AbstractState state;
	
	private final List<Transition> inEdges = new ArrayList<Transition>();
	private final List<Transition> outEdges = new ArrayList<Transition>();
	
	public ModelNode(ClassModel classModel) {
		PalusUtil.checkNull(classModel);
		this.classModel = classModel;
		this.nodeid = Stats.genModelNodeID();
		
		//XXX untouched yet
		this.state = null;
	}
	
	public boolean isRootNode() {
		//XXX not reliable enough
		return this.inEdges.size() == 0;
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
		
		this.outEdges.add(transition);
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
		
		this.inEdges.add(transition);
	}
	
	public int getNodeId() {
		return this.nodeid;
	}
	
	public ClassModel getClassModel() {
		return this.classModel;
	}
	
	public Class<?> getModelledClass() {
		return this.classModel.getClass();
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