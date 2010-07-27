package palus.model;

import palus.PalusUtil;
import palus.trace.TraceEvent;

public class TraceEventAndPosition {
	public final TraceEvent event;
	public final Position position;
	public TraceEventAndPosition(TraceEvent event, Position position) {
	    PalusUtil.checkNull(event);
	    PalusUtil.checkNull(position);
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