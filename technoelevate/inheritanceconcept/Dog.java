package com.technoelevate.inheritanceconcept;

public class Dog extends Animals{
	
	private int legs;
	private int eyes;
	private int tail;
	private String coat;

	public Dog(String name, int body, int size, int brain, int weight,int legs,int eyes,int tail,String coat) {
		super(name, body, size, brain, weight);
		this.legs = legs;
		this.eyes = eyes;
		this.tail = tail;
		this.coat = coat;
		
	}
	
	public void chew() {
		System.out.println("Dog.chew() called");
	}
	
	@Override
	public void eat() {
		System.out.println("Dog.eat() called");
		chew();
	}
	

	public void walk(int speed) {
		System.out.println("Dog is walking with the speed of : "+speed);
		move();
	}
	
	
	public void run(int speed) {
		System.out.println("Dog is running with the speed of : "+speed);
		super.move();
	}

	public void moveLeg() {
		System.out.println("Dog.moveLeg() is called");
	}

	
//	@Override
//	public void move() {
//		System.out.println("Dog.move() is called");
//		moveLeg();
//	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public int getEyes() {
		return eyes;
	}

	public void setEyes(int eyes) {
		this.eyes = eyes;
	}

	public int getTail() {
		return tail;
	}

	public void setTail(int tail) {
		this.tail = tail;
	}

	public String getCoat() {
		return coat;
	}

	public void setCoat(String coat) {
		this.coat = coat;
	}

	
	
 
}
