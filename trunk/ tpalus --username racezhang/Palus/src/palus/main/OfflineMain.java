// Copyright 2010 Google Inc. All Rights Reserved.

package palus.main;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import palus.model.ClassModel;
import palus.model.TraceAnalyzer;
import palus.model.serialize.TraceSerializer;
import palus.trace.TraceEvent;

/**
 * @author saizhang@google.com (Your Name Here)
 *
 */
public class OfflineMain {

  //the file
  private static final String TRACE_FILE = TraceAnalyzer.TRACE_OBJECT_FILE;
  
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    OfflineMain main = new OfflineMain();
    main.nonStaticMain(args);
  }
  
  public void nonStaticMain(String[] args) throws IOException, ClassNotFoundException {
    List<TraceEvent> events = TraceSerializer.deserializeObjectsFromTrace(new File(TRACE_FILE));
    TraceAnalyzer analyzer = new TraceAnalyzer(events);
    Map<Class<?>, ClassModel> models = analyzer.createModels();
  }
}