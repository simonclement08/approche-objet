package fr.diginamic.recensement.services;

import java.util.Comparator;

import fr.diginamic.recensement.entities.Territoire;

public class ComparatorPopulationDesc implements Comparator<Territoire>{
	
	@Override
	public int compare(Territoire territoire1, Territoire territoire2) {
		return territoire2.getPopulation() - territoire1.getPopulation();
	}

}
