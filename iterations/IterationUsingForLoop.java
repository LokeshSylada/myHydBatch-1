package com.technoelevate.collection.iterations;
import java.util.ArrayList;

public class IterationUsingForLoop {

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
		
		SuperHeros heros;
		for(int i=0;i<myHeros.size();i++) {
			heros = (SuperHeros) myHeros.get(i);
			System.out.println(heros.getName()+" ");
		}
	}

}
