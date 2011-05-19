package palus.model.ktail;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import palus.PalusUtil;
import palus.model.ClassModel;
import palus.model.ModelNode;
import palus.model.Transition;
import plume.Pair;

/**
 * Implements the K-Tail algorithm to refine Palus' model
 * 
 * @author szhang@cs.washington.edu (Sai Zhang)
 */
public class KTailMerger {
	/** The class model to process */
	public final ClassModel model;
	/** How many steps to look ahead */
	public final int k ;
	
	/** Number of merged nodes for statistical number */
	private int mergedNodeNum = 0;
	
	public KTailMerger(ClassModel model, int k) {
		PalusUtil.checkNull(model, "The class model can not be null.");
		PalusUtil.checkTrue(k > 0, "The k should be > 0");
		this.model = model;
		this.k = k;
	}
	
	/**
	 * Merge two children methods by looking ahead k steps.
	 * If all k steps all the same, merge them. 
	 * */
	public ClassModel mergeNodesByKTail() {
		ModelNode root = this.model.getRoot();
		//keep a set of nodes to process in the next round, and add the root first
		Set<ModelNode> nodesToProcess = new LinkedHashSet<ModelNode>();
		nodesToProcess.add(root);
		//the already visited node set
		Set<ModelNode> visited = new LinkedHashSet<ModelNode>();
		//iterate until the node set is empty
		while(!nodesToProcess.isEmpty()) {
			//System.out.println("in process... " + System.currentTimeMillis());
			Set<ModelNode> nextlevel = new LinkedHashSet<ModelNode>();
			for(ModelNode nodeToProcess : nodesToProcess) {
				if(visited.contains(nodesToProcess)) {
					continue;
				}
				visited.add(nodeToProcess);
				/**Start to merge the children nodes*/
				this.processNode(nodeToProcess);
				nextlevel.addAll(nodeToProcess.getAllOutgoingNodes());
			}
			//go to the next level
			nodesToProcess.clear();
			nodesToProcess.addAll(nextlevel);
		}
		return this.model;
	}
	
	/**
	 * Returns how many nodes are merged
	 * */
	public int getMergedNum() {
		return this.mergedNodeNum;
	}
	
	/**
	 * Processes each children nodes of <code>node</code>. If two nodes are mergeable, then
	 * merge them.
	 * */
	private void processNode(ModelNode node) {
		List<Transition> tranList = node.getAllOutgoingEdges();
		int length = tranList.size();
		
		if(!tranList.isEmpty()) {
			//to avoid concurrentmodificationerror, we keep a list of mergeable nodes
			List<Pair<Transition, Transition>> mergedList = new LinkedList<Pair<Transition, Transition>>();
			for (int i = 0; i < length; i++) {
				for (int j = i + 1; j < length; j++) {
					Transition transition1 = tranList.get(i);
					Transition transition2 = tranList.get(j);
					ModelNode n1 = transition1.getDestNode();
					ModelNode n2 = transition2.getDestNode();
					if (n1 != n2 && this.mergeable(n1, n2)) {
						// merge it
						Pair<Transition, Transition> pair = new Pair<Transition, Transition>(
								transition1, transition1);
						mergedList.add(pair);
					}
				}
			}
			//start to merge two nodes in the mergeable node list
			for(Pair<Transition, Transition> pair : mergedList) {
				//System.out.println( "    -  merged list " + System.currentTimeMillis());
				Transition transition1 = pair.a;
				Transition transition2 = pair.b;
				if(tranList.contains(transition1) && tranList.contains(transition2)) {
					//two nodes are merged, increase the statistic number
					this.mergedNodeNum++;
					//start merging, first remove the old connection, and create a new one
					Transition newTransition = new Transition(node, transition2.getDestNode(), transition2.getClassName(),
							transition2.getMethodName(), transition2.getMethodDesc()); 
					int index = tranList.indexOf(transition2);
					tranList.remove(transition2);
					newTransition.addDecorations(transition2.makeClones(newTransition));
					tranList.add(index, newTransition);
					//re-connect each outgoing edge
					List<Transition> transitionsOfNode2 = transition2.getDestNode().getAllOutgoingEdges();
					for(Transition tranOfNode2 : transitionsOfNode2) {
						Transition newT = new Transition(transition1.getDestNode(), tranOfNode2.getDestNode(),
								tranOfNode2.getClassName(), tranOfNode2.getMethodName(), tranOfNode2.getMethodDesc());
						newT.addDecorations(tranOfNode2.makeClones(newT));
						transition1.getDestNode().addOutgoingEdge(newT);
					}
				}
			}
		}
	}
	
