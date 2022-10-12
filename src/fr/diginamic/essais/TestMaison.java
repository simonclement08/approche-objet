package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.Piece;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.WC;

public class TestMaison {

	public static void main(String[] args) {
		Piece[] pieces = {	new Chambre(15, 1),
							new Cuisine(20, 0),
							new Salon(30, 0),
							new SalleDeBain(10, 0),
							new WC(6, 0)};
		
		Maison maison = new Maison(pieces);
		maison.ajouterPiece(new Chambre(20, 1));
		System.out.println("Superficie totale : " + maison.getSuperficieTotale());
		System.out.println("Superficie étage 0 : " + maison.getSuperficieParEtage(0));
		System.out.println("Superficie étage 1 : " + maison.getSuperficieParEtage(1));
		System.out.println("Superficie étage 2 : " + maison.getSuperficieParEtage(2));
		
		maison.ajouterPiece(null);
		System.out.println("Superficie totale : " + maison.getSuperficieTotale());
		System.out.println("Superficie étage 0 : " + maison.getSuperficieParEtage(0));
		System.out.println("Superficie étage 1 : " + maison.getSuperficieParEtage(1));
		System.out.println("Superficie étage 2 : " + maison.getSuperficieParEtage(2));
		
		maison.ajouterPiece(new Salon(15, 1));
		System.out.println("Superficie totale : " + maison.getSuperficieTotale());
		System.out.println("Superficie étage 0 : " + maison.getSuperficieParEtage(0));
		System.out.println("Superficie étage 1 : " + maison.getSuperficieParEtage(1));
		System.out.println("Superficie étage 2 : " + maison.getSuperficieParEtage(2));
		
		maison.ajouterPiece(new WC(15, -1));
		maison.ajouterPiece(new SalleDeBain(-15, 1));

		System.out.println("Nombre de Cuisine : " + maison.getNbPiecesParTypePiece("Cuisine"));
		System.out.println("Nombre de Salon : " + maison.getNbPiecesParTypePiece("Salon"));
		System.out.println("Nombre de WC : " + maison.getNbPiecesParTypePiece("WC"));
		System.out.println("Nombre de Salle de Bain : " + maison.getNbPiecesParTypePiece("Salle de Bain"));
		System.out.println("Nombre de Chambre : " + maison.getNbPiecesParTypePiece("Chambre"));
		System.out.println("Superficie des Chambres : " + maison.getSuperficieParTypePiece("Chambre"));
	}

}
