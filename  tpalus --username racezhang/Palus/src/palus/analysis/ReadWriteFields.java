// Copyright 2010 Google Inc. All Rights Reserved.

package palus.analysis;

import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * An entity class keeps the field read write (with the frequency) information
 * of a class
 * 
 * @author saizhang@google.com (Sai Zhang)
 * 
 * <em>Note:</em> this class only has package visibility
 */
class ReadWriteFields {
  
  /**
   * Variable name and frequency
   * */
  final Map<String, Integer> readFields = new LinkedHashMap<String, Integer>();
  final Map<String, Integer> writeFields = new LinkedHashMap<String, Integer>();
  /**
   * The method calls
   * */
  final Set<Method> calls = new LinkedHashSet<Method>();
  
  ReadWriteFields cloneWithoutCalls() {
    ReadWriteFields retInstance = new ReadWriteFields();
    for(Entry<String, Integer> readField : readFields.entrySet()) {
      retInstance.readFields.put(readField.getKey(), readField.getValue());
    }
    for(Entry<String, Integer> writeField : writeFields.entrySet()) {
      retInstance.writeFields.put(writeField.getKey(), writeField.getValue());
    }    
    return retInstance;
  }
  
  void read(String fieldName) {
    this.updateMap(readFields, fieldName, 1);
  }
  
  void read(String fieldName, int num) {
    this.updateMap(readFields, fieldName, num);
  }
  
  void write(String fieldName) {
    this.updateMap(writeFields, fieldName, 1);
  }
  
  void write(String fieldName, int num) {
    this.updateMap(writeFields, fieldName, num);
  }
  
  private void updateMap(Map<String, Integer> map, String fieldName, int num) {
    if(!map.containsKey(fieldName)) {
      map.put(fieldName, num);
    }
    map.put(fieldName, map.get(fieldName) + num);
  }
  
  void call(Method method) {
    if(method == null) {
      return;
    }
    this.calls.add(method);
  }
  
  Set<Method> calls() {
    return this.calls;
  }
  
  void clearCalls() {
    calls.clear();
  }
}
