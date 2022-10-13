package fr.diginamic.jdr;

import java.util.Random;

public class Loup extends Creature {
	
	public Loup() {
		Random random = new Random();
		this.force = random.nextInt(3, 9);
		this.pointDeVie = random.nextInt(5, 11);
		this.setReward(1);
		System.out.println("Un loup apparaît devant vous.");
	}
}
