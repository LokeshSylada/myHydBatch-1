package com.technoelevate.compositionconcepts;

public class Monitor {
	
	private String brand;
	private String model;
	private Resolution nativeResolution;
	
	public Monitor(String brand, String model, Resolution nativeResolution) {
		super();
		this.brand = brand;
		this.model = model;
		this.nativeResolution = nativeResolution;
	}
	
	public void draw(int length, int height) {
		System.out.println("Drawing the logo at : "+length +" and "+height);
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Resolution getNativeResolution() {
		return nativeResolution;
	}

	public void setNativeResolution(Resolution nativeResolution) {
		this.nativeResolution = nativeResolution;
	}
	
	

}
