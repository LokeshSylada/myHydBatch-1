package com.technoelevate.exception;

public class ThrowsDemo {

	public static void main(String[] args) throws InterruptedException {

		sonBringAGlassOfWater();

	}

	public static void sonBringAGlassOfWater() throws InterruptedException {
		sisterBringAGlassOfWater();
	}

	public static void sisterBringAGlassOfWater() throws InterruptedException {
		MomBringAGlassOfWater();
	}

	public static void MomBringAGlassOfWater() throws InterruptedException {
		Thread.sleep(10000);
	}

}
