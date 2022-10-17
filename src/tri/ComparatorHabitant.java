package tri;

import java.util.Comparator;

import listes.Ville;

public class ComparatorHabitant implements Comparator<Ville> {

	@Override
	public int compare(Ville ville1, Ville ville2) {
		return ville1.getHabitants() - ville2.getHabitants();
	}

}
