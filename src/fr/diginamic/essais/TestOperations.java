package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {
		System.out.println(Operations.calcul(4, 5, '+'));
		System.out.println(Operations.calcul(4, 5, '-'));
		System.out.println(Operations.calcul(4, 5, '/'));
		System.out.println(Operations.calcul(4, 5, '*'));
	}
}
