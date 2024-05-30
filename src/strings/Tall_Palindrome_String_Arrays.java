package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tall_Palindrome_String_Arrays {
	static boolean Palindrome(String word) {
		String rev = "";
		String temp = word;
		for (int i = word.length() - 1; i >= 0; i--) {
			rev += word.charAt(i);
		}
		if (word.equals(temp))
			return true;
		else
			return false;
	}

	static String max;

	public static void main(String[] args) {
		String[] array = { "aba", "hello", "sis", "racecar" ,"wertytrew"};
		List<String> sorting = new ArrayList<>(Arrays.asList(new String[] {}));

		for (String a : array) {
			if (Palindrome(a))
				sorting.add(a);
		}

		int sortSize = sorting.size();

		for (int j = 0; j < sortSize; j++) {
			max = sorting.get(j);
			for (int i = j + 1; i < sortSize; i++) {
				sorting.get(i);
				if (sorting.get(j).length() > sorting.get(i).length()) {
					max = sorting.get(i);
				}
			}
		}
		
//		do {
//			
//		} while (condition);
		System.out.println(max);
	}
}