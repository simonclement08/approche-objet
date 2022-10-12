package fr.diginamic.essais;

import fr.diginamic.salaire.Salarie;
import fr.diginamic.salaire.Pigiste;

public class TestIntervenant {

	public static void main(String[] args) {
		Salarie salarie = new Salarie("DUMOULIN", "Jacques", 2100.57);
		Pigiste pigiste = new Pigiste("HUART", "Perrine", 3, 90);
		System.out.println("Salaire salarié : " + salarie.getSalaire() + "€");
		System.out.println("Salaire pigiste : " + pigiste.getSalaire() + "€");
		
		salarie.afficherDonnees();
		pigiste.afficherDonnees();
	}

}
