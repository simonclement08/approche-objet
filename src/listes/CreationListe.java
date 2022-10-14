package listes;

import java.util.ArrayList;

public class CreationListe {

	public static void main(String[] args) {
		ArrayList<Integer> nombres = new ArrayList<Integer>();
		for (int i = 1; i <= 100; i++) {
			nombres.add(i);
		}
		System.out.println(nombres.size());

	}

}
