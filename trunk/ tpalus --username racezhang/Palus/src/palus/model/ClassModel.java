package palus.model;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import palus.Log;
import palus.PalusUtil;
import palus.model.Transition.Decoration;
import palus.trace.Stats;
import plume.Pair;

public class ClassModel implements Serializable {
	
    private final int classModelID;
	private final Class<?> modelledClass;
	private final Set<ModelNode> nodes = new LinkedHashSet<ModelNode>();
	private final Set<Transition> transitions = new LinkedHashSet<Transition>();
	
	//can not make them to be final, need to change during model merging
	private ModelNode root = null;	
	private ModelNode exit = null;
	
	//keep track of its dependence information between transitions
//	private Map<Pair<Transition, Position>, Pair<ModelNode, Position>> dependence
//	    = new LinkedHashMap<Pair<Transition, Position>, Pair<ModelNode, Position>>();
	//
	
	//the flag to control different strategy in deleting non-public transitions
	//it could be either:
	// (1) if the flag is true, delete the non-public transition, and all
	//     its unreachable sub-transitions afterwards (which could be public
	//     transitions.
	// (2) if the flag is not true, delete the non-public transition, but move
	//     the next level calls up. e.g.
	//     m1 calls m2, then calls m3. If using the first strategy, when deleting
	//     m2 call, m3 will also be deleted, but using the second strategy, the
	//     call chain would be m1 calls m3
	public static boolean use_delete_in_removing_nonpublic = true;
	
	public ClassModel(Class<?> modelledClass) {
		PalusUtil.checkNull(modelledClass);
		this.modelledClass = modelledClass;
		this.classModelID = Stats.genClassModelID();
		//XXX is it a good idea to put add root/ add exit inside constructor?
	}
	
	/**
	 * This method needs to be called before serialization
	 * */
	public void saveForSerialization() {
	  for(ModelNode node : nodes) {
	    node.saveForSerialization();
	  }
	  for(Transition transition : transitions) {
	    transition.saveForSerialization();
	  }
	}
	
	/**
	 * This method needs to be called after deserialization
	 * */
	public void recoverFromDeserialization() {
	  //first recover transition
      for(Transition transition : transitions) {
        transition.recoverFromDeserialization();
      }
	  for(ModelNode node : nodes) {
	    node.recoverFromDeserialization();
	  }
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
	
	public Transition findTransitionById(int transitionId) {
	  for(Transition t : this.transitions) {
	    if(t.getTransitionID() == transitionId) {
	      return t;
	    }
	  }
	  return null;
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
            this.removeDanglingEdges();
            //unify all exit nodes, and check the invariant after merge
            this.unifyAllExitNodes();
            //check the invariant
            this.checkRep();
        } catch (ModelNodeNotFoundException e) {
            throw new RuntimeException(e);
        }
	}
	
	/**
	 * Removes non-public transitions from the model
	 * @throws ModelNodeNotFoundException 
	 * */
	public void removeNonPublicTransitions() throws ModelNodeNotFoundException {
	  //first check the invariant before removal
	  this.checkRep();
	  
	  //first find all nonpublic transitions
	  Set<Transition> nonPublicTransitions = new HashSet<Transition>();
	  for(Transition transition : this.transitions) {
	    if(transition.isMethod()) {
	      //add all method transition
	      Method m = transition.getMethod();
	      if(!Modifier.isPublic(m.getModifiers())) {
	        nonPublicTransitions.add(transition);
	      }
	    } else if(transition.isConstructor()) {
	      //add all constructor transition
	      Constructor<?> c = transition.getConstructor();
	      if(!Modifier.isPublic(c.getModifiers())) {
	        nonPublicTransitions.add(transition);
	      }
	    } else {
	      throw new BugInPalusException("A transition: " + transition.toSignature()
	          + " has neither method nor constructor.");
	    }
	  }	  
	  //remove all nonpublic transitions, and update their connecting nodes
	  for(Transition nonPublicTransition : nonPublicTransitions) {
	    nonPublicTransition.getSourceNode().getAllOutgoingEdges().remove(nonPublicTransition);
	    nonPublicTransition.getDestNode().getAllIncomingEdges().remove(nonPublicTransition);
	    //XXX update the repository?
	    this.transitions.remove(nonPublicTransition);
	  }
	  
	  Log.log("In class model: " + this.getModelledClass() + ", remove: "
	      + nonPublicTransitions.size() + " transitions out of " + this.transitions.size());
	  
	  //to unify the exit nodes
	  //two possibilities: 1) the original exit has no incoming edges
	  // 2) there is other node being isolated
	  this.removeUnreachableNodesFromRoot();
	  
	  //unify all the exit
	  this.unifyAllExitNodes();
	  
	  //finally check the invariant after removal
	  this.checkRep();
	  //check all transitions are public now
	  this.checkPublicTransitions();
	}
	
