package com.technoelevate.mycollectioniteration;

import java.util.ArrayList;
import java.util.ListIterator;

public class IteratingArrayListUsingListIteratorBackwards {
 
	private static ArrayList list=new ArrayList();
	
	public static void main(String[] args) {
		
		SuperHeros S1 = new SuperHeros("Donald","KPHB");
		SuperHeros S2 = new SuperHeros("Donut","HB");
		SuperHeros S3= new SuperHeros("Viswa","Vskp");
		SuperHeros S4= new SuperHeros("Pavan","Bza");
		list.add(S1);
		list.add(S2);
		list.add(S3);
		list.add(S4);
		
		getSuperHeros();
	}
	public static void getSuperHeros() {
	
		ListIterator itr = list.listIterator(list.size());
		
		while(itr.hasPrevious()) {
			SuperHeros hero = (SuperHeros) itr.previous();
			System.out.println(hero.getName()+" stays at "+hero.getWeapon());
		}
		
		
	}
}
