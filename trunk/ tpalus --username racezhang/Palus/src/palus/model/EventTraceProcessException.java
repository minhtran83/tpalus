// Copyright 2010 Google Inc. All Rights Reserved.
package palus.model;

/**
 * This exception will be thrown for any errors occured during event trace data
 * processing.
 * 
 * @author saizhang@google.com (Sai Zhang)
 *
 */
public class EventTraceProcessException extends Exception {
	private static final long serialVersionUID = 2049296512163381915L;

	public EventTraceProcessException(String text) {
		super(text);
	}
}
