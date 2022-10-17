package maps;

import java.util.HashMap;

import listes.Ville;

public class MapVilles {

	public static void main(String[] args) {
		HashMap<String, Ville> villes = new HashMap<>();
		Ville ville1 = new Ville("Nice", 343000);
		Ville ville2 = new Ville("Carcasonne", 47800);
		Ville ville3 = new Ville("Narbonne", 53400);
		Ville ville4 = new Ville("Lyon", 484000);
		Ville ville5 = new Ville("Foix", 9700);
		Ville ville6 = new Ville("Pau", 77200);
		Ville ville7 = new Ville("Marseille", 850700);
		Ville ville8 = new Ville("Tarbes", 40600);
		
		villes.put(ville1.getNom(), ville1);
		villes.put(ville2.getNom(), ville2);
		villes.put(ville3.getNom(), ville3);
		villes.put(ville4.getNom(), ville4);
		villes.put(ville5.getNom(), ville5);
		villes.put(ville6.getNom(), ville6);
		villes.put(ville7.getNom(), ville7);
		villes.put(ville8.getNom(), ville8);
		
		String villeTest = null;
		for (String ville : villes.keySet()) {
			villeTest = villeTest == null || villes.get(villeTest).getHabitants() > villes.get(ville).getHabitants() ? ville : villeTest;
		}
		villes.remove(villeTest);
		
		for (String ville : villes.keySet()) {
			System.out.println(ville + " : " + villes.get(ville));
		}
	}

}
