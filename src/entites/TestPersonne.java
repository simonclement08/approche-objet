package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		AdressePostale adresse1 = new AdressePostale(1,"Rue du Moulin",51100,"Reims");
		Personne personne1 = new Personne("SIMON", "Clément", adresse1);
		
		AdressePostale adresse2 = new AdressePostale(54,"Route Nationale",34000,"Perpignan");
		Personne personne2 = new Personne("CAMUS", "Fabien", adresse2);
	}

}
