package com.technoelevate.exception;

public class BalayaBank {

	private String name;
	private double balance;
	private String userName;
	private String password;

	public BalayaBank(String name, double balance, String userName, String password) {

		this.name = name;
		this.balance = balance;
		this.userName = userName;
		this.password = password;
	}

	public void deposite(String username, String password, double amount) {
		if (!this.userName.equals(username) | !this.password.equals(password)) {
			throw new InvalidCredentialsException();
		} else {
			this.balance += amount;
			System.out.println(
					"Amount deposited :  " + amount + ". The updated balance in your account is : " + this.balance);
		}
	}

	public void withdraw(String username, String password, double amount) {

		if (!this.userName.equals(username) | !this.password.equals(password)) {
			throw new InvalidCredentialsException();
		} else {
			if (amount > this.balance) {
				throw new InsufficientFundException(
						"Insufficient funds in your account. Hey Indian please try with a lesser denomination!");
			} else {

				this.balance -= amount;
				System.out.println(
						"Amount Withdrew :  " + amount + ". The updated balance in your account is : " + this.balance);
			}
		}
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

}
