package com.technoelevate.polymorphismconcepts;

public class Main {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		System.out.println(cal.getSum(10, 20));
		System.out.println(cal.getSum(10, 20,30));

	}

}
