package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {
		Compte compte = new Compte("FR7847589", 1975.2);
		CompteTaux compteTaux = new CompteTaux("FRT82416", 257.9, 2.0);
		
		Compte[] comptes = {compte, compteTaux};
		
		for (int i = 0; i < comptes.length; i++) {
			System.out.println(comptes[i]);
		}
	}

}
