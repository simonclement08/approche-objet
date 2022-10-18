package fr.diginamic.recensement.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import fr.diginamic.recensement.components.Recensement;
import fr.diginamic.recensement.entities.Region;

public class RegionPlusPeublee extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		ArrayList<Region> regions = new ArrayList<>();
		for (Region region : Recensement.regions.values()) {
			regions.add(region);
		}
		
		Collections.sort(regions, new ComparatorPopulationDesc());
		
		for (int i = 1; i < 11 && i < regions.size() + 1; i++) {
			System.out.println(i + " : " + regions.get(i-1).getNom());
		}
	}

}
