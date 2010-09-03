// Copyright 2010 Google Inc. All Rights Reserved.

package palus.model.serialize;

import palus.PalusUtil;
import palus.model.ClassModel;
import palus.model.ModelNode;
import palus.model.TraceAnalyzer;
import palus.model.Transition;
import palus.model.Transition.Decoration;
import palus.trace.TraceEvent;
import randoop.Globals;

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
 * Provides serialization support for the built {@link ClassModel} object.
 * 
 * @author saizhang@google.com (Sai Zhang)
 *
 */
public class ModelSerializer {
  /**
   * The model to be serialized.
   * */
  private final Map<Class<?>, ClassModel> models;
  
  /**
   * The file where the models to serialize
   * */
  private final File file;
  
  /**
   * Constructor. Initializes the models to be serialized, and its destination
   * file.
   * */
  public ModelSerializer(Map<Class<?>, ClassModel> models, File file) {
    PalusUtil.checkNull(models);
    PalusUtil.checkNull(file);
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
      bw.write("Model for class: " + entry.getKey().getName() + Globals.lineSep);
      bw.write(entry.getValue().getModelInfo() + Globals.lineSep);
      //output the information of the model node
      for(ModelNode node : entry.getValue().getAllNodes()) {
        bw.write("Node id: " + node.getNodeId());
        bw.write("Class model for node: " + node.getClassModel().getClassModelID() + Globals.lineSep);
        bw.write("Modelled class for node: " + node.getModelledClass() + Globals.lineSep);
        for(Transition inT : node.getAllIncomingEdges()) {
          bw.write("incoming transition: " + inT.toString() + Globals.lineSep);
        }
        for(Transition outT : node.getAllOutgoingEdges()) {
          bw.write("outgoing transition: " + outT.toString() + Globals.lineSep);
        }
      }
      for(Transition transition : entry.getValue().getAllTransitions()) {
        bw.write("Transition ID: " + transition.getTransitionID());
        bw.write(" method or constructor? " + transition.isConstructor()
            + "  " + transition.isMethod() + Globals.lineSep);
        bw.write("Source node: " + transition.getSourceNode().getNodeInfo() + Globals.lineSep);
        bw.write("Source node: " + transition.getDestNode().getNodeInfo() + Globals.lineSep);
        for(Decoration decoration : transition.getDecorations()) {
          bw.write("   decoration: " + decoration.toString());
        }
      }
      bw.write(Globals.lineSep + Globals.lineSep + Globals.lineSep);
    }
    bw.flush();
    bw.close();
  }
  
  /**
   * Serializes the model in binary form on the disk. 
   * */
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
  
  /**
   * De-serializes the models from a give file.
   * */
  public static Map<Class<?>, ClassModel> deserializeObjectsFromFile(File file)
    throws IOException, ClassNotFoundException {
    //the models to return.
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
  
  /**
   * A simple driver, containing some sample usage.
   * */
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
    System.out.println("Serialization as object finishes!" + Globals.lineSep + Globals.lineSep);
    
    System.out.println("Serializing model as text ...");
    serializer = new ModelSerializer(models, new File(fileName_txt));
    serializer.serializeModelsAsText();
    System.out.println("Serialization as text finishes!" + Globals.lineSep + Globals.lineSep);
    
    System.out.println("Deserialze from file: " + fileName_bin + "...");
    models = ModelSerializer.deserializeObjectsFromFile(new File(fileName_bin));
    System.out.println("Deserialze finishes!" + Globals.lineSep + Globals.lineSep);
    
    System.out.println("Serializing model as text ...");
    serializer = new ModelSerializer(models, new File(fileName_de_txt));
    serializer.serializeModelsAsText();
    System.out.println("Serialization as text finishes!" + Globals.lineSep + Globals.lineSep);
    
    //so the dumpd text of the model should be the same as the model after deserialization
  }
  
}