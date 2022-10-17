package set;

public class Pays {
	private String nom;
	private int nbHabitants;
	private double pib;
	
	public Pays(String nom, int nbHabitants, double pib) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.pib = pib;
	}
	
	

	@Override
	public String toString() {
		return nom + ", nbHabitants : " + nbHabitants + ", PIB total : " + pib * nbHabitants;
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
