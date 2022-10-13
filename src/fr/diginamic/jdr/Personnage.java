package fr.diginamic.jdr;

import java.util.Random;

public class Personnage extends Individu {
	private int score;

	public Personnage() {
		Random random = new Random();
		this.force = random.nextInt(12, 19);
		this.pointDeVie = random.nextInt(20, 51);
		this.score = 0;
	}
	
	public void combatPerdue() {
		System.out.println("Vous avez perdu le combat ! Votre score est de " + score + ".");
	}
	
	public void combatGagne(Creature creature) {
		score += creature.getReward();
		System.out.println("Bravo ! Vous avez gagné, votre nouveau score est de " + score + ".");
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
