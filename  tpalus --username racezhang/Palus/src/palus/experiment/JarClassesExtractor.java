// Copyright 2010 Google Inc. All Rights Reserved.

package palus.experiment;

import palus.PalusUtil;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/**
 * A utility class for experiment, extracting a list of classes from a given
 * jar.
 * 
 * @author saizhang@google.com (Sai Zhang)
 *
 */
public class JarClassesExtractor {
  
  /**
   * Returns a list of class names from a given Jar file.
   * returns class name in the form of package/name/classname.class
   * @throws IOException 
   * */
  public static List<String> extractClassNames(String jarFilePath) throws IOException {
    
     File jarFile = new File(jarFilePath); 
    
     List<String> classNames = new LinkedList<String>();
     
     JarFile inJar = new JarFile(jarFile);
     // get all jar entries from the jar file
     Enumeration<JarEntry> entries = inJar.entries();
     while (entries.hasMoreElements()) {
       // get a jar entry and input stream
       JarEntry entry = entries.nextElement();
       InputStream inJarStream = inJar.getInputStream(entry);
       // add the jar entry
       if (entry.isDirectory()) {
         // do nothing for directory
       } else if (entry.getName().endsWith(".class")) {
         classNames.add(entry.getName());
       }
       inJarStream.close();
     }

     inJar.close();
     
     return classNames;
  }
  
  /**
   * A utility method returns a list of non-anonymous, non-inner class names inside a jar.
   * returns class name in the form of package.name.class.name
   * */
  public static List<String> extracClassNamesForTests (String jarFilePath, String packageName,
      String fileName)
    throws IOException {
    List<String> allClasses = extractClassNames(jarFilePath);
    List<String> retClasses = new LinkedList<String>();
    
    for(String clazz : allClasses) {
//      if(clazz.indexOf("$") != -1) {
//        continue;
//      }
      String className = PalusUtil.transClassNameSlashToDot(clazz);
      if(className.endsWith(".class")) {
        className = className.substring(0, className.length() - ".class".length());
      }
      
      if(packageName != null && !className.startsWith(packageName)) {
        continue;
      }
      if(fileName == null) {
        System.out.println(className);
      }
      retClasses.add(className);
    }
    
    return retClasses;
  }
  
  /**
   * A simple testing driver
   * @throws IOException 
   * */
  public static void main(String[] args) throws IOException {
    
    String jarPath = 
    //"/home/saizhang/project/googlecodeval/google3/blaze-bin/java/com/google/gws/gws_deploy.jar";
    //"/home/saizhang/project/googlecodeval/google3/blaze-bin/java/com/google/testing/tap/testbroker/server/TestBroker_deploy.jar";
    //"/home/saizhang/project/googlecodeval/google3/blaze-bin/java/com/google/ads/pebl/libpebl.jar";
    //"/home/saizhang/project/googlecodeval/google3/blaze-bin/java/com/google/buzz/sessionbin_deploy.jar";
     // "/home/saizhang/project/googlecodeval/google3/blaze-bin/javatests/com/google/buzz/alltestsbin_deploy.jar";
     "/home/saizhang/project/googlecodeval/google3/blaze-bin/java/com/google/orkut/www_frontend_bin_deploy.jar";
     // "/home/saizhang/project/googlecodeval/google3/blaze-bin/java/com/google/caribou/frontend/frontend_en_bin_deploy.jar";
     // "/home/saizhang/project/googlecodeval/google3/blaze-bin/java/com/google/caribou/Caribou_en_deploy.jar";
     // "/home/saizhang/project/googlecodeval/google3/blaze-bin/java/com/google/testing/fortknox/alerts/alerts_lib_bin_deploy.jar";
      //"/home/saizhang/project/googlecodeval/google3/blaze-bin/java/com/google/testing/fortknox/projects/megastore_repository_bin_deploy.jar";
    //"/home/saizhang/project/googlecodeval/google3/blaze-bin/java/com/google/testing/fortknox/client/client_bin_deploy.jar";
    String packageName =
    //"com.google.gws";
    //"com.google.testing.tap";
      //"com.google.buzz.video";
      //"com.google.calendar";
      "com.google.orkut";
      //"com.google.testing.fortknox";
     //"com.google.caribou.base";
    
    if(args != null & args.length >= 2) {
      jarPath = args[0];
      packageName = args[1];
    }
    
    JarClassesExtractor.extracClassNamesForTests(jarPath, packageName, null);
  }
  
}
