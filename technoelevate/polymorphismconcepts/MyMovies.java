package com.technoelevate.polymorphismconcepts;

class Movies {
	private String name;

	public Movies(String name) {
		this.name = name;
	}

	public String plot() {
		return "Plot of the movie goes here";
	}

	public String getName() {
		return name;
	}
	
}

class IronMan extends Movies {

	public IronMan(String name) {
		super(name);
	}

	@Override
	public String plot() {

		return "Iron Man saves the world from imperial forces";
	}
}

class Legend extends Movies {

	public Legend(String name) {
		super(name);

	}

	@Override
	public String plot() {
		// TODO Auto-generated method stub
		return "Jai Balayaa";
	}
}

class Bahubali extends Movies {

	public Bahubali(String name) {
		super(name);

	}

	@Override
	public String plot() {
		// TODO Auto-generated method stub
		return "Mr. Bali saves the kingdom from Kalkeya";
	}

}

class SomeMovie extends Movies {

	public SomeMovie(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

}

public class MyMovies {
	public static void main(String[] args) {
		
		for(int i =0 ;i<10;i++) {
			Movies movies = movieGenerator();
		System.out.println("Movie # "+i+"\n"+movies.getName()+":"+movies.plot());
		}
	}

	public static Movies movieGenerator() {

		int randomNumber = (int) ((Math.random() * 4 )+ 1);
		System.out.println("Random number generated : "+randomNumber);	
		switch (randomNumber) {
		case 1:
			return new IronMan("IronMan");

		case 2:
			return new Legend("Last Hope");

		case 3:
			return new Bahubali("Power");

		case 4:
			return new SomeMovie("Cast Away");
			
	
		}
		return null;
	}

}
