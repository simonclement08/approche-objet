package fr.diginamic.recensement.entities;

public class Ville extends Territoire {
	private Departement departement;
	private String nom;
	private int population;
	
	public Ville(Region region, Departement departement, String code, String nom, int population) {
		super(code);
		this.departement = departement;
		this.nom = nom;
		this.population = population;
	}
	
	public Departement getDepartement() {
		return departement;
	}

	public void setDepartement(Departement departement) {
		this.departement = departement;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
}
