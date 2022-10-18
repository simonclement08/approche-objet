package fr.diginamic.recensement.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import fr.diginamic.recensement.components.Recensement;
import fr.diginamic.recensement.entities.Departement;
import fr.diginamic.recensement.entities.Region;
import fr.diginamic.recensement.entities.Ville;

public class VillePlusPeublee extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		ArrayList<Ville> villes = new ArrayList<>();
		for (Region region : Recensement.regions.values()) {
			for (Departement departement : region.getDepartements()) {
				villes.addAll(departement.getVilles());
			}
		}
		
		Collections.sort(villes, new ComparatorPopulationDesc());
		
		for (int i = 1; i < 11 && i < villes.size() + 1; i++) {
			System.out.println(i + " : " + villes.get(i-1).getNom());
		}

	}

}
