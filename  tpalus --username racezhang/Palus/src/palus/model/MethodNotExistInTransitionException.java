package palus.model;

public class MethodNotExistInTransitionException extends Exception {

	private static final long serialVersionUID = 7924908631123271319L;
	
	public MethodNotExistInTransitionException(String text) {
		super(text);
	}
}
