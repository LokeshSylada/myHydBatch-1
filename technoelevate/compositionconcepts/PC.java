package com.technoelevate.compositionconcepts;

public class PC {
	
	private MotherBoard motherBoard;
	private Case theCase;
	private Monitor monitor;
	
	public PC(MotherBoard motherBoard, Case theCase, Monitor monitor) {
		super();
		this.motherBoard = motherBoard;
		this.theCase = theCase;
		this.monitor = monitor;
	}

	public MotherBoard getMotherBoard() {
		return motherBoard;
	}

	public void setMotherBoard(MotherBoard motherBoard) {
		this.motherBoard = motherBoard;
	}

	public Case getTheCase() {
		return theCase;
	}

	public void setTheCase(Case theCase) {
		this.theCase = theCase;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	
	

}
