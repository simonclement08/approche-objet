package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LectureFichier  {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:/Users/Th3-E/OneDrive/Bureau/Document/java/approche-objet/src/fichier/recensement.csv");
		
		boolean exist = Files.exists(path);
		System.out.println(exist);
		
		List<String> lines= Files.readAllLines(path, StandardCharsets.UTF_8);
		for (String line : lines) {
			System.out.println(line);
		}
	}

}
