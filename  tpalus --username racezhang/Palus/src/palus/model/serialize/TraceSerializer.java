// Copyright 2010 Google Inc. All Rights Reserved.

package palus.model.serialize;

import palus.PalusUtil;
import palus.model.TraceAnalyzer;
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
import java.util.LinkedList;
import java.util.List;

/**
 * Provides serialization support for the  {@link TraceEvent} list.
 * 
 * @author saizhang@google.com (Sai Zhang)
 *
 */
public class TraceSerializer {
  /**
   * The list of events to serialize
   * */
  private final List<TraceEvent> events;
  
  /**
   * The file to which the trace list serializes.
   * */
  private final File file;
  
  /**
   * Constructor. Initialize the traces and the serialized file.
   * */
  public TraceSerializer(List<TraceEvent> events, String fileName) throws IOException {
    this(events, new File(fileName));
  }
  
  /**
   * Constructor. Initialize the traces and the serialized file.
   * */
  public TraceSerializer(List<TraceEvent> events, File file) throws IOException {
    PalusUtil.checkNull(events, "The trace event list to serialize could not be null.");
    PalusUtil.checkNull(file, "The file for serialization could not be null.");
    this.events = events;
    this.file = file;
    //create the file in case of the nonexistence
    if(!this.file.exists()) {
      this.file.createNewFile();
    }
  }
  
  /**
   * Saves the traces as pure text.
   * */
  public void serializeTracesAsText() throws IOException {
    BufferedWriter bw = new BufferedWriter(new FileWriter(this.file));
    for(TraceEvent event : events) {
      bw.write(event.toParsableString() + Globals.lineSep);
    }
    bw.flush();
    bw.close();
  }
  
  /**
   * Saves the traces as binary object.
   * */
  public void serializeTracesAsObject() throws IOException {
    FileOutputStream out = new FileOutputStream(file);
    ObjectOutputStream oos = new ObjectOutputStream(out);
    //first write the size of event list
    oos.writeInt(events.size());
    //write the trace event
    for(TraceEvent event : events) {
      event.serialize(oos);
    }
    oos.flush();
    out.flush();
    oos.close();
    out.close();
  }
  
  /**
   * Reads the trace list from a binary file.
   * */
  public static List<TraceEvent> deserializeObjectsFromTrace(File file) throws IOException, ClassNotFoundException {
    List<TraceEvent> events = new LinkedList<TraceEvent>();
    FileInputStream fin = new FileInputStream(file);
    ObjectInputStream ois = new ObjectInputStream(fin);
    
    //Object obj = null;
    int size = ois.readInt();
    //System.out.println("size: " + size);
    for(int i = 0; i < size; i++) {
//      obj = ois.readObject();
//      if(!(obj instanceof TraceEvent)) {
//          throw new IOException("The file: " + file.getAbsolutePath()
//              + " is corrupted. Contain object other than TraceEvent!");
//      }
//      TraceEvent event = (TraceEvent)obj;
      TraceEvent event = TraceEvent.deserialize(ois);
      events.add(event);
    }
    
    return events;
  }
  
  /**
   * A simple test main
   * */
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    File file = new File(TraceAnalyzer.TRACE_OBJECT_FILE);
    List<TraceEvent> events = TraceSerializer.deserializeObjectsFromTrace(file);
    System.out.println("event size: " + events.size());
    TraceSerializer serializer = new TraceSerializer(events, "./trace_txt_from_recover_obj.txt");
    serializer.serializeTracesAsText();
  }
}