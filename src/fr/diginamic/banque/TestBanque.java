package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {

	public static void main(String[] args) {
		Compte compte = new Compte("FR7847589", 1975.2);
		System.out.println(compte);
	}

}
