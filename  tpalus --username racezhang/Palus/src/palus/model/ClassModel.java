// Copyright 2010 Google Inc. All Rights Reserved.
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
import palus.model.Transition.DecorationValue;
import palus.trace.Stats;
import plume.Pair;
import randoop.Globals;

/**
 * The core class in Palus. It represents a legal call sequence model built
 * from observed executions.
 * 
 * @author saizhang@google.com (Sai Zhang)
 *
 */
public class ClassModel implements Serializable {
	/**
	 * A unique id for each class model
	 * */
    private final int classModelID;
    /**
     * The class which this model represents
     * */
	private final Class<?> modelledClass;
	/**
	 * The set of all model nodes
	 * */
	private final Set<ModelNode> nodes = new LinkedHashSet<ModelNode>();
	/**
	 * The set of all model transitions
	 * */
	private final Set<Transition> transitions = new LinkedHashSet<Transition>();
	
	/**
	 * The model root node. 
	 * <em>Note: </em> can not make it to be final, since it needs to change
	 * during model merging process.
	 * */
	private ModelNode root = null;
	
	/**
     * The model exit node. 
     * <em>Note: </em> can not make it to be final, since it needs to change
     * during model merging process.
     * */
	private ModelNode exit = null;

	/**
	 * The flag to control different strategy in deleting non-public transitions
	 * it could be either:
	 * (1) if the flag is true, delete the non-public transition, and all
	 *     its unreachable sub-transitions afterwards (which could be public
	 *     transitions.
	 * (2) if the flag is not true, delete the non-public transition, but move
	 *     the next level calls up. e.g.
	 *     m1 calls m2, then calls m3. If using the first strategy, when deleting
	 *     m2 call, m3 will also be deleted, but using the second strategy, the
	 *     call chain would be m1 calls m3
	 * */
	public static boolean use_delete_in_removing_nonpublic = true;
	
	/**
	 * Creates an empty class model for the given type
	 * */
	public ClassModel(Class<?> modelledClass) {
		PalusUtil.checkNull(modelledClass, "The class to model could not be null!");
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
		PalusUtil.checkTrue(this.root == null, "There has already a root existed, no "
		    + "more root node could be added.");
		PalusUtil.checkNull(root, "The new added root could not be null.");
		PalusUtil.checkTrue(root.isRootNode(), "The added node is a not a root node.");
		if(!this.nodes.contains(root)) {
		  this.nodes.add(root);
		} else {
		  Log.log("Root: " + root + " already exists.");
		}
		this.root = root;
	}
	
	public ModelNode getRoot() {
		PalusUtil.checkNull(this.root, "The root node is null.");
		PalusUtil.checkTrue(this.root.isRootNode(), "The root node is not valid, it "
		    + "has " + this.root.getAllIncomingEdges().size() + " incoming edges.");
		return this.root;
	}
	
