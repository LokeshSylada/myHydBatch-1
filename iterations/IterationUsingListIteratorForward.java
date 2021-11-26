package com.technoelevate.collection.iterations;

import java.util.ArrayList;
import java.util.ListIterator;

public class IterationUsingListIteratorForward {

	public static ArrayList myHeros = new ArrayList();
	
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
		ListIterator li = myHeros.listIterator();
		while(li.hasNext()) {
			SuperHeros hero =(SuperHeros) li.next();
			System.out.println(hero.getName()+" "+hero.getWeapon());
		}

		
		
	}

}
