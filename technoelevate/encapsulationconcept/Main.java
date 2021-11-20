package com.technoelevate.encapsulationconcept;

public class Main {
	public static void main(String[] args) {
//		Player player = new Player();
//		player.name ="Jeigyanshu";
//		player.health = 100;
//		player.weapon="Champa";
//		
//		player.remainingHealth(20);
//		player.health=200;
//		player.remainingHealth(30);
//		player.remainingHealth(300);
		
		
		EnhancedPlayer ep = new EnhancedPlayer("Dolando", 60, "Knife");
		System.out.println(ep.getMyHealth());
		ep.remainingHealth(50);
		System.out.println(ep.getMyHealth());
		
		
		EnhancedPlayer ep1 = new EnhancedPlayer("Illiaz", 500, "Voice");
		System.out.println(ep1.getMyHealth());

		
	}
}
