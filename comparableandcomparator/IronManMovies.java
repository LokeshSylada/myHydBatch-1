package com.technoelevate.collection.comparableandcomparator;

import java.text.DecimalFormat;

public class IronManMovies implements Comparable<IronManMovies> {
	
	private String name;
	private Double ratings;
	private Integer releaseYear;
	
	public IronManMovies(String name, double ratings,Integer releaseYear) {
		this.name = name;
		this.ratings = ratings;
		this.releaseYear = releaseYear;
	}
	
	
	public int compareTo(IronManMovies m) {
		Integer currentObjectYear = this.getReleaseYear()%10;
		Integer passedObjectYear = m.getReleaseYear()%10;
		return currentObjectYear.compareTo(passedObjectYear);
		//return this.getName().compareTo(m.getName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getRatings() {
		return ratings;
	}

	public void setRatings(double ratings) {
		this.ratings = ratings;
	}

	public Integer getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}



}
