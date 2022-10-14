package listes;

public class Ville {
	private String nom;
	private int habitants;
	
	public Ville(String nom, int habitants) {
		super();
		this.nom = nom;
		this.habitants = habitants;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
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
}
