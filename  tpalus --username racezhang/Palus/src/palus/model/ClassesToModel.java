package palus.model;

import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

import palus.PalusUtil;

public final class ClassesToModel {
  
   public static boolean only_model_user_provided = false;
    /**
     * Check whether this class should be included in the model or not
     * @param clz the class to be check
     * @return true if the class needs to be modelled, false if else.
     * */
	public static boolean modelThisClass(Class<?> clz) {
		//exclude abstract
	    if(Modifier.isAbstract(clz.getModifiers()) || Modifier.isInterface(clz.getModifiers())) {
	      return false;
	    }
	    //exclude primitive, string type
		if(clz.isPrimitive() || PalusUtil.isPrimitive(clz) || clz.isArray() || PalusUtil.isStringType(clz)) {
			return false;
		}
		//exclude inner class
		if(clz.getName().indexOf("$") != -1) {
			return false;
		}
		//no package name
		if (clz.getPackage() == null) {
			return true;
		}
		//exclude the code self
		if (clz.getPackage().getName().startsWith("palus.")) {
			return false;
		}
		//exclude the asm, and java, and junit
		if (clz.getPackage().getName().startsWith("org.objectweb.asm")
		    || clz.getPackage().getName().startsWith("java.")
			|| clz.getPackage().getName().startsWith("junit.")
			|| clz.getPackage().getName().startsWith("org.xmlpull.")) {
			return false;
		}
		//TODO add some by users
		if(!only_model_user_provided) {
		    return true;
		} else {
		  return classesToModel.contains(clz);
		}
	}
	
	/**
	 * All classes user provided
	 * */
	private static Set<Class<?>> classesToModel = new LinkedHashSet<Class<?>>();
	
	public static void initializeClassesToModel(Collection<Class<?>> classes) {
	  PalusUtil.checkTrue(classesToModel.isEmpty());
	  classesToModel.addAll(classes);
	}
}