package set;

import annotations.ToString;
import utils.StringUtils;

public class Pays {

	@ToString(uppercase = false, separator = " -> ")
	private String nom;
	private int nbHabitants;
	@ToString(separator = " $")
	private double pib;

	public Pays(String nom, int nbHabitants, double pib) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.pib = pib;
	}

	@Override
	public String toString() {
		return StringUtils.execToString(this);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbHabitants() {
		return nbHabitants;
	}

	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	public double getPib() {
		return pib;
	}

	public void setPib(double pib) {
		this.pib = pib;
	}
}
