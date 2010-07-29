// Copyright 2010 Google Inc. All Rights Reserved.

package palus.model;

import com.thoughtworks.xstream.XStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Map;

/**
 * @author saizhang@google.com (Your Name Here)
 *
 */
public final class ModelSerializer {
  
  //private static XStream xstream = new XStream();
  
  public static void serializeClassModels(Map<Class<?>, ClassModel> models, String persistentPath) {
    serializeClassModels(models, new File(persistentPath));
  }
  
  public static void serializeClassModels(Map<Class<?>, ClassModel> models, File persistentFile) {
//    try {
//      xstream.toXML(models, new FileOutputStream(persistentFile));
//    } catch (FileNotFoundException e) {
//      e.printStackTrace();
//    }
    
  }
  
  public static Map<Class<?>, ClassModel> deserializeClassModels(String persistentPath) {
    return deserializeClassModels(new File(persistentPath));
  }
  
  public static Map<Class<?>, ClassModel> deserializeClassModels(File persistentFile) {
    return null;
  }
}