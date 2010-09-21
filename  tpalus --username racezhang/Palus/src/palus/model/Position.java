// Copyright 2010 Google Inc. All Rights Reserved.
package palus.model;

import java.io.Serializable;

import palus.PalusUtil;

/**
 * This simple class represents the position where an object could
 * appear in a method. Here is possible position of an object in a method:
 * 
 * Method:        ret-type    this  (param1, param2, .... param n)
 * Positions:        -1         0        1       2    ....   n
 * 
 *  @author saizhang@google.com (Sai Zhang)
 * */
public final class Position implements Serializable {
  
    /**
     * The initial position integer
     * */
	private int i = Integer.MAX_VALUE;
	
	/**
	 * Private constructor. Can not be called from external.
	 * */
	private Position(int i) {
		this.i = i;
	}
	
	/**
	 * Returns the position for the receiver object.
	 * */
	public static Position getThisPosition() {
		return new Position(0);
	}
	
	/**
     * Returns the position for the return object.
     * */
	public static Position getRetPosition() {
		return new Position(-1);
	}
	
	/**
     * Returns the position for the parameter object at the i-th position.
     * */
	public static Position getParaPosition(int i) {
		PalusUtil.checkTrue(i > 0, "The given position int i: " + i + " should > 0");
		return new Position(i);
	}
	
	/**
     * Returns a mock object for place holder.
     * */
	public static Position getMockPosition() {
		return new Position(Integer.MAX_VALUE);
	}
	
	/**
	 * Checks is the current position in the receiver place
	 * */
	public boolean isThisPosition() {
		return i == 0;
	}
	
	/**
     * Checks is the current position in the return object place
     * */
	public boolean isRetPosition() {
		return i == -1;
	}
	
	/**
     * Checks is the current position in the parameter position
     * */
	public boolean isParamPosition() {
		return i > 0;
	}
	
	/**
     * If the current position is in the parameter position, it returns
     * the parameter index from 1 to parameters.length.
     * 
     * Else, thrown an exception indicating illegal argument.
     * */
	public int getParamPosition() {
		PalusUtil.checkTrue(this.isParamPosition(), "The current position: " + i
		    + " is not a param position!");
		return this.i;
	}
	
	/**
	 * Returns the integer value representing the position
	 * */
	public int toIntValue() {
	  PalusUtil.checkTrue(i != Integer.MAX_VALUE, "The position int i should be set!");
	  return this.i;
	}
	
	@Override
	public String toString() {
	  return "position: " + this.i;
	}
	
	@Override
	public int hashCode() {
	  return this.i * 107;
	}
	
	@Override
	public boolean equals(Object o) {
	  if(!(o instanceof Position)) {
	    return false;
	  } else {
	    Position p = (Position)o;
	    return p.toIntValue() == this.i;
	  }
	}
}