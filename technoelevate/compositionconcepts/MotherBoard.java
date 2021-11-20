package com.technoelevate.compositionconcepts;

public class MotherBoard {
	
	private String model;
	private int ramSlots;
	private int cardSlots;
	private String bios;
	
	
	public MotherBoard(String model, int ramSlots, int cardSlots, String bios) {
		super();
		this.model = model;
		this.ramSlots = ramSlots;
		this.cardSlots = cardSlots;
		this.bios = bios;
	}
	
	public void loadWindows() {
		System.out.println("Loading program windows");
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getRamSlots() {
		return ramSlots;
	}
	public void setRamSlots(int ramSlots) {
		this.ramSlots = ramSlots;
	}
	public int getCardSlots() {
		return cardSlots;
	}
	public void setCardSlots(int cardSlots) {
		this.cardSlots = cardSlots;
	}
	public String getBios() {
		return bios;
	}
	public void setBios(String bios) {
		this.bios = bios;
	}
	
	

}
