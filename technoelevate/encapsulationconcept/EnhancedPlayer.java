package com.technoelevate.encapsulationconcept;

public class EnhancedPlayer {
	private String myFullName;
	private int myFullHealth=100;
	private String myUlitimateWeapon;
	
	
	public EnhancedPlayer(String fullName, int myHealth, String myWeapon) {
		super();
		this.myFullName = fullName;
		if(myFullHealth<=100 ) {
			this.myFullHealth = myHealth;
		}
		
		this.myUlitimateWeapon = myWeapon;
	}
	
	public void remainingHealth(int damage) {
		this.myFullHealth -= damage;
		if(myFullHealth<=0) {
			System.out.println("Player knocked out");
		}
		System.out.println("Damage to the player : "+damage+". The remaining health is : "+this.myFullHealth);
		
	}

	public int getMyHealth() {
		return myFullHealth;
	}
}
