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
		Path path = Paths.get("C:/Users/Th3-E/OneDrive/Bureau/Document/java/approche-objet/src/fichier/recensement.csv");
		
		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
		for (int i = 1; i < lines.size(); i++) {
			String[] tokens = lines.get(i).split(";");
			String nomRegion = tokens[1];
			String departement = tokens[2];
			String nom = tokens[6];
			int population = Integer.parseInt(tokens[9].replace(" ", ""));
			villes.add(new Ville(nom, departement, nomRegion, population));
		}
	}

}
