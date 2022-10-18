package fr.diginamic.recensement.services;

import java.util.Scanner;

import fr.diginamic.recensement.components.Recensement;
import fr.diginamic.recensement.entities.Ville;

public class RecherchePopulationVille extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		
		Ville ville = null;
		while (ville == null) {
			System.out.println("Choisissez une ville :");
			String userChoice = scanner.nextLine();
			ville = Recensement.villes.get(userChoice);
		}
		
		System.out.println(ville.getNom() + " a une population de " + ville.getPopulation() + " habitants");
	}

}
