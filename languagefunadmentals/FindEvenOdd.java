package com.technoelevate.languagefunadmentals;

public class FindEvenOdd {

	public static void main(String[] args) {
		FindEvenOdd fed = new FindEvenOdd();
		fed.findEvenOdd(11);
	}

	public void findEvenOdd(int num) {
		if (num % 2 == 0) {
			System.out.println(num + " is even");
		} else {
			System.out.println(num + " is odd");
		}

	}

}
