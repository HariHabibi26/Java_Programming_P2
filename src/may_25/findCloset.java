package may_25;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class findCloset {
	public static int findClosest(int n, int k, int[] arr) {
		int[] arr2 = new int[n];
		int Index = 0;

		for (int i = 0; i < n; i++) {
			arr2[i] = arr[i] - k;
		}
		System.out.println(Arrays.toString(arr2));
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			if (map.containsKey(arr2[i])) {
				map.put(arr[i], map.get(arr2[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		System.out.println(map);
		for (Entry<Integer, Integer> a : map.entrySet()) {
			if (a.getValue() > 2) {
				Integer key = a.getKey();
				int kv = key;
//				Index = 0;

				for (int i = 1; i < n; i++) {
					if (arr2[i] > arr2[i - 1]) {
						Index = i;
					}
				}

			} else {
//				Index = 0;
				for (int i = 1; i < n; i++) {
					if (arr2[i] < arr2[i - 1]) {
						Index = i;
					}
				}
			}
		}
		return arr[Index + 1];

	}

	public static void main(String[] args) {
		int[] a ={1, 2, 3, 5, 6, 8, 9};
		System.out.println(findClosest(a.length, 4, a));
	}
}
