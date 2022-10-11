package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;

public class TestCercle {

	public static void main(String[] args) {
		Cercle cercle1 = new Cercle(2);
		Cercle cercle2 = new Cercle(5.7);
		
		System.out.println("Périmétre cercle 1 : " + cercle1.getPerimetre());
		System.out.println("Surface cercel 1 : " + cercle1.getSurface());
		System.out.println("Périmétre cercle 2 : " + cercle2.getPerimetre());
		System.out.println("Surface cercel 2 : " + cercle2.getSurface());
	}

}
