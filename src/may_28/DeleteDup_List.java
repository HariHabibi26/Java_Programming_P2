package may_28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class DeleteDup_List {
	public static void main(String[] args) {

	}

	public static ArrayList<Integer> duplicates(int arr[], int n) {
		// code here
		ArrayList<Integer> list = new ArrayList<Integer>();
		HashSet<Integer> set1 = new HashSet<Integer>();
		HashSet<Integer> set = new HashSet<Integer>();
		for (Integer a : arr) {
			if (set.contains(a)) {
				set1.add(a);
			} else {
				set.add(a);
			}
		}
		if (set1.isEmpty()) {
			set1.add(-1);
		}
		list.addAll(set1);
		Collections.sort(list);
		return list;
	}
}
