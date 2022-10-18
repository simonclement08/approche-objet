package fr.diginamic.recensement.services;

import java.util.Scanner;

import fr.diginamic.recensement.components.Recensement;
import fr.diginamic.recensement.entities.Departement;

public class RecherchePopulationDepartement extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		Departement departement = null;
		while (departement == null) {
			System.out.println("Choisissez un département :");
			String userChoice = scanner.nextLine();
			departement = Recensement.departements.get(userChoice);
		}
		
		System.out.println("Le département " + departement.getCode() + " a une population de " + departement.getPopulation() + " habitants");
	}

}
