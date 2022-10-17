package maps;

import java.util.HashMap;

public class CreationMap {

	public static void main(String[] args) {
		HashMap<String, Double> salaires = new HashMap<>();
		
		salaires.put("Paul", 1750.0);
		salaires.put("Hicham", 1825.0);
		salaires.put("Yu", 2250.0);
		salaires.put("Ingrid", 2015.0);
		salaires.put("Chantal", 2418.0);
		
		System.out.println(salaires.size());

	}

}
