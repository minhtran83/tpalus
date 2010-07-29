// Copyright 2010 Google Inc. All Rights Reserved.

package palus.model.serialize;

import palus.model.ClassModel;
import palus.model.ModelNode;
import palus.model.TraceAnalyzer;
import palus.model.Transition;
import palus.model.Transition.Decoration;
import palus.trace.TraceEvent;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author saizhang@google.com (Your Name Here)
 *
 */
public class ModelSerializer {
  private final Map<Class<?>, ClassModel> models;
  
  private final File file;
  
  public ModelSerializer(Map<Class<?>, ClassModel> models, File file) {
    this.models = models;
    this.file = file;
  }
  
  /**
   * For human inspection. Check whether the model after deserialization is the
   * same as which before serialization
   * */
  public void serializeModelsAsText() throws IOException {
    BufferedWriter bw = new BufferedWriter(new FileWriter(file));
    for(Entry<Class<?>, ClassModel> entry : models.entrySet()) {
      bw.write("Model for class: " + entry.getKey().getName() + "\n");
      bw.write(entry.getValue().getModelInfo() + "\n");
      //output the information of the model node
      for(ModelNode node : entry.getValue().getAllNodes()) {
        bw.write("Node id: " + node.getNodeId());
        bw.write("Class model for node: " + node.getClassModel().getClassModelID() + "\n");
        bw.write("Modelled class for node: " + node.getModelledClass() + "\n");
        for(Transition inT : node.getAllIncomingEdges()) {
          bw.write("incoming transition: " + inT.toString() + "\n");
        }
        for(Transition outT : node.getAllOutgoingEdges()) {
          bw.write("outgoing transition: " + outT.toString() + "\n");
        }
      }
      for(Transition transition : entry.getValue().getAllTransitions()) {
        bw.write("Transition ID: " + transition.getTransitionID());
        bw.write(" method or constructor? " + transition.isConstructor()
            + "  " + transition.isMethod() + "\n");
        bw.write("Source node: " + transition.getSourceNode().getNodeInfo() + "\n");
        bw.write("Source node: " + transition.getDestNode().getNodeInfo() + "\n");
        for(Decoration decoration : transition.getDecorations()) {
          bw.write("   decoration: " + decoration.toString());
        }
      }
      bw.write("\n\n\n");
    }
    bw.flush();
    bw.close();
  }
  
  public void serializeModelAsObject() throws IOException {
    FileOutputStream out = new FileOutputStream(file);
    ObjectOutputStream oos = new ObjectOutputStream(out);
    
    int size = this.models.size();
    //write the size first
    oos.writeInt(size);
    for(Entry<Class<?>, ClassModel> entry : models.entrySet()) {
      ClassModel model = entry.getValue();
      model.saveForSerialization();
      //do serialization, write the class then the model
      oos.writeObject(entry.getKey());
      oos.writeObject(model);
    }
    oos.flush();
    out.flush();
    oos.close();
    out.close();
  }
  
  public static Map<Class<?>, ClassModel> deserializeObjectsFromFile(File file) throws IOException, ClassNotFoundException {
    Map<Class<?>, ClassModel> retMap = new LinkedHashMap<Class<?>, ClassModel>();
    FileInputStream fin = new FileInputStream(file);
    ObjectInputStream ois = new ObjectInputStream(fin);
    
    Object obj = null;
    int size = ois.readInt();
    //System.out.println("size: " + size);
    for(int i = 0; i < size; i++) {
      Object clazz = ois.readObject();
      if(!(clazz instanceof Class<?>)) {
        throw new IOException("The file: " + file.getAbsolutePath()
            + " is corrupted. Contain object other than Class<?>! It is: " + clazz.getClass());
      }
      Object model = ois.readObject();
      if(!(model instanceof ClassModel)) {
        throw new IOException("The file: " + file.getAbsolutePath()
            + " is corrupted. Contain object other than ClassModel! It is: " + model.getClass());
      }
      Class<?> key = (Class<?>)clazz;
      ClassModel value = (ClassModel)model;
      //call the recover method
      value.recoverFromDeserialization();
      //make sure it is a valid one
      value.checkRep();
      //put to the map
      retMap.put(key, value);
    }
    
    return retMap;
  }
  
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    List<TraceEvent> events = TraceSerializer.deserializeObjectsFromTrace(new File(TraceAnalyzer.TRACE_OBJECT_FILE));
    TraceAnalyzer analyzer = new TraceAnalyzer(events);
    Map<Class<?>, ClassModel> models = analyzer.createModels();
    
    String fileName_bin = "./model_serialize_bin.model";
    String fileName_txt = "./model_serialize_text.text";
    String fileName_de_txt = "./model_serialize_text_de.text";
    
    System.out.println("Serializing model as object ...");
    ModelSerializer serializer = new ModelSerializer(models, new File(fileName_bin));
    serializer.serializeModelAsObject();
    System.out.println("Serialization as object finishes!\n\n");
    
    System.out.println("Serializing model as text ...");
    serializer = new ModelSerializer(models, new File(fileName_txt));
    serializer.serializeModelsAsText();
    System.out.println("Serialization as text finishes!\n\n");
    
    System.out.println("Deserialze from file: " + fileName_bin + "...");
    models = ModelSerializer.deserializeObjectsFromFile(new File(fileName_bin));
    System.out.println("Deserialze finishes!\n\n");
    
    System.out.println("Serializing model as text ...");
    serializer = new ModelSerializer(models, new File(fileName_de_txt));
    serializer.serializeModelsAsText();
    System.out.println("Serialization as text finishes!\n\n");
    
    //so the dumpd text of the model should be the same as the model after deserialization
  }
  
}