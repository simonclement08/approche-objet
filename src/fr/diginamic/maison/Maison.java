package fr.diginamic.maison;

import java.util.Arrays;

public class Maison {
	private Piece[] pieces;

	public Maison(Piece[] pieces) {
		this.pieces = pieces;
	}
	
	public void ajouterPiece(Piece piece) {
		if(piece != null) {
			if(piece.getEtage() < 0 || piece.getSuperficie() < 0) {
				System.out.println("La pièce n'a pas été ajoutée, veuillez renseigner des valeurs valides");
			} else {
				pieces = Arrays.copyOf(pieces, pieces.length+1);
				pieces[pieces.length-1] = piece;
			}
		}
	}
	
	public double getSuperficieTotale() {
		double superficie = 0;
		for (Piece piece : pieces) {
			superficie += piece.getSuperficie();
		}
		return superficie;
	}
	
	public double getSuperficieParEtage(int etage) {
		double superficie = 0;
		for (Piece piece : pieces) {
			if(piece.getEtage() == etage) {
				superficie += piece.getSuperficie();
			}
		}
		return superficie;
	}
	
	public double getSuperficieParTypePiece(String type) {
		double superficie = 0;
		for (Piece piece : pieces) {
			if(piece.getType().equals(type)) {
				superficie += piece.getSuperficie();
			}
		}
		return superficie;
	}
	
	public int getNbPiecesParTypePiece(String type) {
		int compteur = 0;
		for (Piece piece : pieces) {
			if(piece.getType().equals(type)) {
				compteur++;
			}
		}
		return compteur;
	}

	public Piece[] getPieces() {
		return pieces;
	}

	public void setPieces(Piece[] pieces) {
		this.pieces = pieces;
	}
}
