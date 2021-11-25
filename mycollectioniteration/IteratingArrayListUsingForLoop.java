package com.technoelevate.mycollectioniteration;

import java.util.ArrayList;

public class IteratingArrayListUsingForLoop {
	
	private static ArrayList<SuperHeros> myHeros = new ArrayList<SuperHeros>(); 

	public static void main(String[] args) {
		
		SuperHeros sh1 = new SuperHeros("Ironman","Iron Suit");
		SuperHeros sh2 = new SuperHeros("Captain America","Shield");
		SuperHeros sh3 = new SuperHeros("Thor","StromeBreaker");
		SuperHeros sh4 = new SuperHeros("Hulk","Gamma Rays");
		SuperHeros sh5 = new SuperHeros("SuperMan","Kryptonite Cells");
		
		myHeros.add(sh1);
		myHeros.add(sh2);
		myHeros.add(sh3);
		myHeros.add(sh4);
		myHeros.add(sh5);
		
		getSuperHeros();	
	
	}

	public static void getSuperHeros() {
		
		for(int i=0;i<myHeros.size();i++) {
			System.out.println(myHeros.get(i).getName()+" uses "+myHeros.get(i).getWeapon());

		}
		
	}
	
	
}
