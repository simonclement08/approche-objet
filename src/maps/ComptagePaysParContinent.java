package maps;

import java.util.ArrayList;
import java.util.HashMap;

public class ComptagePaysParContinent {

	public static void main(String[] args) {
		ArrayList<Pays> countries = new ArrayList<>();
		countries.add(new Pays("France", 65000000, "Europe"));
		countries.add(new Pays("Allemagne", 80000000, "Europe"));
		countries.add(new Pays("Belgique", 10000000, "Europe"));
		countries.add(new Pays("Russie", 150000000, "Asie"));
		countries.add(new Pays("Chine", 1400000000, "Asie"));
		countries.add(new Pays("Indonésie", 220000000, "Océanie"));
		countries.add(new Pays("Australie", 20000000, "Océanie"));
		
		HashMap<String, Integer> paysContinent = new HashMap<>();
		
		for (Pays country : countries) {
			int compteur = paysContinent.get(country.getContinent()) == null ? 0 : paysContinent.get(country.getContinent());
			paysContinent.put(country.getContinent(), compteur + 1);
		}
		
		System.out.println(paysContinent);

	}

}
