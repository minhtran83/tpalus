package palus.model;
import java.io.Serializable;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import palus.Log;
import palus.PalusUtil;
import palus.model.Transition.Decoration;
import palus.trace.Stats;

public class ClassModel implements Serializable {
	
    private final int classModelID;
	private final Class<?> modelledClass;
	private final Set<ModelNode> nodes = new HashSet<ModelNode>();
	private final Set<Transition> transitions = new HashSet<Transition>();
	
	//can not make them to be final, need to change during model merging
	private ModelNode root = null;	
	private ModelNode exit = null;
	
	public ClassModel(Class<?> modelledClass) {
		PalusUtil.checkNull(modelledClass);
		this.modelledClass = modelledClass;
		this.classModelID = Stats.genClassModelID();
		//XXX is it a good idea to put add root/ add exit inside constructor?
	}
	
	public int getClassModelID() {
	  return this.classModelID;
	}
	
	public Class<?> getModelledClass() {
		return this.modelledClass;
	}
	
	public Set<ModelNode> getAllNodes() {
	  return this.nodes;
	}
	
	public Set<Transition> getAllTransitions() {
	  return this.transitions;
	}
	
	public void addRoot(ModelNode root) {
		PalusUtil.checkTrue(this.root == null);
		PalusUtil.checkNull(root);
		if(!this.nodes.contains(root)) {
		  this.nodes.add(root);
		} else {
		  Log.log("Root: " + root + " already exists.");
		}
		this.root = root;
	}
	
	public ModelNode getRoot() {
		PalusUtil.checkNull(this.root);
		PalusUtil.checkTrue(this.root.isRootNode());
		return this.root;
	}
	
	public void addExit(ModelNode exit) {
	  PalusUtil.checkTrue(this.exit == null);
	  PalusUtil.checkNull(exit);
	  if(!this.nodes.contains(exit)) {
	    this.nodes.add(exit);
	  } else {
	    Log.log("Exit: " + exit + " already exists.");
	  }	  
	  this.exit = exit;
	}
	
	/**
	 * This method is used during model merging
	 * */
	public void resetExit(ModelNode newExit) {
	  PalusUtil.checkNull(this.exit);
	  //XXX PalusUtil.checkTrue(!this.exit.isExitNode() ||  !this.nodes.contains(exit));
	  PalusUtil.checkNull(newExit);
	  PalusUtil.checkTrue(newExit.isExitNode());
	  if(!this.nodes.contains(newExit)) {
	    throw new RuntimeException("You could only reset an existing node.");
	  }
	  this.exit = newExit;
	}
	
	public ModelNode getExit() {
	  PalusUtil.checkNull(this.exit);
	  PalusUtil.checkTrue(this.exit.isExitNode());
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
    
    public void addModelNodes(List<ModelNode> nodes) {
      PalusUtil.checkNull(nodes);
      for(ModelNode node : nodes) {
        this.addModelNode(node);
      }
    }
	
	/**
	 * When deleting a node, its neighbor edges will also be deleted.
	 * */
	public void deleteModelNode(ModelNode node) throws ModelNodeNotFoundException {
	  PalusUtil.checkNull(node);
	  PalusUtil.checkNull(this.root != null);
	  
	  this.checkExistence(node);
	  //remove its transitions
	  List<Transition> outEdges = node.getAllOutgoingEdges();
	  List<Transition> inEdges = node.getAllIncomingEdges();
	  //update the edge information of all neighboring nodes
	  for(Transition t : outEdges) {
	    t.getDestNode().getAllIncomingEdges().remove(t);
	    this.transitions.remove(t);
	  }
	  for(Transition t : inEdges) {
	    t.getSourceNode().getAllOutgoingEdges().remove(t);
	    this.transitions.remove(t);
	  }
	  //remove the node
	  this.nodes.remove(node);
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
            Log.log("New added transtion: " + transition + " already exists.");
        }
    }
    
    public void addTransitions(List<Transition> transitions) throws ModelNodeNotFoundException {
      for(Transition transition : transitions) {
        this.addTransition(transition);
      }
    }
	
