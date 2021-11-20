package com.technoelevate.myHydBatch.composition;

public class Main {

	public static void main(String[] args) {

		Dimensions dimensions = new Dimensions(20, 20, 5);
		Case theCase = new Case("220 B", "Dell", dimensions);

		Monitor theMonitor = new Monitor("27 inch beast", "Acer", 27, new Resolution(2540, 1440));

		MotherBoard theMotherBoard = new MotherBoard("Je-200", "Asus", 4, 6, "v2.44");

		PC thePc = new PC(theCase, theMonitor, theMotherBoard);

		thePc.getTheCase().pressPowerButton();
		thePc.getMotheBoard().loadProgram("Windows 10");
		thePc.getMonitors().drawPixelAt(1500, 1200, "Blue");

	}

}
