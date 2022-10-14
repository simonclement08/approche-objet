package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TestListeString {

	public static void main(String[] args) {
		ArrayList<String> villes = new ArrayList<String>(Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"));
		
		String maxLettres = "";
		for (String ville : villes) {
			maxLettres = ville.length() > maxLettres.length() ? ville : maxLettres;
		}
		System.out.println(maxLettres);
		
		for (int i = 0; i < villes.size(); i++) {
			villes.set(i, villes.get(i).toUpperCase());
		}
		System.out.println(villes);
		
		Iterator<String> iter= villes.iterator();
		while(iter.hasNext()) {
			String ville= iter.next();
			if(ville.charAt(0) == 'N') {
				iter.remove();
			}
		}

		System.out.println(villes);
		
		ArrayList<Ville> villes2 = new ArrayList<>();
		villes2.add(new Ville("Nice", 343000));
		villes2.add(new Ville("Carcasonne", 47800));
		villes2.add(new Ville("Narbonne", 53400));
		villes2.add(new Ville("Lyon", 484000));
		villes2.add(new Ville("Foix", 9700));
		villes2.add(new Ville("Pau", 77200));
		villes2.add(new Ville("Marseille", 850700));
		villes2.add(new Ville("Tarbes", 40600));
		
		Ville villeMaxPopulation = villes2.get(0);
		for (Ville ville : villes2) {
			villeMaxPopulation = villeMaxPopulation.getHabitants() > ville.getHabitants() ? villeMaxPopulation : ville;
		}
		System.out.println("Ville la plus peuplée : " + villeMaxPopulation.getNom());
		
		Ville villeMinPopulation = villes2.get(0);
		for (Ville ville : villes2) {
			villeMinPopulation = villeMinPopulation.getHabitants() < ville.getHabitants() ? villeMinPopulation : ville;
		}
		
		villes2.remove(villeMinPopulation);
		
		for (int i = 0; i < villes2.size(); i++) {
			Ville villeTest = villes2.get(i);
			if(villeTest.getHabitants() > 100000) {
				villeTest.setNom(villeTest.getNom().toUpperCase());
			}
		}
		
		System.out.println(villes2);
	}

}
