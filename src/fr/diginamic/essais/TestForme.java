package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Forme;
import fr.diginamic.formes.Rectangle;

public class TestForme {

	public static void main(String[] args) {
		Forme[] formes = new Forme[3];
		formes[0] = new Cercle(4);
		formes[1] = new Rectangle(4, 3);
		formes[2] = new Carre(5);
		for (Forme forme : formes) {
			AffichageForme.afficher(forme);
		}
	}

}
