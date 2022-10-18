package fr.diginamic.recensement.services;

import java.util.Scanner;

import fr.diginamic.recensement.components.Recensement;
import fr.diginamic.recensement.entities.Region;

public class RecherchePopulationRegion extends MenuService {

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
		
		System.out.println(region.getNom() + " a une population de " + region.getPopulation() + " habitants");
	}

}
