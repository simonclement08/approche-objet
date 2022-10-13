package fr.diginamic.jdr;

import java.util.Random;

public class Gobelin extends Creature {
	
	public Gobelin() {
		Random random = new Random();
		this.force = random.nextInt(5, 11);
		this.pointDeVie = random.nextInt(10, 16);
		this.setReward(2);
		System.out.println("Un gobelin surgit du buisson !");
	}
}
