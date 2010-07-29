// Copyright 2010 Google Inc. All Rights Reserved.

package palus.main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import palus.model.ClassModel;
import palus.model.TraceAnalyzer;
import palus.model.serialize.ModelSerializer;
import palus.model.serialize.TraceSerializer;
import palus.testgen.TestGenMain;
import palus.trace.TraceEvent;

/**
 * @author saizhang@google.com (Your Name Here)
 *
 */
public class OfflineMain {

  //the file
  private static final String TRACE_FILE = TraceAnalyzer.TRACE_OBJECT_FILE;
  
  private static final String MODEL_FILE = "./model_serialize_bin.model";
  
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    OfflineMain main = new OfflineMain();
    main.nonStaticMain(args);
  }
  
  public void nonStaticMain(String[] args) throws IOException, ClassNotFoundException {
//    List<TraceEvent> events = TraceSerializer.deserializeObjectsFromTrace(new File(TRACE_FILE));
//    TraceAnalyzer analyzer = new TraceAnalyzer(events);
//    Map<Class<?>, ClassModel> models = analyzer.createModels();
//    //for testing purpose
//    dumpModels(models, "./models.txt");
    
    Map<Class<?>, ClassModel> models = ModelSerializer.deserializeObjectsFromFile(new File(MODEL_FILE));
    
    //start to generate tests
    TestGenMain main = new TestGenMain();
    main.generateTests(new String[]{}, models);
  }
  
  private static void dumpModels(Map<Class<?>, ClassModel> models, String fileName) throws IOException {
    BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
    for(Entry<Class<?>, ClassModel> entry : models.entrySet()) {
      bw.write("Model for class: " + entry.getKey().toString() + "\n");
      bw.write(entry.getValue().getModelInfo() + "\n");
      bw.write("\n\n\n");
    }
  }
}