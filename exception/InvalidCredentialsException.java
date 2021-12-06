package com.technoelevate.exception;

public class InvalidCredentialsException extends RuntimeException {

	public InvalidCredentialsException() {
		super();

	}

	@Override
	public String toString() {
		return "Invalid credentials. Please try with a different username and password combination";
	}

}
