package fr.diginamic.recensement.entities;

import java.util.ArrayList;

public class Region extends Territoire{
	private String nom;
	private ArrayList<Departement> departements;
	
	public Region(String code, String nom) {
		super(code);
		this.nom = nom;
		this.departements = new ArrayList<>();
	}
	
	@Override
	public int getPopulation() {
		int population = 0;
		for (Departement departement : departements) {
			population += departement.getPopulation();
		}
		return population;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ArrayList<Departement> getDepartements() {
		return departements;
	}

	public void setDepartements(ArrayList<Departement> departements) {
		this.departements = departements;
	}
}
