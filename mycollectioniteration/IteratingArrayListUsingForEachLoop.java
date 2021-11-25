package com.technoelevate.mycollectioniteration;

import java.util.ArrayList;

public class IteratingArrayListUsingForEachLoop {

	private static ArrayList myList = new ArrayList();
	public static void main(String[] args) {
		
		SuperHeros  sh1 = new SuperHeros("Iron man", "mark54");		
		SuperHeros  sh2 = new SuperHeros("Donaldo", "download");		
		SuperHeros  sh3= new SuperHeros("SpiderMan", "Web");		
		SuperHeros  sh4= new SuperHeros("BatMan", "Tech");		
		SuperHeros  sh5= new SuperHeros("Dr,Strange", "Magic");	
		
		myList.add(sh1);
		myList.add(sh2);
		myList.add(sh3);
		myList.add(sh4);
		myList.add(sh5);
		getSuperHero();
		
	}
	public static void getSuperHero() {	
		for(Object hero:myList) {
			SuperHeros myHero =(SuperHeros) hero;
			System.out.println(myHero.getName()+" uses "+myHero.getWeapon());
		}
	}

}
