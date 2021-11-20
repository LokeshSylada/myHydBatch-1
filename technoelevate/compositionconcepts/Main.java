package com.technoelevate.compositionconcepts;

public class Main {

	public static void main(String[] args) {

		MotherBoard motherBoard = new MotherBoard("Asus",2,4,"B1.4");
		Monitor monitor = new Monitor("Dell","254 Beast",new Resolution(1080,400));
		Case theCase = new Case("Lenovo","Black", new Dimension(480,140,200));
		
		PC pc = new PC(motherBoard,theCase,monitor);
		pc.getTheCase().powerUp();
		pc.getMotherBoard().loadWindows();
		pc.getMonitor().draw(100, 50);
	}

}
