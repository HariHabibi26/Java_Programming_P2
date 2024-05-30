package may_13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Duplicate_List {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1, 2, 4, 5, 4, 3, 2, 789));

		HashSet<Integer> st = new HashSet<Integer>();
		List<Integer> dupl = new ArrayList<Integer>();

		for (Integer as : a) {
			if (!st.contains(as)) {
				st.add(as);
			} else {
				dupl.add(as);
			}
		}
		System.out.println(dupl);
	}
}
