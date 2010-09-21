// Copyright 2010 Google Inc. All Rights Reserved.

package palus.visualization;

import com.mxgraph.layout.hierarchical.mxHierarchicalLayout;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.JFrame;

import palus.PalusUtil;
import palus.model.ClassModel;
import palus.model.ModelNode;
import palus.model.Transition;

/**
 * This class provides a simple graphical viewer to view the shape of the
 * created class model
 * 
 * <em>Note:</em> this class is poorly implemented, only for experimental purpose. 
 * 
 * @author saizhang@google.com (Sai Zhang)
 *
 */
public class ClassModelViewer {
  /**
   * The class model to view
   * */
  private final ClassModel model;
  
  /**
   * Default constructor
   * */
  public ClassModelViewer(ClassModel model) {
    PalusUtil.checkNull(model, "The class model to view could not be null!");
    this.model = model;
  }
  
  /**
   * Pops up the Window
   * */
  public void viewModel() {
    ModelViewer viewer = new ModelViewer("Model created for class: " + this.model.getModelledClass()
        , model);
    viewer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    viewer.setSize(1400, 800);
    viewer.setVisible(true);
    
    final Dialog d = new Dialog(viewer, "Note", true);
    d.setLayout(new FlowLayout());
    // Create an OK button
    Button ok = new Button ("OK");
    ok.addActionListener ( new ActionListener()
    {
        public void actionPerformed( ActionEvent e )
        {
            // Hide dialog
            d.setVisible(false);
        }
    });

    d.add(viewer);
    d.add( new Label ("Click OK to continue"));
    d.add( ok );

    // Show dialog
    d.pack();
    d.setVisible(true);
  }
  
  /**
   * An inner class for visualize the built class model
   * */
  static class ModelViewer extends JFrame {
    public ModelViewer(String title, ClassModel model) {
      super(title);
      mxGraph graph = new mxGraph();
      Object parent = graph.getDefaultParent();
      mxHierarchicalLayout layout = new mxHierarchicalLayout(graph);
      
      //add nodes and edges
      graph.getModel().beginUpdate();
      try {
        int xPos = 0, yPos = 0, xWidth = 40, yHeight = 30;
        //get all nodes
        Set<ModelNode> nodes = model.getAllNodes();
        //set up a map between model node and graph node
        Map<ModelNode, Object> nodeMap = new HashMap<ModelNode, Object>();
        for(ModelNode modelNode : nodes) {
          Object graphNode = graph.insertVertex(parent, null, modelNode.getNodeId(),
              xPos, yPos, xWidth, yHeight);
          nodeMap.put(modelNode, graphNode);
        }
        
        //now add all transition
        Set<Transition> transitions = model.getAllTransitions();
        for(Transition transition : transitions) {
          Object graphSourceNode = nodeMap.get(transition.getSourceNode());
          Object graphDestNode = nodeMap.get(transition.getDestNode());
          PalusUtil.checkNull(graphSourceNode, "The source node could not be null.");
          PalusUtil.checkNull(graphDestNode, "The dest node could not be null.");
          Object edge = graph.insertEdge(parent, null, transition.toSignature(), graphSourceNode, graphDestNode);
        }
        
      }
      finally {
        layout.execute(parent);
        graph.getModel().endUpdate();
      }
      //add the graph to jframe
      mxGraphComponent graphComponent = new mxGraphComponent(graph);
      this.getContentPane().add(graphComponent);
    }
  }
  
  /**
   * A small testing driver
   * */
  public static void main(String[] args) {
//    ClassModelViewer viewer = new ClassModelViewer(new ClassModel(japa.parser.ASTHelper.class));
//    viewer.viewModel();
  }
  
}