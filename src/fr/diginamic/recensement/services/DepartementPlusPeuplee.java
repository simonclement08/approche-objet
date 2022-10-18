package fr.diginamic.recensement.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import fr.diginamic.recensement.components.Recensement;
import fr.diginamic.recensement.entities.Departement;

public class DepartementPlusPeuplee extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		ArrayList<Departement> departements = new ArrayList<>();
		for (Departement departement : Recensement.departements.values()) {
			departements.add(departement);
		}
		
		Collections.sort(departements, new ComparatorPopulationDesc());
		
		for (int i = 1; i < 11 && i < departements.size(); i++) {
			System.out.println(i + " : " + departements.get(i-1).getCode());
		}
	}

}
