package arrays;

import java.util.HashMap;
import java.util.Map;

public class Frequencies {
	static HashMap<Integer, Integer> fre(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		return map;
	}

	public static void main(String[] args) {
		int a[] = { 11, 23, 11, 234, 23, 1234, 234 };
		System.out.println(fre(a));

		for (Map.Entry<Integer, Integer> entry : fre(a).entrySet()) {

			if (entry.getValue() % 2 != 0)
				System.out.println(entry.getKey() + " = " + entry.getValue());

		}
		System.out.println(fre_String("qwertyuiokhgwertytrewWw"));
		for (Map.Entry<Character, Integer> entry : fre_String("qwertyuiokhgwertytrewWw").entrySet()) {

			if (entry.getValue() % 2 != 0)
				System.out.println(entry.getKey() + " = " + entry.getValue());

		}

	}

	static HashMap<Character, Integer> fre_String(String word) {
		char[] str = word.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();
		for (char c : str) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		return map;
	}
}
