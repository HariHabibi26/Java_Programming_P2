package may_21;

import java.util.HashSet;

public class Unique_Characers {
	public static String name(String name) {
		char[] strChar = name.toCharArray();
		HashSet<Character> set = new HashSet<Character>();
		for (char c : strChar) {
			if (set.contains(c)) {
				set.remove(c);

			} else {
				set.add(c);
			}

		}
		return set.toString();

	}

	public static void main(String[] args) {
		System.out.println(name("abceab"));
	}
}
