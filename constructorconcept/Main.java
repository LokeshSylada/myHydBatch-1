package com.technoelevate.constructorconcept;

public class Main {

	public static void main(String[] args) {

		Account anshu = new Account("Jeigyanshu", "Jeigyanshu.sarangi@gmail.com", "1234567890");
		System.out.println(anshu.getBalance());
		anshu.deposite(1000);
		anshu.wihtraw(1500);
	}

}
