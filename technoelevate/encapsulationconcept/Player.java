package com.technoelevate.encapsulationconcept;

public class Player {

	public String fullName;
	public int myHealth;
	public String myWeapon;
	
	public void remainingHealth(int damage) {
		this.myHealth -= damage;
		if(myHealth<=0) {
			System.out.println("Player knocked out");
		}
		System.out.println("Damage to the player : "+damage+". The remaining health is : "+this.myHealth);
		
	}
}
