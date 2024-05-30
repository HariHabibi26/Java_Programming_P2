package maY_11;

import java.util.Arrays;

public class Anagrams {

	public static boolean Ana(String one, String two) {
		String One = one;
		String Two = two;

		char[] c1 = One.toCharArray();
		char[] c2 = Two.toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);

		if (c1.length != c2.length)
			return false;

		for (int i = 0; i < c1.length; i++) {
			if (c1[i] != c2[i])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(Ana("geeksforgeeks", "forgeeksgeeks"));
	}

}
