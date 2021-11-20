package com.technoelevate.compositionconcepts;

public class Case {

	private String brand;
	private String color;
	private Dimension dimesion;

	public Case(String brand, String color, Dimension dimesion) {
		super();
		this.brand = brand;
		this.color = color;
		this.dimesion = dimesion;
	}
	
	public void powerUp() {
		System.out.println("Power button pressed. Turning on the computer");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Dimension getDimesion() {
		return dimesion;
	}

	public void setDimesion(Dimension dimesion) {
		this.dimesion = dimesion;
	}

}
