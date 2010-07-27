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
	  }
	  
	  this.exit = exit;
	}
	
	//this is used for merging models
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
	
	public void deleteModelNode(ModelNode node) throws ModelNodeNotFoundException {
	  PalusUtil.checkNull(node);
	  PalusUtil.checkNull(this.root != null);
	  
	  this.checkExistence(node);
	  //remove its transitions
	  List<Transition> outEdges = node.getAllOutgoingEdges();
	  List<Transition> inEdges = node.getAllIncomingEdges();
	  
	  for(Transition t : outEdges) {
	    t.getDestNode().getAllIncomingEdges().remove(t);
	    this.transitions.remove(t);
	  }
	  for(Transition t : inEdges) {
	    t.getSourceNode().getAllOutgoingEdges().remove(t);
	    this.transitions.remove(t);
	  }
	  this.nodes.remove(node);
	}
	
	public void addModelNodes(List<ModelNode> nodes) {
	  PalusUtil.checkNull(nodes);
	  for(ModelNode node : nodes) {
	    this.addModelNode(node);
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
	    try {
            mergeNode(this.root, model.root);
            //do some postprocessing about all merged nodes
            this.postprocessMergedNodes();
            //unify all exit nodes, and check the invariant after merge
            this.unifyAllExitNodes();
            //check the invariant
            this.checkRep();
        } catch (ModelNodeNotFoundException e) {
            throw new RuntimeException(e);
        }
	}
	
	public void addTransition(Transition transition) throws ModelNodeNotFoundException {
	    ModelNode src = transition.getSourceNode();
	    ModelNode dest = transition.getDestNode();
	    this.checkExistence(src);
	    this.checkExistence(dest);
	    
	    if(!hasTransition(transition)) {
            this.transitions.add(transition);
            //if(!src.getAllOutgoingEdges().contains(transition)) {
                src.addOutgoingEdge(transition);
            //}
            //if(!dest.getAllIncomingEdges().contains(transition)) {
                dest.addIncomingEdge(transition);
           // }
        } else {
            //TODO we should add some actions here
        }
	}
	
	public void addTransitions(List<Transition> transitions) throws ModelNodeNotFoundException {
	  for(Transition transition : transitions) {
	    this.addTransition(transition);
	  }
	}
	
	//the ClassModel is node-oriented, so we do not need delete transition
//	public void deleteTransition(Transition transition) {
//	  PalusUtil.checkTrue(this.transitions.contains(transition));
//	  transition.getSourceNode().getAllOutgoingEdges().remove(transition);
//	  transition.getDestNode().getAllIncomingEdges().remove(transition);
//	  this.transitions.remove(transition);
//	}
	
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
	
	/**
	 * It is a recursive method to merge the same transitions below each node
	 * @throws ModelNodeNotFoundException 
	 * */
	private void mergeNode(ModelNode destNode,  ModelNode tobeMerged) throws ModelNodeNotFoundException {
	    System.out.print("merging...");
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
            Transition newTransition = new Transition(destNode, t.getDestNode(), t.getClassName(), t.getMethodName(), t.getMethodDesc());
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
	
	private List<ModelNode> getAllSubNodes(ModelNode node) {
	  PalusUtil.checkNull(node);
	  Set<ModelNode> subNodes = new HashSet<ModelNode>();
	  
	  //do a breadth-first traverse
	  List<ModelNode> tmp = new LinkedList<ModelNode>();
	  tmp.addAll(node.getAllOutgoingNodes());
	  while(!tmp.isEmpty()) {
	    ModelNode n = tmp.remove(0);
	    subNodes.add(n);
	    //avoid duplicate, ugly code, here
	    for(ModelNode mn : n.getAllOutgoingNodes()) {
	      if(!tmp.contains(mn)) {
	         tmp.add(mn);
	      }
	    }
	  }
	  
	  return new LinkedList<ModelNode>(subNodes);
	}
	
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
	
	private void postprocessMergedNodes() {
	  //for each model node which is fetched from other class model, we set their
	  //class model as this. Then, we remove all other redundant edges for each
	  //model node, which does not belong to the model's edges.
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
    /* exit nodes,, which violates the invariants defined in this class.
    /* We will unify all these exit nodes 
	 * @throws ModelNodeNotFoundException */
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
	  PalusUtil.checkTrue(exitNodes.size() > 0);
	  for(ModelNode exitNode : exitNodes) {
	    PalusUtil.checkTrue(exitNode.numOfInEdges() > 0);
	  }
	  //log the number of exit nodes
	  Log.log("start unifying all exits");
	  Log.log("number of exit nodes: " + exitNodes.size());
	  for(ModelNode node : exitNodes) {
	    Log.log("     " + node.getNodeId());
	  }
	  
	  //we do not need to unify if there is only one node
	  if(exitNodes.size() == 1) {
	    this.resetExit(exitNodes.get(0));
	    return;
	  }
	  //start to unify all the exit
	  //we first pick up the first node as the target node, all unify all exit
	  //nodes to it
	  ModelNode unifiedExit = exitNodes.remove(0);
	  
	  Log.log("choose: " + unifiedExit.getNodeId() + " as unified exit");
	  
	  PalusUtil.checkTrue(unifiedExit.isExitNode());
	  //go through each of remaining exit nodes
	  for(ModelNode otherExit : exitNodes) {
	    for(Transition transition : otherExit.getAllIncomingEdges()) {
	        Transition newTransition = new Transition(transition.getSourceNode(), unifiedExit,
	            transition.getClassName(), transition.getMethodName(), transition.getMethodDesc());
	        //also copy its decorations
	        newTransition.addDecorations(transition.makeClones(newTransition));
	        this.addTransition(newTransition);
	        //XXX replace transitions
	        TraceTransitionManager.replaceTransitions(transition, newTransition);
	    }
	    //actually it also delete the transitions
	    this.deleteModelNode(otherExit);
	  }
	  //reset the exit
	  PalusUtil.checkTrue(unifiedExit.isExitNode());
	  this.resetExit(unifiedExit);
	}
	

	/**some model utility methods here for faciliting
	 * manipulate the model */
}