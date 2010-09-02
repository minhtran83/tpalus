// Copyright 2010 Google Inc. All Rights Reserved.
package palus.model;

/**
 * If there is no method corresponding to a transition, this exception will be
 * thrown.
 * 
 * @author saizhang@google.com (Sai Zhang)
 *
 */
public class MethodNotExistInTransitionException extends Exception {

	private static final long serialVersionUID = 7924908631123271319L;
	
	public MethodNotExistInTransitionException(String text) {
		super(text);
	}
}