	public void addExit(ModelNode exit) {
	  PalusUtil.checkTrue(this.exit == null, "There has already an exit node existed, can not"
	      + " add another exit node.");
	  PalusUtil.checkNull(exit, "The exit node could not be null!");
	  PalusUtil.checkTrue(exit.isExitNode(), "The new added exit node is not valid.");
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
	private void resetExit(ModelNode newExit) {
	  PalusUtil.checkNull(this.exit, "The original exit node could not be null, when "
	      + "reseting the graph exit node.");
	  //XXX PalusUtil.checkTrue(!this.exit.isExitNode() ||  !this.nodes.contains(exit));
	  PalusUtil.checkNull(newExit, "The new exit node could not be null, when "
	      + "reseting the graph exit node.");
	  PalusUtil.checkTrue(newExit.isExitNode(), "The new exit node is not "
	      + "an exit node, its outgoing edge number: " + newExit.getAllOutgoingEdges().size());
	  if(!this.nodes.contains(newExit)) {
	    throw new RuntimeException("You could only reset an existing node.");
	  }
	  this.exit = newExit;
	}
	
	public ModelNode getExit() {
	  PalusUtil.checkNull(this.exit, "The exit node should not be null.");
	  PalusUtil.checkTrue(this.exit.isExitNode(), "The exit node is not valid.");
	  return this.exit;
	}
	
	public void addModelNode(ModelNode node) {
	    PalusUtil.checkNull(node, "The new adding node should not be null.");
	    PalusUtil.checkTrue(this.root != null, "The root node should not be null.");
	    
		if(!this.nodes.contains(node)) {
		    node.setClassModel(this);
			this.nodes.add(node);
		} else {
			Log.log("ModeNode: " + node.getNodeId()
					+ " has already existed!");
		}
	}
    
    public void addModelNodes(List<ModelNode> nodes) {
      PalusUtil.checkNull(nodes, "The node list for add should not be null.");
      for(ModelNode node : nodes) {
        this.addModelNode(node);
      }
    }
	
	/**
	 * When deleting a node, its neighbor edges will also be deleted.
	 * */
	public void deleteModelNode(ModelNode node) throws ModelNodeNotFoundException {
	  PalusUtil.checkNull(node, "The model node to delete could not be null.");
	  PalusUtil.checkNull(this.root, "The root node could not be null.");
	  //can not delete a root
	  PalusUtil.checkTrue(this.root != node, "You can not add the existing root node!");
	  
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
	  //update the trace transition repository
	  TraceTransitionManager.removeTransitions(outEdges);
	  TraceTransitionManager.removeTransitions(inEdges);
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
     * Returns how many decoration has been merged
     * */
    public int mergeEquivalentDecorations() {
      int total_num = 0;
      for(Transition transition : this.transitions) {
        total_num += transition.mergeEquivalentDecorations();
      }
      return total_num;
    }
    
    /**
     * Merges all redundant decorations for a set of class models
     * */
    public static int mergeEquivalentDecorations(Map<Class<?>, ClassModel> models) {
      PalusUtil.checkNull(models, "The class model map could not be null.");
      int total_num = 0;
      for(ClassModel model : models.values()) {
        total_num += model.mergeEquivalentDecorations();
      }
      return total_num;
    }

    /**
     * Gets the total number of decoration values
     * */
    public int getDecorationNum() {
      int total_num = 0;
      for(Transition transition : this.transitions) {
        total_num += transition.getDecorationNum();
      }
      return total_num;
    }
    
    /**
     * Gets the total number of decoration values for a set of class models
     * */
    public static int getDecorationNum(Map<Class<?>, ClassModel> models) {
      PalusUtil.checkNull(models, "The class model map could not be null.");
      int total_num = 0;
      for(ClassModel model : models.values()) {
        total_num += model.getDecorationNum();
      }
      return total_num;
    }
	
	/**
	 * Merge the model into the current one
	 * */
	public void mergeModel(ClassModel model) {
	    //System.out.println("start merging model: ");
		PalusUtil.checkNull(model, "The class model could not be null.");
		PalusUtil.checkNull(this.root, "The model root could not be null.");
		PalusUtil.checkNull(this.exit, "The model exit could not be null.");
		PalusUtil.checkNull(model.root, "The root of model to be merged could not be null");
		PalusUtil.checkNull(model.exit, "The exit of model to be merged could not be null");
		PalusUtil.checkTrue(model.getModelledClass() == this.getModelledClass(),
		    "The to be merged modelled class: " + model.getModelledClass()
		    + " should == the model class of this: " + this.getModelledClass());
		
		//The merge algorithm is a recursive one, which which the graph node
		//from root. And do that level by level following the outgoing edges.
		//XXX think about is there any information loss here??
	    try {
	        Log.log("------------ merging start ---------------");
	        //a set to keep track that no node pair will processed twice!
	        Set<Pair<Integer, Integer>> already_merged = new LinkedHashSet<Pair<Integer, Integer>>();
            mergeNode(this.root, model.root, already_merged);
            //System.out.println("finish merging");
            //do some post-processing about all merged nodes
            //remove dangling edges
            this.removeDanglingAndLoopEdges(); 
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
	  //first find all non-public transitions
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
        //remove the transition
	    this.transitions.remove(nonPublicTransition);
	  }
	  //update the trace transition repository
      TraceTransitionManager.removeTransitions(nonPublicTransitions);
	  
//	  Log.log("In class model: " + this.getModelledClass() + ", remove: "
//	      + nonPublicTransitions.size() + " transitions out of " + this.transitions.size());
//	  for(Transition nonPublic : nonPublicTransitions) {
//	    Log.log("    removed non public transition: " + nonPublic.getTransitionID());
//	  }
	  
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
	  PalusUtil.checkNull(this.root, "The root node could not be null");
      PalusUtil.checkTrue(this.root.isRootNode(), "The root node is not valid.");
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
      for(ModelNode dangling : danglingNodes) {
        Log.log("      removed dangling node id: " + dangling.getNodeId());
      }
	}

	
	/**
	 * Print a brielf summary for the model
	 * */
	public String getModelInfo() {
	  PalusUtil.checkNull(this.root, "The root node should not be null.");
	  PalusUtil.checkNull(this.exit, "The exit node should not be null.");
	  
	  StringBuilder sb = new StringBuilder();
	  sb.append("---------- model info start ----------" + Globals.lineSep);
	  sb.append("Class model: " + this.getModelledClass().getName() + Globals.lineSep);
	  sb.append("Number of nodes: " + this.nodes.size() + Globals.lineSep);
	  sb.append("Number of edges: " + this.transitions.size() + Globals.lineSep);
	  sb.append("Root node id: " + this.root.getNodeId() + Globals.lineSep);
	  sb.append("Exit root id: " + this.exit.getNodeId() + Globals.lineSep);
	  sb.append("All nodes: " + Globals.lineSep);
	  sb.append("   ");
	  for(ModelNode node : this.nodes) {
	    sb.append(node.getNodeInfo() + Globals.lineSep);
	  }
	  sb.append(Globals.lineSep);
	  sb.append("All transitions:" + Globals.lineSep);
	  for(Transition transition : this.transitions) {
	    sb.append("   " + transition.getSourceNode().getNodeId() + ":"
	        + transition.getDecorations().size() + "   ------" + transition.getTransitionID()
	        + ":" + transition.getClassName() + ":" +  transition.getMethodName()
	        + ":" + transition.getMethodDesc() +  "----->  "
	        + transition.getDestNode().getNodeId() + Globals.lineSep);
	    sb.append("           unique decoration position? " + transition.hasUniqueDecorationPosition() + Globals.lineSep);
	    if(transition.hasUniqueDecorationPosition() && transition.hasDecoration()) {
	        sb.append("             if so: " + transition.getUniqueDecorationPosition() + Globals.lineSep);
	    }
	    List<Decoration> decorations = transition.getDecorations();
	    for (Decoration decoration : decorations) {
	        sb.append("          " + decoration.toString() + Globals.lineSep);
	    }
	  }
	  sb.append(Globals.lineSep);
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
	    //System.out.println("inside check rep...");
	    PalusUtil.checkNull(this.root, "The root node could not be null!");
	    PalusUtil.checkNull(this.exit, "The exit node could not be null!");
	    PalusUtil.checkTrue(this.root.isRootNode(), "The root node is not valid.");
	    if(this.nodes.size() != 1) {
	      //XXX flaw
	        PalusUtil.checkTrue(this.exit.isExitNode(), "The exit node is not valid.");
	    }
	    //all nodes are reachable from root
	    //System.out.println("Before sub node number checking");
	    
	    Log.log("In check rep, sub node number after root: " + this.getAllSubNodes(this.root).size()
	        + ", all nodes: " + this.nodes.size());
	    
	    PalusUtil.checkTrue(this.getAllSubNodes(this.root).size() + 1 == this.nodes.size(),
	        "The size of subnodes of root + 1 != this.nodes.size().");
	    
	    //System.out.println("check rep pass sub node number consistence, node size: " + this.nodes.size());
	    
	    //only one root, one exit
	    for(ModelNode node : this.nodes) {
	      //at the beginning of this model, there is no transition.
	      //so in this sense, root, exit nodes are all isolated, thus
	      //root id could also be exit, and vice verse.
	      if(node.isExitNode() && node != root) {
	        PalusUtil.checkTrue(node == exit, "The node should == exit!");
	      }
	      if(node.isRootNode() && node != exit) {
	        PalusUtil.checkTrue(node == root, "The node should == root!");
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
	  
	  int count = 0;
	  int node_count = 0;
	  int tran_count = 0;
	  List<String> dependenceForDebugging = new LinkedList<String>();
	  
	  for(Entry<Pair<Transition, Position>, Pair<ModelNode, Position>> entry : dependences.entrySet()) {
	    Pair<Transition, Position> transitionAndPosition = entry.getKey();
	    Pair<ModelNode, Position> nodeAndPosition = entry.getValue();
	    //get the transition class
	    Class<?> modelledClassForTransition = transitionAndPosition.a.getModelledClass();
	    Class<?> modelledClassForModelNode = nodeAndPosition.a.getModelledClass();
	    //get the corresponding class model
	    ClassModel transitionModel = models.get(modelledClassForTransition);
	    ClassModel nodeModel = models.get(modelledClassForModelNode);
	    
	    //check the nullable
	    PalusUtil.checkNull(transitionModel, "The transition model could not be null.");
	    PalusUtil.checkNull(nodeModel, "The node model could not be null.");
	    
	    if(transitionModel.hasTransition(transitionAndPosition.a)) {
	      tran_count ++;
	    }
	    
	    if(nodeModel.hasNode(nodeAndPosition.a)) {
	      //System.out.println("   Has node");
	      node_count++;
	    }
	    
	    Transition transition = transitionAndPosition.a;
	    Position transitionPos = transitionAndPosition.b;
	    
	    ModelNode node = nodeAndPosition.a;
	    Position nodePos = nodeAndPosition.b;
	    //no decoration?
	    if(!transition.hasDecoration()) {
	      continue;
	    }
	    //has the same decoration
	    //XXX do not check the same decoration position here
//	    if(!(transition.getUniqueDecorationPosition() == transitionPos.toIntValue())) {
//	      continue;
//	    }
	    //add dependence edges to the decoration values
	    for(Decoration decoration : transition.getDecorations()) {
	      DecorationValue value = decoration.getDecorationByPosition(transitionPos);
	      if(value != null) {
	          //XXX could be double set here?
	          value.setDependenceEdge(new DependenceEdge(transition, node));
	          dependenceForDebugging.add(transition.getTransitionID() + ", " + transition.toSignature() + " * " + transitionPos + " *  " + "    depends on    " + node.getNodeId()
	               + "   num of decorations: " + transition.getDecorationNum() + ", modelling class: " + modelledClassForTransition);
	          count ++;
	      } else {
	        throw new BugInPalusException("The decoration value should not be null, for transition: "
	            + transition.toSignature() + ", on position: " + transitionPos);
	      }
	    }
	  }
	  System.out.println("There are: " + node_count + " nodes.");
	  System.out.println("There are: " + tran_count + " transitions. ");
	  System.out.println("Enhance the model with: " + count + " dependence transitions.");
	  Log.log("Enhancing models with dependence information.");
	  for(String dependence : dependenceForDebugging) {
	    Log.log("    " + dependence);
	  }
	  //reclaim memory
	  dependenceForDebugging.clear();
	}
	
	/**
	 * Check whether all transitions are public
	 * */
	private void checkPublicTransitions() {
	  for(Transition transition : this.transitions) {
	    PalusUtil.checkTrue(transition.isPublicTransition(), "Transition: " + transition
	        + " is not a public transition (including public method).");
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
	
//	private Transition getTransitionBySignature(Transition transition) {
//	  for(Transition t : this.transitions) {
//	    if(t.toString().equals(transition.toString())) {
//	      return t;
//	    }
//	  }
//	  return null;
//	}
	
	private void checkExistence(ModelNode nodeToCheck) throws ModelNodeNotFoundException {
		PalusUtil.checkNull(nodeToCheck, "The nodeToCheck should not be null!");
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
	private void mergeNode(ModelNode destNode,  ModelNode tobeMerged, Set<Pair<Integer, Integer>> mergedPairs)
	    throws ModelNodeNotFoundException {
	    //no need to merge
	    if(destNode == tobeMerged) {
	      Log.log("Two nodes are identical, we return! dest node: " + destNode.getNodeId()
	          +", tobeMerged node: " + tobeMerged.getNodeId());
	      return;
	    }
	    
	    //then we check whether these two nodes have been merged before, if so,
	    //we just return.
	    Integer destNodeId = destNode.getNodeId();
	    Integer tobeMergedId = tobeMerged.getNodeId();
	    Pair<Integer, Integer> mergingPair = new Pair<Integer, Integer>(destNodeId, tobeMergedId);
	    if(mergedPairs.contains(mergingPair)) {
	      Log.log("The pair: " + destNodeId + ", " + tobeMergedId + " has already been processed.");
	      return;
	    } else {
	      //add to the set
	      mergedPairs.add(mergingPair);
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
          
          PalusUtil.checkTrue(destNode.getClassModel() == this, "The class model of dest node should == this!");
          Log.log("Finish merging, dest node is exit, to be merged is not: ");
          //Log.log(destNode.getClassModel().getModelInfo());
	    }	    
	    else {
	      Log.log(" Both dest node: " + destNode.getNodeId() + " and tobeMerged node: "
	          + tobeMerged.getNodeId() +  " are not exit nodes.");
	      //do the recursion here, neither node is exit node, so we need to walk down one level
	      List<Transition> transitions = tobeMerged.getAllOutgoingEdges();
	      Log.log("number of outgoing transition of dest node: " + destNode.getNodeId() + ": " + destNode.getAllOutgoingEdges().size());
	      for(Transition temp : destNode.getAllOutgoingEdges()) {
	        Log.log("   node id: " + temp.getDestNode().getNodeId() + ", tmp hashcode: " + temp.hashCode() + ",  " + temp.toSignature());
	      }
	      Log.log("number of outgoing transitions of tobeMerged " + tobeMerged.getNodeId() + "  node: " + transitions.size());
	      for(Transition temp : transitions) {
	        Log.log("   node id: " + temp.getDestNode().getNodeId() + ", tmp hashcode: " + temp.hashCode() + ",  " + temp.toSignature());
	      }
	      //XXX it could be ConcurrentModificationException here
	      for(Transition transition : transitions) {
	        //we use the signature for comparison, only concern on the method name, desc, owner class
	        Transition destT = //destNode.getOutgoingTranisitionBySignature(transition); //XXX
	            destNode.getOutgoingTransitionBySignatureAndPosition(transition);
	        if(destT != null) {
	          //we go down one level to continue merging
	          PalusUtil.checkTrue(destT.getSourceNode() == destNode && transition.getSourceNode() == tobeMerged,
	              "The source node of destT should == destNode, and source node of transition should == tobeMerged.");
	          //XXX do the merge here, will cause error
	          TraceTransitionManager.mergeTransitions(destT, transition);
	          //merge the decoration
	          for(Decoration d : transition.getDecorations()) {
	            if(!destT.hasDecorationValues(d)) {
	               destT.addDecoration(d.makeClone(destT));
	            }
	          }
	          /** merge recursively */
	          Log.log(" Find the same transition, so recusrively proceed, dest node/to be merged nodes:  "
	              + destT.getDestNode().getNodeId() + " " + transition.getDestNode().getNodeId());
	          this.mergeNode(destT.getDestNode(), transition.getDestNode(), mergedPairs);
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
	  PalusUtil.checkNull(node, "The node for query all sub nodes could not be null.");
	  Set<ModelNode> subNodes = new HashSet<ModelNode>();	  
	  //do a breadth-first traverse
	  List<ModelNode> tmp = new LinkedList<ModelNode>();
	  tmp.addAll(node.getAllOutgoingNodes());
	  
	   //keep track of all visited nodes
      Set<ModelNode> visited = new HashSet<ModelNode>();
	  visited.addAll(node.getAllOutgoingNodes());
	  
	  while(!tmp.isEmpty()) {
	    //System.out.println("size of tmp: " + tmp.size() + ", size of subnodess: " + subNodes.size());
	    ModelNode n = tmp.remove(0);
	    subNodes.add(n);
	    for(ModelNode mn : n.getAllOutgoingNodes()) {
	      //avoid duplication, check first
	      if(!visited.contains(mn)) {
	         tmp.add(mn);
	         visited.add(mn);
	      }
	    }
	  }	  
	  tmp.clear();
	  return new LinkedList<ModelNode>(subNodes);
	}
	
	/**
	 * Get all sub transitions from a given node (including the outgoing
	 * transitions from the given node)
	 * */
	private List<Transition> getAllSubTransitions(ModelNode node) {
	  PalusUtil.checkNull(node, "The node for querying sub transitions could not be null.");	  
	  //add all connecting edges
	  Set<Transition> transitions = new HashSet<Transition>();
	  transitions.addAll(node.getAllOutgoingEdges());	  
	  //do a breadth-first traverse
	  List<ModelNode> tmp = new LinkedList<ModelNode>();
	  tmp.addAll(node.getAllOutgoingNodes());
	  
	  //keep track of all visited node
	  Set<ModelNode> visited = new HashSet<ModelNode>();
	  visited.addAll(node.getAllOutgoingNodes());
	  
	  while(!tmp.isEmpty()) {
	    ModelNode n = tmp.remove(0);
	    transitions.addAll(n.getAllOutgoingEdges());
	    //avoid duplicate, ugly code here
	    for(ModelNode mn : n.getAllOutgoingNodes()) {
	      if(!visited.contains(mn)) {
	        tmp.add(mn);
	        visited.add(mn);
	      }
	    }
	  }	  
	  return new LinkedList<Transition>(transitions);
	}
	
	
	/**
	 * Removes dangling edges (edges connected to some of the nodes, but do not
	 * belong to the edge set) after merging models
	 * */
	private void removeDanglingAndLoopEdges() {
	  //for each model node which is "fetched" from other class model during merge,
	  //we set its class model be this. Then, for each node, we remove its connecting
	  //edges (including outgoing and incoming), which do not belong to the edge
	  //set of this class model
	  Set<Transition> loop = new LinkedHashSet<Transition>();
	  for(ModelNode node : this.nodes) {
	    node.setClassModel(this);
	    //to be removed outgoing edges
	    List<Transition> outToBeRemoved = new LinkedList<Transition>();
	    for(Transition t : node.getAllOutgoingEdges()) {
	      if(!this.transitions.contains(t)) {
	        outToBeRemoved.add(t);
	      }
	    //remove the loop transition XXX
          else if(t.getSourceNode() == t.getDestNode()) {
            loop.add(t);
            outToBeRemoved.add(t);
          }
	    }
	    //to be removed incoming edges
	    List<Transition> inToBeRemoved = new LinkedList<Transition>();
	    for(Transition t : node.getAllIncomingEdges()) {
	      if(!this.transitions.contains(t)) {
	        inToBeRemoved.add(t);
	      }
	      //remove the loop transition XXX
	      else if(t.getSourceNode() == t.getDestNode()) {
	        loop.add(t);
	        inToBeRemoved.add(t);
	      }
	    }
	    //remove them from outgoing/incoming edges
	    node.getAllOutgoingEdges().removeAll(outToBeRemoved);
	    node.getAllIncomingEdges().removeAll(inToBeRemoved);
	  }
	  this.transitions.removeAll(loop);
	  //XXX design flaws, for the exit and root node
	  TraceTransitionManager.removeTransitions(loop);	  
	}
	
	/** To ease the merging process, we tolerance the existence of multiple
     * exit nodes,, which violates the invariants defined in this class.
     * We will unify all these exit nodes */
	private void unifyAllExitNodes() throws ModelNodeNotFoundException {
	  //#XXX be careful, the model could be empty then
	  //check the root invariant does not violate
	  PalusUtil.checkNull(this.root, "The root node could not be null.");
	  PalusUtil.checkTrue(this.root.isRootNode(), "The root node is not valid.");
	  
	  //check that the Class Model could be only one node remaining
	  if(this.nodes.size() == 1) {
	    Log.log("There is only the root node exists. (all other nodes has been removed)");
	    return;
	  }
	  
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
	  
	  if(exitNodes.size() == 0) {
	    System.out.println("exit: " + this.exit.getNodeId() + "");
	    System.out.println("------------------");
	    System.out.println(this.getModelInfo());
	  }
	  
	  PalusUtil.checkTrue(exitNodes.size() > 0, "The existNodes's size: " + exitNodes.size()
	      + " should > 0.");
	  for(ModelNode exitNode : exitNodes) {
	    PalusUtil.checkTrue(exitNode.numOfInEdges() > 0, "The num of incoming edges of exitNode: "
	        + exitNode.numOfInEdges() + " should > 0.");
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
	  
	  PalusUtil.checkTrue(unifiedExit.isExitNode(), "The unified exit node is not valid.");
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
	  PalusUtil.checkTrue(unifiedExit.isExitNode(), "The unified exit node after reset is not valid.");
	  this.resetExit(unifiedExit);
	}
	
	/**TODO add some model utility methods here for faciliting
	 * manipulate the model */
}