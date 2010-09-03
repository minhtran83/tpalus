// Copyright 2010 Google Inc. All Rights Reserved.

package palus.model.serialize;

import palus.model.Instance;
import palus.model.TraceEventAndPosition;
import randoop.Globals;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Provides simple utility method for dumping traces to be human-readable
 * text.
 * 
 * @author saizhang@google.com (Sai Zhang)
 *
 */
public class TraceDumper {
  
  /**
   * The suffix of a trace dumping file.
   * */
  private static final String SUFFIX = "_trace.txt";
  
  /**
   * Dump traces of each class in a given {@code traceMap} to an individual file.
   * */
  public static void dumpTraceEventsByClass(String fileName,
      Map<Class<?>, Map<Instance, List<TraceEventAndPosition>>> traceMap) throws IOException {
    //for each class we traverse it
    for(Entry<Class<?>, Map<Instance, List<TraceEventAndPosition>>> entry : traceMap.entrySet()) {
      //creates a file for each entry
      File file = new File(entry.getKey().getName() + SUFFIX);
      BufferedWriter bw = new BufferedWriter(new FileWriter(file));
      //dump traces to the file
      Map<Instance, List<TraceEventAndPosition>> map = entry.getValue();
      bw.write("Instance num: " + map.size() + Globals.lineSep + Globals.lineSep);
      for(Entry<Instance, List<TraceEventAndPosition>> instanceEntry : map.entrySet()) {
        bw.write("For instance:" + instanceEntry.getKey().toString() + Globals.lineSep);
        List<TraceEventAndPosition> traceList = instanceEntry.getValue();
        for(TraceEventAndPosition tap : traceList) {
          for(int i = 0; i < tap.event.getStackDepth(); i++) {
            bw.write("  ");
          }
          bw.write(tap.event.toParsableString());
          bw.write(Globals.lineSep);
        }
      }
      bw.write(Globals.lineSep + Globals.lineSep + Globals.lineSep);
      
      bw.flush();
      bw.close();
    }
  }
}
