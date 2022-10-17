package listes;

public class Ville implements Comparable<Ville>{
	private String nom;
	private int habitants;
	
	public Ville(String nom, int habitants) {
		super();
		this.nom = nom;
		this.habitants = habitants;
	}
	
	@Override
	public String toString() {
		return nom + " " + habitants;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getHabitants() {
		return habitants;
	}

	public void setHabitants(int habitants) {
		this.habitants = habitants;
	}

	@Override
	public int compareTo(Ville ville) {
		return this.habitants - ville.getHabitants();
	}
}
