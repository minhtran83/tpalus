package palus.model;

import palus.PalusUtil;

public final class ClassesToModel {
	public static boolean modelThisClass(Class<?> clz) {
		//TODO what about interface?
		if(clz.isPrimitive() || PalusUtil.isPrimitive(clz) || clz.isArray()) {
			return false;
		}
		
		if(clz.getName().indexOf("$") != -1) {
			return false;
		}
		
		if (clz.getPackage() == null) {
			return true;
		}
		
		if (clz.getPackage().getName().startsWith("palus.")) {
			return false;
		}
		if (clz.getPackage().getName().startsWith("org.objectweb.asm")
		    || clz.getPackage().getName().startsWith("java.")
			|| clz.getPackage().getName().startsWith("junit.")) {
			return false;
		}
		return true;
	}
}