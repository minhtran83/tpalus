package palus.model;

import palus.AbstractState;
import palus.PalusUtil;

public final class Instance {
	
	//the object id in JVM
	public final int objId;
	public final Class<?> type;
	
	public Instance(int objectId, Class<?> type) {
	  PalusUtil.checkNull(type);
	  this.type = type;
	  this.objId = objectId;
	}
	
	/**
	 * Check is the current instance a primitive or primitive wrapper type
	 * */
	public boolean isPrimitiveType() {
		return type.isPrimitive() || PalusUtil.isPrimitive(type);
	}
	
	public boolean isStringType() {
		return type.equals(java.lang.String.class);
	}
	
	public AbstractState abstractState() {
		return null;
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
