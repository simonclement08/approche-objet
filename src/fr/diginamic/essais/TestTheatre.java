package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		Theatre theatre = new Theatre("Opéra Garnier", 1500, 1480, 59200.00);
		theatre.incrire(6, 40);
		theatre.incrire(6, 40);
		theatre.incrire(6, 40);
		theatre.incrire(6, 40);
		System.out.println(theatre.getTotalClient() + " clients sont inscrits");
		System.out.println(theatre.getRecette() + "€");
	}

}
