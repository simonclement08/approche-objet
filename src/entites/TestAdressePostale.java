package entites;

public class TestAdressePostale {

	public static void main(String[] args) {
		AdressePostale adresse1 = new AdressePostale();
		adresse1.numeroRue = 1;
		adresse1.libelleRue = "Rue du Moulin";
		adresse1.codePostal = 51100;
		adresse1.ville = "Reims";
		
		AdressePostale adresse2 = new AdressePostale();
		adresse2.numeroRue = 54;
		adresse2.libelleRue = "Route Nationale";
		adresse2.codePostal = 34200;
		adresse2.ville = "Perpignan";
	}

}
