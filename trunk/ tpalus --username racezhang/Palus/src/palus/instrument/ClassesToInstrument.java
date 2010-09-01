// Copyright 2010 Google Inc. All Rights Reserved.

package palus.instrument;

import palus.PalusUtil;
import palus.model.BugInPalusException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * Only instrument user-provided classes
 *
 * @author saizhang@google.com (Sai Zhang)
 */
class ClassesToInstrument {
  
  /**
   * A list of classes that need to be instrumented
   * 
   * note that the class name will be kept in the form of package.name.class.name
   * However, the asm framework may use package/name/class/name, be aware of this.
   * */
  private static Set<String> needToInstrumentClasses = null;
  
  /**
   * Init the list of instrumented classes
   * @param file a text file containing all need-to-instrument classes
   * */
  public static void initInstrumentedClasses(File file) {
    PalusUtil.checkNull(file);
    PalusUtil.checkTrue(file.exists());
    PalusUtil.checkTrue(needToInstrumentClasses == null);
    
    //init the set and add the classes one by one
    needToInstrumentClasses = new HashSet<String>();
    try {
      BufferedReader br = new BufferedReader(new FileReader(file));
      String line = br.readLine();
      while(line != null) {
        needToInstrumentClasses.add(line.trim());
        line = br.readLine();
      }
    } catch (FileNotFoundException e) {
      throw new BugInPalusException("The file: " + file.getAbsolutePath()+ " is not found!");
    } catch (IOException e) {
      needToInstrumentClasses = null;
      System.err.println("Errors in reading user-provided need-to-instrument file!");
    }
  }
  
  /**
   * Should this class been instrumented
   * */
  public static boolean instrumentClass(String name) {
    PalusUtil.checkNull(name);
    //if there is no instrument classes provided, we assume
    //every class should be instrumented
    if(needToInstrumentClasses == null) {
      return true;
    }
    name = PalusUtil.transClassNameSlashToDot(name);
    return needToInstrumentClasses.contains(name);
  }
  
  /**
   * The number of classes to instrument
   * */
  public static int numOfInstrumentedClasses() {
    PalusUtil.checkNull(needToInstrumentClasses);
    return needToInstrumentClasses.size();
  }
}
