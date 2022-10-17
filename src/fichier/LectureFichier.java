package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier  {

	public static void main(String[] args) throws IOException {
		ArrayList<Ville> villes = new ArrayList<>();
		String path = "C:/Users/Th3-E/OneDrive/Bureau/Document/java/approche-objet/src/fichier/";
		Path recensement = Paths.get(path + "recensement.csv");
		
		List<String> lines = Files.readAllLines(recensement, StandardCharsets.UTF_8);
		for (int i = 1; i < lines.size(); i++) {
			String[] tokens = lines.get(i).split(";");
			String nomRegion = tokens[1];
			String departement = tokens[2];
			String nom = tokens[6];
			int population = Integer.parseInt(tokens[9].replace(" ", ""));
			villes.add(new Ville(nom, departement, nomRegion, population));
		}
		
		
		Path fichier = Paths.get(path + "recensementGen.csv");
		List<String> linesFile = new ArrayList<>();
		linesFile.add("Nom;Code département;Nom de la région;Population totale;");
		
		for (Ville ville : villes) {
			if(ville.getPopulation() > 25000) {
				linesFile.add(ville.getNom() + ";" + ville.getCodeDepartement() + ";" + ville.getNomRegion() + ";" + ville.getPopulation());
			}
		}

		Files.write(fichier, linesFile);
	}

}
