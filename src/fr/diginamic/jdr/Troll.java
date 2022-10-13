package fr.diginamic.jdr;

import java.util.Random;

public class Troll extends Creature {
	
	public Troll() {
		Random random = new Random();
		this.force = random.nextInt(10, 16);
		this.pointDeVie = random.nextInt(20, 31);
		this.setReward(5);
		System.out.println("Un troll se tient devant vous.");
	}
}
