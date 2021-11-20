package com.technoelevate.encapsulation;

public class Main {

	public static void main(String[] args) {

//		Player player = new Player();
//		player.name= "Jeigyanshu";
//		player.health =20;
//		player.weapon = "sword";
//		
//		int damage = 10;
//		player.looseHealth(damage);
//		System.out.println("Remaining health : "+player.healthRemaining());
//		
//		damage =11;
//		player.looseHealth(damage);
//		System.out.println("Remaining health : "+player.healthRemaining());

		EnhancedPlayer player = new EnhancedPlayer("Anshu", 200 , "Sword");
		System.out.println("Initia health :" + player.getHealth());
	
	}

}
