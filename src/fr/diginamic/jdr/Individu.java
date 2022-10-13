package fr.diginamic.jdr;

import java.util.Random;

public abstract class Individu {
	protected int force;
	protected int pointDeVie;
	
	public int getAttaque() {
		Random random = new Random();
		return force + random.nextInt(1, 11);
	}
	
	public boolean isAlive() {
		if (pointDeVie <= 0) {
			return false;
		} else {
			return true;
		}
	}
	
	public void perdreTour(int $degats) {
		pointDeVie -= $degats;
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public int getPointDeVie() {
		return pointDeVie;
	}

	public void setPointDeVie(int pointDeVie) {
		this.pointDeVie = pointDeVie;
	}
}
