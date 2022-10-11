package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		Cercle cercle1 = CercleFactory.createCercle(2);
		Cercle cercle2 = CercleFactory.createCercle(5.7);
		
		System.out.println("Périmétre cercle 1 : " + cercle1.getPerimetre());
		System.out.println("Surface cercel 1 : " + cercle1.getSurface());
		System.out.println("Périmétre cercle 2 : " + cercle2.getPerimetre());
		System.out.println("Surface cercel 2 : " + cercle2.getSurface());
	}

}