	/**
	 * Merge the model into the current one
	 * */
	public void mergeModel(ClassModel model) {
		PalusUtil.checkNull(model);
		PalusUtil.checkNull(this.root);
		PalusUtil.checkNull(this.exit);
		PalusUtil.checkNull(model.root);
		PalusUtil.checkNull(model.exit);
		PalusUtil.checkTrue(model.getModelledClass() == this.getModelledClass());
		
		//The merge algorithm is a recursive one, which which the graph node
		//from root. And do that level by level following the outgoing edges.
		//XXX think about is there any information loss here??
	    try {
            mergeNode(this.root, model.root);
            //do some postprocessing about all merged nodes
            //remove dangling edges
            this.postprocessMergedNodes();
            //unify all exit nodes, and check the invariant after merge
            this.unifyAllExitNodes();
            //check the invariant
            this.checkRep();
        } catch (ModelNodeNotFoundException e) {
            throw new RuntimeException(e);
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
	    sb.append("   " + transition.getSourceNode().getNodeId() + ":"
	        + transition.getDecorations().size() + "   ------" + transition.getTransitionID()
	        + ":" + transition.getMethodName()  + ":" + transition.getMethodDesc() +  "----->  "
	        + transition.getDestNode().getNodeId() + "\n");
	    List<Decoration> decorations = transition.getDecorations();
	    for (Decoration decoration : decorations) {
	        sb.append("          " + decoration.toString() + "\n");
	    }
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
	public void checkRep() {
	    PalusUtil.checkNull(this.root);
	    PalusUtil.checkNull(this.exit);
	    PalusUtil.checkTrue(this.root.isRootNode());
	    PalusUtil.checkTrue(this.exit.isExitNode());
	    //all nodes are reachable from root
	    PalusUtil.checkTrue(this.getAllSubNodes(this.root).size() + 1 == this.nodes.size());
	    //only one root, one exit
	    for(ModelNode node : this.nodes) {
	      if(node.isExitNode()) {
	        PalusUtil.checkTrue(node == exit);
	      }
	      if(node.isRootNode()) {
	        PalusUtil.checkTrue(node == root);
	      }
	    }
	}
	
	private boolean hasTransition(Transition transition) {
		for(Transition t : this.transitions) {
		    //equals has been overriden, compare src/dest nodes, and transition signature
			if(t.equals(transition)) {
				return true;
			}
		}
		return false;
	}
	
	private void checkExistence(ModelNode nodeToCheck) throws ModelNodeNotFoundException {
		PalusUtil.checkNull(nodeToCheck);
		for(ModelNode node : this.nodes) {
		    //only compare node id in equals
			if(node.equals(nodeToCheck)) {
				return;
			}
		}		
		throw new ModelNodeNotFoundException("Model node: " + nodeToCheck 
				+ " does not found in current ClassModel: " + this);
	}
	
	/**
	 * It is a recursive method to merge the same transitions below each node
	 * @throws ModelNodeNotFoundException 
	 * */
	private void mergeNode(ModelNode destNode,  ModelNode tobeMerged) throws ModelNodeNotFoundException {
	    //System.out.print("merging...");
	    //if both are exit nodes, the recursion ends
	    if(destNode.isExitNode() && tobeMerged.isExitNode()) {
	      Log.log(" -- both " + destNode.getNodeId() + " exit" + tobeMerged.getNodeId());
	      return;
	    }
	    //that is OK, we stop merge, the tobeMerged node is actually a part
        //of the destination node
        else if(!destNode.isExitNode() && tobeMerged.isExitNode()) {
          Log.log(" -- dest node " + destNode.getNodeId() + " is not exit, tobeMerged node is exit"
              + tobeMerged.getNodeId());
          return;
        }
	    //let's extend destNode with tobeMerged's subtree
	    else if(destNode.isExitNode() && !tobeMerged.isExitNode()) {
	      Log.log(" -- dest node " + destNode.getNodeId() + " is exit, tobeMerged node is not exit"
	          + tobeMerged.getNodeId());
          //XXX add all sub nodes, not include this one
	      List<ModelNode> subNodes = this.getAllSubNodes(tobeMerged);
	      Log.log("     sub nodes added: " + subNodes.size());
	      for(ModelNode subNode : subNodes) {
	        Log.log("            id: " + subNode.getNodeId());
	      }
          destNode.getClassModel().addModelNodes(subNodes);
          //XXX add all sub transitions
          //would be problematic
          List<Transition> subTransitions = this.getAllSubTransitions(tobeMerged);
          for(Transition t : tobeMerged.getAllOutgoingEdges()) {
            Transition newTransition = new Transition(destNode, t.getDestNode(),
                t.getClassName(), t.getMethodName(), t.getMethodDesc());
            //copy its decorations
            newTransition.addDecorations(t.makeClones(newTransition));
            subTransitions.add(newTransition);
            subTransitions.remove(t);
            //XXX update the repository
            TraceTransitionManager.replaceTransitions(t, newTransition);
          }
          Log.log("    sub transitions added: " + subTransitions.size());
          for(Transition subT : subTransitions) {
            Log.log("           " + subT.getSourceNode().getNodeId() + " --> " + subT.getDestNode().getNodeId());
          }
          destNode.getClassModel().addTransitions(subTransitions);
          
          PalusUtil.checkTrue(destNode.getClassModel() == this);
          Log.log(destNode.getClassModel().getModelInfo());
	    }	    
	    else {
	      Log.log(" -- both dest node " + destNode.getNodeId() + " is not exit, tobeMerged node is not exit "
	          + tobeMerged.getNodeId());
	      //do the recursion here, neither node is exit node, so we need to walk down one level
	      List<Transition> transitions = tobeMerged.getAllOutgoingEdges();
	      for(Transition transition : transitions) {
	        //we use the signature for comparison, only concern on the method name, desc, owner class
	        Transition destT = destNode.getOutgoingTranisitionBySignature(transition);
	        if(destT != null) {
	          //we go down one level to continue merging
	          PalusUtil.checkTrue(destT.getSourceNode() == destNode && transition.getSourceNode() == tobeMerged);
	          //XXX do the merge here
	          TraceTransitionManager.mergeTransitions(destT, transition);
	          //merge the decoration
	          for(Decoration d : transition.getDecorations()) {
	            destT.addDecoration(d.makeClone(destT));
	          }
	          /** merge recursively */
	          Log.log(" -- recusrive " + destT.getDestNode().getNodeId() + " " + transition.getDestNode().getNodeId());
	          this.mergeNode(destT.getDestNode(), transition.getDestNode());
	        } else {
	          Log.log(" -- add new edge to dest: " + destNode.getNodeId() + " from tobeMerged node: "
	              + tobeMerged.getNodeId());
	          destNode.getClassModel().addModelNode(transition.getDestNode());
	          destNode.getClassModel().addModelNodes(this.getAllSubNodes(transition.getDestNode()));
	          List<Transition> subTransitions = this.getAllSubTransitions(transition.getDestNode());
	          Transition newTransition = new Transition(destNode, transition.getDestNode(), transition.getClassName(), transition.getMethodName(), transition.getMethodDesc());
	          newTransition.addDecorations(transition.makeClones(newTransition));
	          subTransitions.add(newTransition);
	          destNode.getClassModel().addTransitions(subTransitions);
	          //XXX update the transition repository
	          TraceTransitionManager.replaceTransitions(transition, newTransition);
	        }
	      }
	    }
	}
	
	/**
	 * Get all sub nodes from a given one (excluding the given one)
	 * */
	private List<ModelNode> getAllSubNodes(ModelNode node) {
	  PalusUtil.checkNull(node);
	  Set<ModelNode> subNodes = new HashSet<ModelNode>();	  
	  //do a breadth-first traverse
	  List<ModelNode> tmp = new LinkedList<ModelNode>();
	  tmp.addAll(node.getAllOutgoingNodes());
	  while(!tmp.isEmpty()) {
	    ModelNode n = tmp.remove(0);
	    subNodes.add(n);
	    for(ModelNode mn : n.getAllOutgoingNodes()) {
	      //avoid duplication, check first
	      if(!tmp.contains(mn)) {
	         tmp.add(mn);
	      }
	    }
	  }	  
	  return new LinkedList<ModelNode>(subNodes);
	}
	
	/**
	 * Get all sub transitions from a given node (including the outgoing
	 * transitions from the given node)
	 * */
	private List<Transition> getAllSubTransitions(ModelNode node) {
	  PalusUtil.checkNull(node);	  
	  //add all connecting edges
	  Set<Transition> transitions = new HashSet<Transition>();
	  transitions.addAll(node.getAllOutgoingEdges());	  
	  //do a breadth-first traverse
	  List<ModelNode> tmp = new LinkedList<ModelNode>();
	  tmp.addAll(node.getAllOutgoingNodes());
	  while(!tmp.isEmpty()) {
	    ModelNode n = tmp.remove(0);
	    transitions.addAll(n.getAllOutgoingEdges());
	    //avoid duplicate, ugly code here
	    for(ModelNode mn : n.getAllOutgoingNodes()) {
	      if(!tmp.contains(mn)) {
	        tmp.add(mn);
	      }
	    }
	  }	  
	  return new LinkedList<Transition>(transitions);
	}
	
	/**
	 * Removes dangling edges (edges connected to some of the nodes, but do not
	 * belong to the edge set) after merging models
	 * */
	private void postprocessMergedNodes() {
	  //for each model node which is "fetched" from other class model during merge,
	  //we set its class model be this. Then, for each node, we remove its connecting
	  //edges (including outgoing and incoming), which do not belong to the edge
	  //set of this class model
	  for(ModelNode node : this.nodes) {
	    node.setClassModel(this);
	    //to be removed outgoing edges
	    List<Transition> outToBeRemoved = new LinkedList<Transition>();
	    for(Transition t : node.getAllOutgoingEdges()) {
	      if(!this.transitions.contains(t)) {
	        outToBeRemoved.add(t);
	      }
	    }
	    //to be removed incoming edges
	    List<Transition> inToBeRemoved = new LinkedList<Transition>();
	    for(Transition t : node.getAllIncomingEdges()) {
	      if(!this.transitions.contains(t)) {
	        inToBeRemoved.add(t);
	      }
	    }
	    //remove them from outgoing/incoming edges
	    node.getAllOutgoingEdges().removeAll(outToBeRemoved);
	    node.getAllIncomingEdges().removeAll(inToBeRemoved);
	  }
	}
	
	/** To ease the merging process, we tolerance the existence of multiple
     * exit nodes,, which violates the invariants defined in this class.
     * We will unify all these exit nodes */
	private void unifyAllExitNodes() throws ModelNodeNotFoundException {
	  //check the root invariant does not violate
	  PalusUtil.checkNull(this.root);
	  PalusUtil.checkNull(this.root.isRootNode());
	  //first get all exit nodes
	  List<ModelNode> exitNodes = new LinkedList<ModelNode>();
	  for(ModelNode node : this.nodes) {
	    if(node.numOfOutEdges() == 0) {
	      exitNodes.add(node);
	    }
	  }
	  //there must be more than one exit node after merging
	  //and each exit node should have more than one incoming edge
	  //If not, the exit node is disconnected!
	  PalusUtil.checkTrue(exitNodes.size() > 0);
	  for(ModelNode exitNode : exitNodes) {
	    PalusUtil.checkTrue(exitNode.numOfInEdges() > 0);
	  }
	  //we do not need to unify if there is only one node
      if(exitNodes.size() == 1) {
        this.resetExit(exitNodes.get(0));
        return;
      }
      
	  //log exit nodes info
	  Log.log("start unifying all exits");
	  Log.log("number of exit nodes: " + exitNodes.size());
	  for(ModelNode node : exitNodes) {
	    Log.log("     " + node.getNodeId());
	  }	  
	  
	  //When unifying all exit nodes, we first (randomly) pick the first
	  //exit node. Then, we use it to substitue all other exit nodes (reconnecting
	  //their incoming edges). Finally, all other exit nodes will be deleted.
	  ModelNode unifiedExit = exitNodes.remove(0);
	  
	  PalusUtil.checkTrue(unifiedExit.isExitNode());
	  Log.log("choose: " + unifiedExit.getNodeId() + " as unified exit");	  
	  
	  //reconnecting the incoming edges of other exit nodes to the unified exit
	  for(ModelNode otherExit : exitNodes) {
	    for(Transition transition : otherExit.getAllIncomingEdges()) {
	        //create a new transition
	        Transition newTransition = new Transition(transition.getSourceNode(),
	            unifiedExit /*for this unified exit node*/, transition.getClassName(),
	            transition.getMethodName(), transition.getMethodDesc());
	        //also copy its decorations to the newly created transition
	        newTransition.addDecorations(transition.makeClones(newTransition));
	        this.addTransition(newTransition);
	        //XXX update the trace transition mappings
	        TraceTransitionManager.replaceTransitions(transition, newTransition);
	    }
	    //delete other exit node (and its connecting edges)
	    this.deleteModelNode(otherExit);
	  }
	  //reset the exit
	  PalusUtil.checkTrue(unifiedExit.isExitNode());
	  this.resetExit(unifiedExit);
	}
	

	/**TODO add some model utility methods here for faciliting
	 * manipulate the model */
}