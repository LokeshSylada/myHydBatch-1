package com.technoelevate.collection.iterations;

import java.util.ArrayList;

public class IterationUsingForEach {

	private static ArrayList myHeros = new ArrayList();
	public static void main(String[] args) {
	
		SuperHeros ironMan = new SuperHeros("IronMan", "Iron Suit");
		SuperHeros superMan = new SuperHeros("SuperMan", "Kryptonite Cells");
		SuperHeros captainAmerica = new SuperHeros("CaptainAmerica", "Shield");
		SuperHeros thor = new SuperHeros("Thor", "Mighty Hammer");
		
		myHeros.add(ironMan);
		myHeros.add(superMan);
		myHeros.add(captainAmerica);
		myHeros.add(thor);
		
		getSuperHeros();
	}
	
	public static void getSuperHeros() {
		for(Object heros : myHeros) {
			SuperHeros myHeros = (SuperHeros)heros;
			System.out.println(myHeros.getName()+" uses "+myHeros.getWeapon());
		}
	}
}
