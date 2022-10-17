package set;

import java.util.Arrays;
import java.util.HashSet;

public class TestSetDouble {

	public static void main(String[] args) {
		HashSet<Double> set = new HashSet<>();
		set.addAll(Arrays.asList(1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01));
		System.out.println(set);
		
		Double max = null;
		
		for (Double val : set) {
			max = max == null || max < val ? val : max;
		}
		System.out.println(max);
		
		Double min = null;
		for (Double val : set) {
			min = min == null || min > val ? val : min;
		}
		set.remove(min);
		System.out.println(set);
	}

}