	/**
	 * Checks if two nodes are mergeable or not
	 * */
	private boolean mergeable(ModelNode node1, ModelNode node2) {
		//the next foreseeable k steps are the same
		Set<TransitionList> allTransitionSet1
		    = new HashSet<TransitionList>(this.getAllTransitionListInKSteps(node1));
		Set<TransitionList> allTransitionSet2
		    = new HashSet<TransitionList>(this.getAllTransitionListInKSteps(node2));
		
		return allTransitionSet1.equals(allTransitionSet2);
	}
	
	/**
	 * Gets all transition list within k steps
	 * */
	private List<TransitionList> getAllTransitionListInKSteps(ModelNode node) {
		List<TransitionList> transList = new LinkedList<TransitionList>();
		
		List<ModelNode> fringe = new LinkedList<ModelNode>();
		fringe.add(node);
		int step = this.k;
		
		while(step -- > 0) {
			List<ModelNode> newFringe = new LinkedList<ModelNode>();
			for(ModelNode n : fringe) {
				List<Transition> trans = n.getAllOutgoingEdges();
				if(trans.isEmpty()) {
					continue;
				}
				//update each transList
				if(transList.isEmpty()) {
					//the first node
					for(Transition tran : trans) {
						TransitionList tList = new TransitionList();
						tList.addNewTransition(tran.getModelledClass(), tran.getMethodDesc());
					}
				} else {
					List<TransitionList> newTrans = new LinkedList<TransitionList>();
					for(TransitionList oldTran : transList) {
						for(Transition tran : trans) {
							TransitionList newTranList = oldTran.makeClone();
							newTranList.addNewTransition(tran.getModelledClass(), tran.getMethodDesc());
							newTrans.add(newTranList);
						}
					}
					//update the translist
					transList.clear();
					transList.addAll(newTrans);
					//add to the new fringe
					for(Transition tran : trans) {
						newFringe.add(tran.getDestNode());
					}
				}
			}
			//clear the fringe
			fringe.clear();
			fringe.addAll(newFringe);
			newFringe.clear();
		}
		
		return transList;
	}
	
	/**A class encapsulating a list transitions */
	class TransitionList {
		List<Class<?>> classes = new LinkedList<Class<?>>();
		List<String> methodSignature = new LinkedList<String>();
		
		public void addNewTransition(Class<?> clazz, String methodSignature) {
			PalusUtil.checkNull(clazz, "The given class name can not be null.");
			PalusUtil.checkNull(methodSignature, "The given method signature can not be null.");
			this.classes.add(clazz);
			this.methodSignature.add(methodSignature);
		}
		
		public int size() {
			PalusUtil.checkTrue(classes.size() == methodSignature.size(), "Sizes are different, the class list size: "
					+ classes.size() + ",  the method signature size: " + methodSignature.size());
			return this.classes.size();
		}
		
		@Override
		public boolean equals(Object obj) {
			if(!(obj instanceof TransitionList)) {
				return false;
			}
			TransitionList tranList = (TransitionList)obj;
			return this.classes.equals(tranList.classes) && this.methodSignature.equals(tranList.methodSignature);
		}
		
		public TransitionList makeClone() {
			PalusUtil.checkTrue(classes.size() == methodSignature.size(), "Sizes are different, the class list size: "
					+ classes.size() + ",  the method signature size: " + methodSignature.size());
			TransitionList l = new TransitionList();
			l.classes.addAll(this.classes);
			l.methodSignature.addAll(this.methodSignature);
			return l;
		}
	}
}