package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		Personne personne1 = new Personne();
		personne1.nom = "SIMON";
		personne1.prenom = "Clément";
		personne1.adressePostale = new AdressePostale();
		personne1.adressePostale.numeroRue = 1;
		personne1.adressePostale.libelleRue = "Rue du Moulin";
		personne1.adressePostale.codePostal = 51100;
		personne1.adressePostale.ville = "Reims";
		
		Personne personne2 = new Personne();
		personne2.nom = "CAMUS";
		personne2.prenom = "Fabien";
		personne2.adressePostale = new AdressePostale();
		personne2.adressePostale.numeroRue = 54;
		personne2.adressePostale.libelleRue = "Route Nationale";
		personne2.adressePostale.codePostal = 34200;
		personne2.adressePostale.ville = "Perpignan";
	}

}
