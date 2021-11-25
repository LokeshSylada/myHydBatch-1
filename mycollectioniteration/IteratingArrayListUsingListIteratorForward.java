package com.technoelevate.mycollectioniteration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratingArrayListUsingListIteratorForward {

	private static ArrayList<SuperHeros> al = new ArrayList<SuperHeros>();

	public static void main(String[] args) {

		SuperHeros hr = new SuperHeros("Ben 10", "watch" );
		SuperHeros hr1 = new SuperHeros("Spiderman", "Web");
		SuperHeros hr2 = new SuperHeros("Torjon", "Stone");
		SuperHeros hr3= new SuperHeros("Developer", "Computer");
		SuperHeros hr4= new SuperHeros("Batman", "utililty belt ");
		
		al.add(hr);
		al.add(hr1);
		al.add(hr2);
		al.add(hr3);
		al.add(hr4);
		
		getSuperHeros();

	}
	
public static void getSuperHeros() {
	
	ListIterator itr = al.listIterator();
	
	while(itr.hasNext()) {
		SuperHeros hero = (SuperHeros) itr.next();
		System.out.println(hero.getName()+" uses "+hero.getWeapon());
	}
}	

}
