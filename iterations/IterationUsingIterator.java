package com.technoelevate.collection.iterations;

import java.util.ArrayList;
import java.util.Iterator;

public class IterationUsingIterator {

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
		Iterator itr = myHeros.iterator();
		while (itr.hasNext()) {
			SuperHeros hero = (SuperHeros) itr.next();
			System.out.println(hero.getName() + " uses " + hero.getWeapon());
		}
	}
}
