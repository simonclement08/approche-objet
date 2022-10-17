package set;

import java.util.Arrays;
import java.util.HashSet;

public class TestSetString {

	public static void main(String[] args) {
		HashSet<String> villes = new HashSet<>();
		villes.addAll(Arrays.asList("USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde"));

		String maxLettres = "";
		for (String ville : villes) {
			maxLettres = ville.length() > maxLettres.length() ? ville : maxLettres;
		}
		villes.remove(maxLettres);
		System.out.println(villes);
	}

}
