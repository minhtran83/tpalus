// Copyright 2010 Google Inc. All Rights Reserved.
package palus.model;

import palus.PalusUtil;

/**
 * Represents an object instance during Java execution.
 * 
 * @author saizhang@google.com (Sai Zhang)
 * 
 * */
public final class Instance {
	/**
	 * The object id from JVM. 0 for null object.
	 * */
	public final int objId;
	/**
	 * Object type. Can not be null.
	 * */
	public final Class<?> type;
	
	/**
	 * Constructor. Initialize an instance.
	 * */
	public Instance(int objectId, Class<?> type) {
	  PalusUtil.checkNull(type, "The class type could not be null.");
	  this.type = type;
	  this.objId = objectId;
	}
	
	/**
	 * Checks whether the current instance is a primitive or primitive wrapper
	 * */
	public boolean isPrimitiveType() {
		return type.isPrimitive() || PalusUtil.isPrimitive(type);
	}
	
	/**
	 * Checks whether the current instance is a string type
	 * */
	public boolean isStringType() {
		return type.equals(java.lang.String.class);
	}
	
	@Override
	public int hashCode() {
		return 173*objId + 19*type.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Instance)) {
			return false;
		} else {
			Instance instance = (Instance)obj;
			if(instance.type != this.type || instance.objId != this.objId) {
				return false;
			}
			
			return true;
		}
	}
	
	@Override
	public String toString() {
	  return this.type + "@" + this.objId;
	}
}
