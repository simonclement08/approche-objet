package fr.diginamic.recensement.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import fr.diginamic.recensement.components.Recensement;
import fr.diginamic.recensement.entities.Departement;
import fr.diginamic.recensement.entities.Region;
import fr.diginamic.recensement.entities.Ville;

public class VillePlusPeubleeRegion extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		Region region = null;
		while (region == null) {
			System.out.println("Choisissez une region :");
			for (Region regionPrint : Recensement.regions.values()) {
				System.out.println(regionPrint.getCode() + " : " + regionPrint.getNom());
			}
			String userChoice = scanner.nextLine();
			region = Recensement.regions.get(userChoice);
		}
		
		ArrayList<Ville> villes = new ArrayList<>();
		for (Departement departement : region.getDepartements()) {
			villes.addAll(departement.getVilles());
		}
		Collections.sort(villes, new ComparatorPopulationDesc());
		
		for (int i = 1; i < 11 && i < villes.size() + 1; i++) {
			System.out.println(i + " : " + villes.get(i-1).getNom());
		}
	}

}
