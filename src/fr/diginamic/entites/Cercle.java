package fr.diginamic.entites;

public class Cercle {
	private double rayon;

	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}
	
	public double getPerimetre() {
		return 2 * Math.PI * this.getRayon();
	}
	
	public double getSurface() {
		return Math.PI * (this.getRayon() * this.getRayon());
	}

	public double getRayon() {
		return this.rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
}
