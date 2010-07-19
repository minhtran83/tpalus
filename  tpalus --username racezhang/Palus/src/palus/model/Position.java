package palus.model;

import palus.PalusUtil;

public final class Position {
	private int i = Integer.MAX_VALUE;
	
	//private constructor for purpose
	private Position(int i) {
		this.i = i;
	}
	
	public static Position getThisPosition() {
		return new Position(0);
	}
	
	public static Position getRetPosition() {
		return new Position(-1);
	}
	
	public static Position getParaPosition(int i) {
		PalusUtil.checkTrue(i > 0);
		return new Position(i);
	}
	
	public static Position getMockPosition() {
		return new Position(Integer.MAX_VALUE);
	}
	
	public boolean isThisPosition() {
		return i == 0;
	}
	
	public boolean isRetPosition() {
		return i == -1;
	}
	
	public boolean isParamPosition() {
		return i > 0;
	}
	//return 1 - param.length
	public int getParamPosition() {
		PalusUtil.checkTrue(this.isParamPosition());
		return this.i;
	}
}