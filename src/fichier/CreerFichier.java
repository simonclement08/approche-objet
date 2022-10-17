package fichier;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {

	public static void main(String[] args) throws IOException {
		String path = "C:/Users/Th3-E/OneDrive/Bureau/Document/java/approche-objet/src/fichier/";
		Path fichier = Paths.get(path + "fichier.txt");
		File file = new File(path + "fichier.txt");
		file.createNewFile();
		
		Path recensement = Paths.get(path + "recensement.csv");
		List<String> lines = Files.readAllLines(recensement, StandardCharsets.UTF_8);
		List<String> newLines = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			newLines.add(lines.get(i));
		}
		Files.write(fichier, newLines);
		
		List<String> linesNewFichier = Files.readAllLines(fichier, StandardCharsets.UTF_8);
		for (String line : linesNewFichier) {
			System.out.println(line);
		}
		
	}

}
