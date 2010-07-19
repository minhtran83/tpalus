package palus.model;

import palus.trace.TraceEvent;

public class TraceEventAndPosition {
	public final TraceEvent event;
	public final Position position;
	public TraceEventAndPosition(TraceEvent event, Position position) {
		this.event = event;
		this.position = position;
	}
}