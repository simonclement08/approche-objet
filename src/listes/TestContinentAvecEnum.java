package listes;

import java.util.ArrayList;

public class TestContinentAvecEnum {

	public static void main(String[] args) {
		ArrayList<Ville> villes = new ArrayList<>();
		villes.add(new Ville("New York", 8380000, Continent.AMERIQUE));
		villes.add(new Ville("Paris", 2161000, Continent.EUROPE));
		villes.add(new Ville("Pékin", 21540000, Continent.ASIE));
		villes.add(new Ville("Moscou", 11920000, Continent.ASIE));
		villes.add(new Ville("Berlin", 3645000, Continent.EUROPE));
		villes.add(new Ville("Sydney", 5312000, Continent.OCEANIE));
		villes.add(new Ville("Sao Paulo", 12330000, Continent.AMERIQUE));
		villes.add(new Ville("Dakar", 1146000, Continent.AFRIQUE));

		for (Ville ville : villes) {
			System.out.println(ville);
		}
	}

}
