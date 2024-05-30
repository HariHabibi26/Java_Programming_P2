package may_12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Iterable_Collection_Set {

	public static void hashSet() {
		Integer[] a = { 1, 2, 3, 4, 51 };
		Integer[] b = { 11, 21, 31, 41, 51 };
		

		Set<Integer> set1 = new HashSet<Integer>();
		set1.addAll(Arrays.asList(a));
		
		Set<Integer> set2 = new HashSet<Integer>();
		set2.addAll(Arrays.asList(b));
		System.out.println(set1);
		System.out.println(set2);

		Set<Integer> union = new HashSet<Integer>(set1);
		union.addAll(set2);
		System.out.println(union);

		Set<Integer> intersection = new HashSet<Integer>(set1);
		intersection.retainAll(set2);
		System.out.println(intersection);

		Set<Integer> diff = new HashSet<Integer>(set1);
		diff.removeAll(set2);
		System.out.println(diff);
	}

	public static void main(String[] args) {
		hashSet();
	}
}
