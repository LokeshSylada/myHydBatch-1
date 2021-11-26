package com.technoelevate.collection.comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableMovie {
	
	private static ArrayList<IronManMovies> movie = new ArrayList<IronManMovies>();

	public static void main(String[] args) {
	
		IronManMovies ironMan1 = new IronManMovies("IronMan part 2", 7.0,1975);
		IronManMovies ironMan2 = new IronManMovies("IronMan part 3", 7.1,2010);
		IronManMovies ironMan3 = new IronManMovies("IronMan part 1", 7.9,2121);
		
		
		movie.add(ironMan1);
		movie.add(ironMan2);
		movie.add(ironMan3);
		
	 	Collections.sort(movie);
	
		System.out.println("Movies after sorting");
		System.out.println("MovieName  Ratings  RealeaseYear ");
		for(IronManMovies movie : movie) {
			
			System.out.println(movie.getName()+" "+
											movie.getRatings()+" "+
											movie.getReleaseYear());
			
		}
		
		
	}
	
		


	
	
}
