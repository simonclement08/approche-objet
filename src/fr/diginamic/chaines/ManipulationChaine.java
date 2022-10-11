package fr.diginamic.chaines;

import fr.diginamic.entites.Salarie;

public class ManipulationChaine {

	public static void main(String[] args) {
		String chaine= "Durand;Marcel;2523.5";
		
		char premierCaractere= chaine.charAt(0);
		System.out.println("Premier caractère : " + premierCaractere);
		System.out.println("Longueur de la chaine de caractères : " + chaine.length());
		System.out.println("Index du premier «;» : " + chaine.indexOf(';'));
		String nomFamille = chaine.substring(0, chaine.indexOf(';'));
		System.out.println("Nom de famille : " + nomFamille);
		System.out.println(nomFamille.toUpperCase());
		System.out.println(nomFamille.toLowerCase());
		String[] chaines = chaine.split(";");
		for (int i = 0; i < chaines.length; i++) {
			System.out.println(chaines[i]);
		}
		double salaire = Double.parseDouble(chaines[2].replace(" ", ""));
		Salarie salarie = new Salarie(chaines[0], chaines[1], salaire);
	}

}
