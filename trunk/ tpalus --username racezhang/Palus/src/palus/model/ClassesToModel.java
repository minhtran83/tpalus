// Copyright 2010 Google Inc. All Rights Reserved.
package palus.model;

import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

import palus.PalusUtil;

/**
 * A repository containing the classes to model during processing.
 * 
 * The tool will only model classes defined in this class.
 * 
 * @author saizhang@google.com (Sai Zhang)
 *
 */
public final class ClassesToModel {
  
  /**
   * An option, indicating whether only model user-provided classes.
   * If it is false, the tool builds model for every class
   * */
   public static boolean only_model_user_provided = false;

    /**
     * Check whether this class should be included in the model or not
     * @param clz the class to be check
     * @return true if the class needs to be modelled, false if else.
     * */
	public static boolean modelThisClass(Class<?> clz) {
		//do not build model for abstract class and interface
	    if(Modifier.isAbstract(clz.getModifiers()) || Modifier.isInterface(clz.getModifiers())) {
	      return false;
	    }
	    //do not build model for primitive type, primitive type wrapper, array,
	    //and string type
		if(clz.isPrimitive() || PalusUtil.isPrimitive(clz) || clz.isArray() || PalusUtil.isStringType(clz)) {
			return false;
		}
		//skip inner class. generally, there is no way to call inner class
		if(clz.getName().indexOf("$") != -1) {
			return false;
		}
		//no package name
		if (clz.getPackage() == null) {
			return true;
		}
		//do not build for palus' own code
		if (clz.getPackage().getName().startsWith("palus.")) {
			return false;
		}
		//do not build model for asm, java lib, junit, and xml processing lib
		if (clz.getPackage().getName().startsWith("org.objectweb.asm")
		    || clz.getPackage().getName().startsWith("java.")
			|| clz.getPackage().getName().startsWith("junit.")
			|| clz.getPackage().getName().startsWith("org.xmlpull.")) {
			return false;
		}
		//if build model for every other class
		if(!only_model_user_provided) {
		    return true;
		} else {
		  //only for the user-provided ones
		  return classesToModel.contains(clz);
		}
	}
	
	/**
	 * All classes users provided
	 * */
	private static Set<Class<?>> classesToModel = new LinkedHashSet<Class<?>>();
	
	/**
	 * Initialize the user-provided class set. The set is intended to be initialized
	 * only once. It will throw an exception if the code changes the class set later on.
	 * */
	public static void initializeClassesToModel(Collection<Class<?>> classes) {
	  PalusUtil.checkTrue(classesToModel.isEmpty());
	  classesToModel.addAll(classes);
	}
}