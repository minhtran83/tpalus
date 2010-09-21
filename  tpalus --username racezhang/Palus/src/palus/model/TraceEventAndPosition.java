// Copyright 2010 Google Inc. All Rights Reserved.
package palus.model;

import palus.PalusUtil;
import palus.trace.TraceEvent;

/**
 * A simple wrapper class. It wraps a {@link TraceEvent} and a {@link Position}
 * object.
 * 
 * @author saizhang@google.com (Sai Zhang)
 *
 */
public class TraceEventAndPosition {
    /**
     * The wrapped {@link TraceEvent} object.
     * */
	public final TraceEvent event;
	/**
     * The wrapped {@link Position} object.
     * */
	public final Position position;
	/**
     * Default constructor. Just assigning values to the wrapped objects.
     * */
	public TraceEventAndPosition(TraceEvent event, Position position) {
	    PalusUtil.checkNull(event, "The trace event could not be null.");
	    PalusUtil.checkNull(position, "The position could not be null.");
		this.event = event;
		this.position = position;
	}
	
	@Override
	public int hashCode() {
	  return position.hashCode() + 13 * event.hashCode();
	}
	
	@Override
	public boolean equals(Object o) {
	  if(!(o instanceof TraceEventAndPosition)) {
	    return false;
	  } else {
	    TraceEventAndPosition tap = (TraceEventAndPosition)o;
	    //the equals method in TraceEvent class has not been overriden, here we
	    //just use the equals method in Object class. The equals method in the
	    //Position class just compares the int position value
	    return this.event.equals(tap.event) && this.position.equals(tap.position);
	  }
	}
}