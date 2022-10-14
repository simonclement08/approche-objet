package listes;

import java.util.ArrayList;

public class TestListeInt {

	public static void main(String[] args) {
		ArrayList<Integer> entiers = new ArrayList<Integer>();
		entiers.add(-1);
		entiers.add(5);
		entiers.add(7);
		entiers.add(3);
		entiers.add(-2);
		entiers.add(4);
		entiers.add(8);
		entiers.add(5);
		
		System.out.println(entiers);
		
		System.out.println(entiers.size());
		
		int max = entiers.get(0);
		for (Integer integer : entiers) {
			max = max > integer ? max : integer;
		}
		System.out.println(max);
		
		Integer min = entiers.get(0);
		for (Integer integer : entiers) {
			if(min > integer) {
				min = integer;
			}
		}
		entiers.remove(min);
		System.out.println(entiers);
		
		for (int i = 0; i < entiers.size(); i++) {
			if (entiers.get(i) < 0) {
				entiers.set(i, Math.abs(entiers.get(i)));
			}
		}
		System.out.println(entiers);
	}
}
