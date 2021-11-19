package com.technoelevate.constructorconcept;

public class Account {
	private int accountNumber;
	private double balance;
	private String customerName;
	private String customerEmailAddress;
	private String customerPhoneNumber;

	public Account() {
		this(000, 1000.00, "Default Name", "default@email.com", "default phone number");
		System.out.println("user defined default cusnstructor called");
	}

	public Account(int accoutNumber, double balance, String customerName, String customerEmailAddress,
			String customerPhoneNumber) {
		System.out.println("Complete constructor called");
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.customerEmailAddress = customerEmailAddress;
		this.customerPhoneNumber = customerPhoneNumber;
	}

	public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
		this();
		System.out.println("Partial constructor called");
	}

	public void deposite(double amount) {
		this.balance += amount;
		System.out.println("Amount deposited : " + amount + ". Updated balance in your account : " + this.balance);
	}

	public void wihtraw(double amount) {
		if (amount > this.balance) {
			System.out.println("You have insufficient funds in your account. Please try with a smaller denomination");
		} else {
			this.balance -= amount;
			System.out
					.println("Amount withdrawn : " + amount + " Updated balance in your account is : " + this.balance);
		}
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmailAddress() {
		return customerEmailAddress;
	}

	public void setCustomerEmailAddress(String customerEmailAddress) {
		this.customerEmailAddress = customerEmailAddress;
	}

	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}

	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}

}
