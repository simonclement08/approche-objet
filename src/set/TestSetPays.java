package set;

import java.util.HashSet;
import java.util.Iterator;

public class TestSetPays {

	public static void main(String[] args) {
		HashSet<Pays> pays = new HashSet<>();
		pays.add(new Pays("USA", 334805000, 59495));
		pays.add(new Pays("France", 65585000, 43551));
		pays.add(new Pays("Allemagne", 83884000, 50206));
		pays.add(new Pays("UK", 68498000, 43620));
		pays.add(new Pays("Italie", 60263000, 37970));
		pays.add(new Pays("Japon", 125585000, 42659));
		pays.add(new Pays("Chine", 1448471000, 16624));
		pays.add(new Pays("Russie", 145806000, 28712));
		pays.add(new Pays("Inde", 1406632000, 5174));
		
		Pays paysPIBHabitants = null;
		for (Pays country : pays) {
			paysPIBHabitants = paysPIBHabitants == null || country.getPib() > paysPIBHabitants.getPib() ? country : paysPIBHabitants;
		}
		System.out.println("Pays avec le PIB/habitant le plus important : " + paysPIBHabitants.getNom());
		
		Pays paysPIB = null;
		for (Pays country : pays) {
			paysPIB = paysPIB == null || country.getPib()*country.getNbHabitants() > paysPIB.getPib()*paysPIB.getNbHabitants() ? country : paysPIB;
		}
		System.out.println("Pays avec le PIB le plus important : " + paysPIB.getNom());
		
		Pays paysPIBMin = null;
		for (Pays country : pays) {
			paysPIBMin = paysPIBMin == null || country.getPib()*country.getNbHabitants() < paysPIBMin.getPib()*paysPIBMin.getNbHabitants() ? country : paysPIBMin;
		}
		paysPIBMin.setNom(paysPIBMin.getNom().toUpperCase());
		System.out.println("Pays avec le PIB le plus faible : " + paysPIBMin.getNom() + "\n");
		
		pays.remove(paysPIBMin);
		
		for (Pays country : pays) {
			System.out.println(country);
		}

	}

}
