package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {
	private double[] notes;
	
	public CalculMoyenne(double[] notes) {
		super();
		this.notes = notes;
	}

	public void ajout(double note) {
		double[] temp = Arrays.copyOf(this.getNotes(), this.getNotes().length+1);
		temp[temp.length-1] = note;
		this.setNotes(temp);
	}
	
	public double calcul() {
		double sum = 0;
		for (double note : this.getNotes()) {
			sum += note;
		}
		return sum/this.getNotes().length;
	}

	public double[] getNotes() {
		return notes;
	}

	public void setNotes(double[] note) {
		this.notes = note;
	}
	
}