	/**
	 * Remove the dangling nodes. This method is called only in remove non-public transition.
	 * Since removing non-pubic transition, it is possible that some nodes are unreachable
	 * from the root.
	 * @throws ModelNodeNotFoundException 
	 * */
	private void removeUnreachableNodesFromRoot() throws ModelNodeNotFoundException {
	  PalusUtil.checkNull(this.root);
      PalusUtil.checkTrue(this.root.isRootNode());
	//get all dangling nodes (nodes which do not have incoming/outgoing edges)
      List<ModelNode> danglingNodes = new LinkedList<ModelNode>();
      List<ModelNode> reachableNodes = this.getAllSubNodes(this.root);
      for(ModelNode modelNode : this.nodes) {
        if(modelNode == this.root) {
          continue;
        }
        if(!reachableNodes.contains(modelNode)) {
          danglingNodes.add(modelNode);
        }
      }
      //remove all dangling nodes
      for(ModelNode modelNode : danglingNodes) {
          this.deleteModelNode(modelNode);
      }
      Log.log("In class model: " + this.getModelledClass() + ", remove: "
          + danglingNodes.size() + " dangling nodes.");      
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
	        + ":" + transition.getClassName() + ":" +  transition.getMethodName()
	        + ":" + transition.getMethodDesc() +  "----->  "
	        + transition.getDestNode().getNodeId() + "\n");
	    sb.append("           unique decoration position? " + transition.hasUniqueDecorationPosition() + "\n");
	    if(transition.hasUniqueDecorationPosition() && transition.hasDecoration()) {
	        sb.append("             if so: " + transition.getUniqueDecorationPosition() + "\n");
	    }
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
	    Log.log("In check rep, sub node number after root: " + this.getAllSubNodes(this.root).size()
	        + ", all nodes: " + this.nodes.size());
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
	    //check the transition
	    for(Transition transition : this.transitions) {
	      try {
             this.checkExistence(transition.getSourceNode());
             this.checkExistence(transition.getDestNode());
          } catch (ModelNodeNotFoundException e) {
              throw new RuntimeException(e);
          }
	    }
	}
	
	/**
	 * Enhance the built class model with dependence information
	 * */
	public static void enhanceClassModel(Map<Class<?>, ClassModel> models,
	    Map<Pair<Transition, Position>, Pair<ModelNode, Position>> dependences) {
	  //just for logging purpose
	  Log.log("------- enhancing created models with dependence information -------");
	  for(Entry<Pair<Transition, Position>, Pair<ModelNode, Position>> entry : dependences.entrySet()) {
	    Log.log(" transition: " + entry.getKey().a.getTransitionID()
	        + " position: " + entry.getKey().b.toIntValue()
	        + " depends on model node:" + entry.getValue().a.getNodeId()
	        + " position: " + entry.getValue().b.toIntValue());
	    
	    //get the transition class
	    Class<?> modelled = entry.getKey().a.getModelledClass();
	    ClassModel model = models.get(modelled);
	    Log.log("Model for: " + modelled + " contains transition:? " + entry.getKey().a.toSignature()
	        + ":    " +  model.hasTransition(entry.getKey().a));
	    modelled = entry.getValue().a.getModelledClass();
	    model = models.get(modelled);
	    Log.log("Model for: " + modelled + " contains node:?" + model.hasNode(entry.getValue().a));
	    Log.log("\n");
	  }
	}
	
	/**
	 * Check whether all transitions are public
	 * */
	private void checkPublicTransitions() {
	  for(Transition transition : this.transitions) {
	    PalusUtil.checkTrue(transition.isPublicTransition());
	  }
	}
	
	private boolean hasNode(ModelNode node) {
	  for(ModelNode n : this.nodes) {
	    if(n.equals(node)) {
	      return true;
	    }
	  }
	  return false;
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
	    //no need to merge
	    if(destNode == tobeMerged) {
	      Log.log("Two nodes are identical, we return! dest node: " + destNode.getNodeId()
	          +", tobeMerged node: " + tobeMerged.getNodeId());
	      return;
	    }
	    //System.out.print("merging...");
	    //if both are exit nodes, the recursion ends
	    if(destNode.isExitNode() && tobeMerged.isExitNode()) {
	      Log.log("At the end, dest node: " + destNode.getNodeId() + " and tobeMerged node: "
	          + tobeMerged.getNodeId() + " are all exits!");
	      return;
	    }
	    //that is OK, we stop merge, the tobeMerged node is actually a part
        //of the destination node
        else if(!destNode.isExitNode() && tobeMerged.isExitNode()) {
          destNode.setStopFlag();
          Log.log("We stop merge, dest node: " + destNode.getNodeId() + " is not an exit node,"
              + " but tobeMerged node: " + tobeMerged.getNodeId() +  "  is an exit node");
          return;
        }
	    //let's extend destNode with tobeMerged's subtree
	    else if(destNode.isExitNode() && !tobeMerged.isExitNode()) {
	      destNode.setStopFlag();
	      Log.log("Merge proceed, dest node: " + destNode.getNodeId() + " is an exit node, "
	          + "tobeMerged node: "  + tobeMerged.getNodeId() + " is not an exit node");
          //XXX add all sub nodes, not include this one
	      List<ModelNode> subNodes = this.getAllSubNodes(tobeMerged);
	      Log.log("    we add all: " + subNodes.size() + " sub nodes below tobeMerged: "
	          + tobeMerged.getNodeId());
	      for(ModelNode subNode : subNodes) {
	        Log.log("          sub node id: " + subNode.getNodeId());
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
          Log.log("    number of sub transitions added: " + subTransitions.size()
              + ", after tobemerged node: " + tobeMerged.getNodeId());
          for(Transition subT : subTransitions) {
            Log.log("           added sub transitions: " + subT.getSourceNode().getNodeId()
                + " --> " + subT.getDestNode().getNodeId());
          }
          destNode.getClassModel().addTransitions(subTransitions);
          
          PalusUtil.checkTrue(destNode.getClassModel() == this);
          Log.log("Finish merging, dest node is exit, to be merged is not: ");
          Log.log(destNode.getClassModel().getModelInfo());
	    }	    
	    else {
	      Log.log(" Both dest node: " + destNode.getNodeId() + " and tobeMerged node: "
	          + tobeMerged.getNodeId() +  " are not exit nodes.");
	      //do the recursion here, neither node is exit node, so we need to walk down one level
	      List<Transition> transitions = tobeMerged.getAllOutgoingEdges();
	      Log.log("number of outgoing transitions of tobeMerged node: " + transitions.size());
	      for(Transition transition : transitions) {
	        //we use the signature for comparison, only concern on the method name, desc, owner class
	        Transition destT = //destNode.getOutgoingTranisitionBySignature(transition); //XXX
	            destNode.getOutgoingTransitionBySignatureAndPosition(transition);
	        if(destT != null) {
	          //we go down one level to continue merging
	          PalusUtil.checkTrue(destT.getSourceNode() == destNode && transition.getSourceNode() == tobeMerged);
	          //XXX do the merge here, will cause error
	          //TraceTransitionManager.mergeTransitions(destT, transition);
	          //merge the decoration
	          for(Decoration d : transition.getDecorations()) {
	            destT.addDecoration(d.makeClone(destT));
	          }
	          /** merge recursively */
	          Log.log(" Find the same transition, so recusrively proceed, dest node/to be merged nodes:  "
	              + destT.getDestNode().getNodeId() + " " + transition.getDestNode().getNodeId());
	          this.mergeNode(destT.getDestNode(), transition.getDestNode());
	        } else {
	          Log.log(" -- add new edge from node: " + destNode.getNodeId() + " to node: "
	              + transition.getDestNode().getNodeId());
	          destNode.getClassModel().addModelNode(transition.getDestNode());
	          destNode.getClassModel().addModelNodes(this.getAllSubNodes(transition.getDestNode()));
	          List<Transition> subTransitions = this.getAllSubTransitions(transition.getDestNode());
	          Transition newTransition = new Transition(destNode, transition.getDestNode(), transition.getClassName(),
	              transition.getMethodName(), transition.getMethodDesc());
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
	private void removeDanglingEdges() {
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