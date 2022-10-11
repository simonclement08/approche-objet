package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		double[] notes = {12,14,16};
		double[] notes2 = {14,16};
		CalculMoyenne moyenne = new CalculMoyenne(notes);
		CalculMoyenne moyenne2 = new CalculMoyenne(notes2);
		
		System.out.println(moyenne.calcul());
		System.out.println(moyenne2.calcul());
		moyenne2.ajout(18);
		System.out.println(moyenne2.calcul());
	}

}
