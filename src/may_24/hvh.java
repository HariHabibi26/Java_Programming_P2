package may_24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class hvh {

	public static void main(String[] args) {
		int[] a = { 2, 0, 2, 3, 1 };
		System.out.println(name(a, a.length));
	}

	public static ArrayList<Integer> name(int[] arr, int n) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			int a = arr[i];
			if (map.containsKey(a)) {
				map.put(a, map.get(a) + 1);
			} else {
				map.put(a, 1);
			}
		}
		System.out.println(map);
		for (Entry<Integer, Integer> a1 : map.entrySet()) {
			if (a1.getValue() > 1) {
				list.add(a1.getKey());

//				System.out.println(a1.getKey() + "==" + a1.getValue());

			}
		}
		if (list.isEmpty()) {
			list.add(-1);
		}
		Collections.sort(list);
		return list;

	}
}
