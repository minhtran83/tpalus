package palus.model;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import palus.Log;
import palus.PalusUtil;
import palus.model.Transition.Decoration;
import palus.trace.Stats;

public class ClassModel {
	
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
		//XXX is it a good to put add root/ add exit inside constructor?
	}
	
	public int getClassModelID() {
	  return this.classModelID;
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
            
            //reset the exit and do some postprocessing (clean dangling edges/nodes)
            //to check. And check is there any invariant break during merging
            //this.postprocessAfterMerging();
            this.removeExtraEdgesAfterMerging();
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
            if(!src.getAllOutgoingEdges().contains(transition)) {
                src.addOutgoingEdge(transition);
            }
            if(!dest.getAllIncomingEdges().contains(transition)) {
                dest.addIncomingEdge(transition);
            }
        } else {
            //TODO we should add some actions here
        }
	}
	
	public void addTransitions(List<Transition> transitions) throws ModelNodeNotFoundException {
	  for(Transition transition : transitions) {
	    this.addTransition(transition);
	  }
	}
	
	public void deleteTransition(Transition transition) {
	  PalusUtil.checkTrue(this.transitions.contains(transition));
	  transition.getSourceNode().getAllOutgoingEdges().remove(transition);
	  transition.getDestNode().getAllIncomingEdges().remove(transition);
	  this.transitions.remove(transition);
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
	    sb.append("   " + transition.getSourceNode().getNodeId() + ":" + transition.getDecorations().size() + "   ------" + transition.getTransitionID()
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
	public void checkRep() {
	    PalusUtil.checkNull(this.root);
	    PalusUtil.checkNull(this.exit);
	    PalusUtil.checkTrue(this.root.isRootNode() && this.exit.isExitNode());
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
          Log.log(" -- dest node " + destNode.getNodeId() + " is not exit, to be merged is exit" + tobeMerged.getNodeId());
          return;
        }
	    //let's extend destNode with tobeMerged's subtree
	    else if(destNode.isExitNode() && !tobeMerged.isExitNode()) {
	      Log.log(" -- dest node " + destNode.getNodeId() + " is exit, to be merged is not exit" + tobeMerged.getNodeId());
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
            subTransitions.add(new Transition(destNode, t.getDestNode(), t.getClassName(), t.getMethodName(), t.getMethodDesc()));
            subTransitions.remove(t);
          }
          Log.log("    sub transitions added: " + subTransitions.size());
          for(Transition subT : subTransitions) {
            Log.log("           " + subT.getSourceNode().getNodeId() + " --> " + subT.getDestNode().getNodeId());
          }
          destNode.getClassModel().addTransitions(subTransitions);
          
          PalusUtil.checkTrue(destNode.getClassModel() == this);
          Log.log(destNode.getClassModel().getModelInfo());
          //reset the exit
	      //XXX be aware of the new exit node
//	      for(Transition transition : tobeMerged.getAllOutgoingEdges()) {
//	        destNode.addOutgoingEdge(new Transition(destNode, transition.getDestNode(),
//	            transition.getClassName(), transition.getMethodName(), transition.getMethodDesc()));
	        //remove the transition
//	        transition.getSourceNode().getAllOutgoingEdges().remove(transition);
//	        transition.getDestNode().getAllIncomingEdges().remove(transition);
//	      }
	      //XXXX redundant transitions here
//	      for(Transition transition : tobeMerged.getAllOutgoingEdges()) {
//	          tobeMerged.getClassModel().deleteTransition(transition);
//	      }
//	      destNode.getClassModel().resetExit(tobeMerged.getClassModel().getExit());
	    }	    
	    else {
	      Log.log(" -- both dest node " + destNode.getNodeId() + " is not exit, to be merged is not exit" + tobeMerged.getNodeId());
	      //do the recursion here, neither node is exit node, so we need to walk
	      //down one level
	      List<Transition> transitions = tobeMerged.getAllOutgoingEdges();
	      for(Transition transition : transitions) {
	        //we use the signature for comparison, only concern on the method name, desc, owner class
	        Transition destT = destNode.getOutgoingTranisitionBySignature(transition);
	        if(destT != null) {
	          //we go down one level to continue merging
	          PalusUtil.checkTrue(destT.getSourceNode() == destNode && transition.getSourceNode() == tobeMerged);
	          //merge the decoration
	          for(Decoration d : transition.getDecorations()) {
	            destT.addDecoration(d.makeClone(destT));
	          }
	          /** merge recursively */
	          Log.log(" -- recusrive " + destT.getDestNode().getNodeId() + " " + transition.getDestNode().getNodeId());
	          this.mergeNode(destT.getDestNode(), transition.getDestNode());
	        } else {
	          Log.log(" -- add new edge to dest: " + destNode.getNodeId() + " from to be merged: " + tobeMerged.getNodeId());
	          destNode.getClassModel().addModelNode(transition.getDestNode());
	          destNode.getClassModel().addModelNodes(this.getAllSubNodes(transition.getDestNode()));
	          List<Transition> subTransitions = this.getAllSubTransitions(transition.getDestNode());
	          subTransitions.add(new Transition(destNode, transition.getDestNode(), transition.getClassName(), transition.getMethodName(), transition.getMethodDesc()));
	          destNode.getClassModel().addTransitions(subTransitions); //node did not find?
	          
	          //add all the subtree from transitions
	          //XXX be aware of the exit change, and redundant edges, add outgoing edge maybe redundant
//	          destNode.addOutgoingEdge(new Transition(destNode, transition.getDestNode(),
//	              transition.getClassName(), transition.getMethodName(), transition.getMethodDesc()));
//	          //remove the transition
//	          transition.getSourceNode().getAllOutgoingEdges().remove(transition);
//	          transition.getDestNode().getAllIncomingEdges().remove(transition);
	          
	          //XXX reset the exit node here, or merge the exit node afterwards
//	          ModelNode exitToRemove = tobeMerged.getClassModel().getExit();
//	          ModelNode exitNode = destNode.getClassModel().getExit();
//	          destNode.getClassModel().addModelNode(exitNode);
//	          for(Transition t2Exit : exitToRemove.getAllIncomingEdges()) {
//	            destNode.getClassModel().addModelNode(t2Exit.getSourceNode());//???
//	            destNode.getClassModel().addTransition(new Transition(t2Exit.getSourceNode(), exitNode, t2Exit.getClassName(), t2Exit.getMethodName(), t2Exit.getMethodDesc()));
//	          }
//	          tobeMerged.getClassModel().deleteModelNode(exitToRemove);
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
	
	private void removeExtraEdgesAfterMerging() {
	  for(ModelNode node : this.nodes) {
	    node.setClassModel(this);
	    
	    List<Transition> outToBeRemoved = new LinkedList<Transition>();
	    for(Transition t : node.getAllOutgoingEdges()) {
	      if(!this.transitions.contains(t)) {
	        outToBeRemoved.add(t);
	      }
	    }
	    List<Transition> inToBeRemoved = new LinkedList<Transition>();
	    for(Transition t : node.getAllIncomingEdges()) {
	      if(!this.transitions.contains(t)) {
	        inToBeRemoved.add(t);
	      }
	    }
	    //remove them
	    node.getAllOutgoingEdges().removeAll(outToBeRemoved);
	    node.getAllIncomingEdges().removeAll(inToBeRemoved);
	  }
	}
	
	public void postprocessAfterMerging() {
	  PalusUtil.checkNull(this.root);
	  PalusUtil.checkTrue(this.root.isRootNode());
	  
	  //remove all unreachable nodes
	  List<ModelNode> reachableNodes = this.getAllSubNodes(this.root);
	  
	  //all removable nodes
	  List<ModelNode> shouldRemove = new LinkedList<ModelNode>();
	  for(ModelNode node : this.nodes) {
	    if(!reachableNodes.contains(node)) {
	      shouldRemove.add(node);
	    }
	  }
	  //remove it
	  for(ModelNode node :  shouldRemove) {
	      try {
              this.deleteModelNode(node);
          } catch (ModelNodeNotFoundException e) {
              throw new RuntimeException(e);
          }
	  }
	  
	  //get the new exit node
	  ModelNode exit = null;
	  for(ModelNode node : this.nodes) {
	    if(node.numOfOutEdges() == 0) {
	      if(exit != null) {
	        //XXX throw new RuntimeException("There can not be more than one exit node!");
	      }
	      exit = node;
	    }
	  }
	  
	  //reset the exit node
	  this.resetExit(exit);
	}
	/**some model utility methods here for faciliting
	 * manipulate the model */
}