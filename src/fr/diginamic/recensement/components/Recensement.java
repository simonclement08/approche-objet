package fr.diginamic.recensement.components;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import fr.diginamic.recensement.entities.Departement;
import fr.diginamic.recensement.entities.Region;
import fr.diginamic.recensement.entities.Ville;

public class Recensement {
	public static HashMap<String, Ville> villes;
	public static HashMap<String, Departement> departements;
	public static HashMap<String, Region> regions;
	
	private Recensement() {
		super();
		Recensement.villes = new HashMap<>();
		Recensement.departements = new HashMap<>();
		Recensement.regions = new HashMap<>();
	}

	public static Recensement getInstance() throws IOException {
		Recensement recensement = new Recensement();
		
		String path = "C:/Users/Th3-E/OneDrive/Bureau/Document/java/approche-objet/src/fr/diginamic/recensement/";
		Path recensementPath = Paths.get(path + "recensement.csv");
		
		List<String> lines = Files.readAllLines(recensementPath, StandardCharsets.UTF_8);
		for (int i = 1; i < lines.size(); i++) {
			String[] tokens = lines.get(i).split(";");
			String codeRegion = tokens[0];
			String nomRegion = tokens[1];
			String codeDepartement = tokens[2];
			String codeCommune = tokens[5];
			String nomCommune = tokens[6];
			int population = Integer.parseInt(tokens[9].replace(" ", ""));
			
			Region region = regions.get(codeRegion);
			if(region == null) {
				region = new Region(codeRegion, nomRegion);
				regions.put(codeRegion, region);
			}
			
			Departement departement = departements.get(codeDepartement);
			if(departement == null) {
				departement = new Departement(codeDepartement, region);
				departements.put(codeDepartement, departement);
				ArrayList<Departement> departementsRegion = region.getDepartements();
				departementsRegion.add(departement);
				region.setDepartements(departementsRegion);
			}
			
			Ville ville = new Ville(region, departement, codeCommune, nomCommune, population);
			villes.put(nomCommune, ville);
			ArrayList<Ville> villesDepartements = departement.getVilles();
			villesDepartements.add(ville);
			departement.setVilles(villesDepartements);
		}
		
		return recensement;
	}

}
