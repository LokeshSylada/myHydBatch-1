package com.technoelevate.composition;

public class PC {

	private Case theCase;
	private Monitor monitors;
	private MotherBoard motheBoard;

	public PC(Case theCase, Monitor monitors, MotherBoard motheBoard) {
		super();
		this.theCase = theCase;
		this.monitors = monitors;
		this.motheBoard = motheBoard;
	}

	public Case getTheCase() {
		return theCase;
	}

	public Monitor getMonitors() {
		return monitors;
	}

	public MotherBoard getMotheBoard() {
		return motheBoard;
	}

}
