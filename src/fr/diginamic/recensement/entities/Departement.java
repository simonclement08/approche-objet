package fr.diginamic.recensement.entities;

import java.util.ArrayList;

public class Departement extends Territoire {
	private Region region;
	private ArrayList<Ville> villes;
	
	public Departement(String code, Region region) {
		super(code);
		this.region = region;
		this.villes = new ArrayList<>();
	}

	@Override
	public int getPopulation() {
		int population = 0;
		for (Ville ville : villes) {
			population += ville.getPopulation();
		}
		return population;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public ArrayList<Ville> getVilles() {
		return villes;
	}

	public void setVilles(ArrayList<Ville> villes) {
		this.villes = villes;
	}
}
