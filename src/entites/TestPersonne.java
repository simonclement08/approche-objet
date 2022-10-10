package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		Personne personne1 = new Personne("simon", "Clément");
		AdressePostale adresse1 = new AdressePostale(1,"Rue du Moulin",51100,"Reims");
		personne1.setAdressePostale(adresse1);
		
		Personne personne2 = new Personne("CAMUS", "Fabien");
		AdressePostale adresse2 = new AdressePostale(54,"Route Nationale",34000,"Perpignan");
		personne2.setAdressePostale(adresse2);
	}

}
