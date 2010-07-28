// Copyright 2010 Google Inc. All Rights Reserved.

package palus.model.serialize;

import palus.model.Instance;
import palus.model.TraceEventAndPosition;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author saizhang@google.com (Your Name Here)
 *
 */
public class TraceDumper {
  
  public static void dumpTraceEventsByClass(String fileName,
      Map<Class<?>, Map<Instance, List<TraceEventAndPosition>>> traceMap) throws IOException {
    //for each class we traverse it
    for(Entry<Class<?>, Map<Instance, List<TraceEventAndPosition>>> entry : traceMap.entrySet()) {
      File file = new File(entry.getKey().getName() + "_trace.txt");
      BufferedWriter bw = new BufferedWriter(new FileWriter(file));
      
      Map<Instance, List<TraceEventAndPosition>> map = entry.getValue();
      bw.write("Instance num: " + map.size() + "\n\n");
      for(Entry<Instance, List<TraceEventAndPosition>> instanceEntry : map.entrySet()) {
        bw.write("For instance:" + instanceEntry.getKey().toString() + "\n");
        List<TraceEventAndPosition> traceList = instanceEntry.getValue();
        for(TraceEventAndPosition tap : traceList) {
          for(int i = 0; i < tap.event.getStackDepth(); i++) {
            bw.write("  ");
          }
          bw.write(tap.event.toParsableString());
          bw.write("\n");
        }
      }
      bw.write("\n\n\n");
      
      bw.flush();
      bw.close();
    }
  }
}
