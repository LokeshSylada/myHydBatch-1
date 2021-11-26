package com.technoelevate.collection.iterations;

import java.util.ArrayList;
import java.util.ListIterator;

public class IterationUsingListIteratorBackwards {
	
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
		ListIterator itr = myHeros.listIterator(myHeros.size());
		while(itr.hasPrevious()) {
			SuperHeros hero = (SuperHeros) itr.previous();
			System.out.println(hero.getName()+" uses "+hero.getWeapon());
		}
	}
}
