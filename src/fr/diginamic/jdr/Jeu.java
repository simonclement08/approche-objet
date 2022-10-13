package fr.diginamic.jdr;

import java.util.Random;
import java.util.Scanner;

public class Jeu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		Personnage personnage = null;
		do {
			System.out.println("Veuillez choisir une option : \n1) Créer un personnage\n2) Combattre une créature\n3) Afficher score\n4)Sortir");
			System.out.println("Selection: ");
			choice = scanner.nextInt();
			
			while(choice != 1 && choice != 2 && choice != 3 && choice != 4) {
				System.out.print ( "Veuillez choisir entre le choix 1 et 2 et 3 : " );
				choice = scanner.nextInt();
			}
			
			if (choice == 1) {
				personnage = new Personnage();
			} else if (personnage == null && (choice == 2 || choice == 3)) {
				System.out.println("Vous devez d'abord créer un personnage !");
			} else {
				if (choice == 2) {
					if(personnage.isAlive()) {
						Random random = new Random();
						Creature ennemi = null;
						switch (random.nextInt(3)) {
						case 0:
							ennemi = new Loup();
							break;
						case 1:
							ennemi = new Gobelin();
							break;
						case 2:
							ennemi = new Troll();
							break;
						}
						while (personnage.isAlive() && ennemi.isAlive()) {
							int attaque = personnage.getAttaque();
							int attaqueEnnemi = ennemi.getAttaque();
							if(attaque < attaqueEnnemi) {
								personnage.perdreTour(attaqueEnnemi - attaque);
							} else {
								ennemi.perdreTour(attaque - attaqueEnnemi);
							}
						}
						if(personnage.isAlive()) {
							personnage.combatGagne(ennemi);
						} else {
							personnage.combatPerdue();
						}
					} else {
						System.out.println("Votre personnage est décédé. Il a obtenu le score de " + personnage.getScore() + " points. Veuillez créer un nouveau personnage");
					}
				} else if (choice == 3) {
					System.out.println("Votre score est de " + personnage.getScore());
				}
			}
		} while(choice != 4);
		scanner.close();
	}
}
