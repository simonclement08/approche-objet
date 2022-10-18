package fr.diginamic.recensement.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import fr.diginamic.recensement.components.Recensement;
import fr.diginamic.recensement.entities.Departement;
import fr.diginamic.recensement.entities.Ville;

public class VillePlusPeubleeDepartement extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		Departement departement = null;
		while (departement == null) {
			System.out.println("Choisissez un département :");
			String userChoice = scanner.nextLine();
			departement = Recensement.departements.get(userChoice);
		}
		
		ArrayList<Ville> villes = departement.getVilles();
		Collections.sort(villes, new ComparatorPopulationDesc());

		for (int i = 1; i < 11 && i < villes.size() + 1; i++) {
			System.out.println(i + " : " + villes.get(i-1).getNom());
		}
	}

}
