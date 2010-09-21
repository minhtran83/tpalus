// Copyright 2010 Google Inc. All Rights Reserved.

package palus.trace;

import palus.model.serialize.TraceSerializer;

import palus.PalusUtil;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * Provides utilities for large trace file. A large trace file will be splitted
 * into several small files, each of which contains {@link TraceStack#check_point_size}
 * trace events.
 * 
 * @author saizhang@google.com (Sai Zhang)
 *
 */
public class TraceFileCombinator {

  /**
   * Reads recorded traces in each splitted file in order, and then combine the
   * result. This method is delegated to the {@link #combineSplittedTraceFiles(File[])}
   * */
  public static List<TraceEvent> combineSplittedTraceFiles(String[] fileNames) {
    PalusUtil.checkNull(fileNames, "The file name array to combine could not be null.");
    File[] files = new File[fileNames.length];
    int index = 0;
    for(String fileName : fileNames) {
      files[index++] = new File(fileName);
    }
    return combineSplittedTraceFiles(files);
  }
  
  /**
   * Reads recorded traces in each splitted file in order, and then combine
   * the result.
   * 
   * This method could return a huge list.
   * */
  public static List<TraceEvent> combineSplittedTraceFiles(File[] files) {
    PalusUtil.checkNull(files, "The trace file to combine could not be null.");
    for(File file : files) {
      PalusUtil.checkTrue(file.exists(), "The given file: " + file.getAbsolutePath()
          + " does not exist!");
    }
    
    List<TraceEvent> retList = new LinkedList<TraceEvent>();
    for(File file : files) {
        List<TraceEvent> events = null;
        try {
          events = TraceSerializer.deserializeObjectsFromTrace(file);
          retList.addAll(events);
        } catch (IOException e1) {
          throw new RuntimeException(e1);
        } catch (ClassNotFoundException e2) {
          throw new RuntimeException(e2);
        }
    }
    //returns the combined list
    return retList;
  }
}
