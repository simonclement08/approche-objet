package fr.diginamic.recensement;

import java.io.IOException;
import java.util.Scanner;

import fr.diginamic.recensement.components.Recensement;
import fr.diginamic.recensement.services.DepartementPlusPeuplee;
import fr.diginamic.recensement.services.RecherchePopulationDepartement;
import fr.diginamic.recensement.services.RecherchePopulationRegion;
import fr.diginamic.recensement.services.RecherchePopulationVille;
import fr.diginamic.recensement.services.RegionPlusPeublee;
import fr.diginamic.recensement.services.VillePlusPeublee;
import fr.diginamic.recensement.services.VillePlusPeubleeDepartement;
import fr.diginamic.recensement.services.VillePlusPeubleeRegion;

public class Application {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("******** MENU RECENSEMENT ********");
		
		Recensement recensement = Recensement.getInstance();
		
		boolean running = true;
		
		while (running) {
			System.out.println("	-----------------	");
			System.out.println("Choisissez une option :");
			System.out.println("1 - Population d'une ville");
			System.out.println("2 - Population d'un département");
			System.out.println("3 - Population d'une région");
			System.out.println("4 - Afficher les 10 régions les plus peuplées");
			System.out.println("5 - Afficher les 10 départements les plus peuplés");
			System.out.println("6 - Afficher les 10 villes les plus peuplées d'un département");
			System.out.println("7 - Afficher les 10 villes les plus peuplées d'une région");
			System.out.println("8 - Afficher les 10 villes les plus peuplées de France");
			System.out.println("9 - Sortir");
			String userChoice = scanner.nextLine();
		
			switch (userChoice) {
			case "1":
				RecherchePopulationVille rechercheVille = new RecherchePopulationVille();
				rechercheVille.traiter(recensement, scanner);
				break;
			case "2":
				RecherchePopulationDepartement rechercheDepartement = new RecherchePopulationDepartement();
				rechercheDepartement.traiter(recensement, scanner);
				break;
			case "3":
				RecherchePopulationRegion rechercheRegion = new RecherchePopulationRegion();
				rechercheRegion.traiter(recensement, scanner);
				break;
			case "4":
				RegionPlusPeublee regionPlusPeublee = new RegionPlusPeublee();
				regionPlusPeublee.traiter(recensement, scanner);
				break;
			case "5":
				DepartementPlusPeuplee departementPlusPeuplee = new DepartementPlusPeuplee();
				departementPlusPeuplee.traiter(recensement, scanner);
				break;
			case "6":
				VillePlusPeubleeDepartement villePlusPeubleeDepartment = new VillePlusPeubleeDepartement();
				villePlusPeubleeDepartment.traiter(recensement, scanner);
				break;
			case "7":
				VillePlusPeubleeRegion villePlusPeubleeRegion = new VillePlusPeubleeRegion();
				villePlusPeubleeRegion.traiter(recensement, scanner);
				break;
			case "8":
				VillePlusPeublee villePlusPeublee = new VillePlusPeublee();
				villePlusPeublee.traiter(recensement, scanner);
				break;
			case "9":
				running = false;
				break;
			}
		}
		
		scanner.close();
	}

}
