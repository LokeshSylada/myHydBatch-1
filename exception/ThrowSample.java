package com.technoelevate.exception;

public class ThrowSample extends RuntimeException {

	public static void main(String[] args) {
//		throw new ArithmeticException();
		throw new ThrowSample();

	}

}
