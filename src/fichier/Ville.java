package fichier;

public class Ville {
	private String nom;
	private String codeDepartement;
	private String nomRegion;
	private int population;
	
	public Ville(String nom, String codeDepartement, String nomRegion, int population) {
		super();
		this.nom = nom;
		this.codeDepartement = codeDepartement;
		this.nomRegion = nomRegion;
		this.population = population;
	}
	
	@Override
	public String toString() {
		return nom + " - Département : " + codeDepartement + ", Région : " + nomRegion + ", Population : " + population;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCodeDepartement() {
		return codeDepartement;
	}

	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
}
