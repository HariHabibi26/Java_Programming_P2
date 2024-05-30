package maY_11;

import java.util.HashMap;
import java.util.Map.Entry;

public class Count_Each_Char_String {

	public static void count1(String word) {

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] ch = word.toCharArray();

		for (char c : ch) {
			if (!Character.isWhitespace(c)) {
				if (map.containsKey(c)) {
					map.put(c, map.get(c) + 1);
				} else {
					map.put(c, 1);
				}
			}
		}

		for (Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}

	public static void main(String[] args) {
		count2(" bbbvvvjjJJJ123332211");
	}

	public static void count2(String word) {
		char[] ch = word.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count = 1;
			for (int j = i+1; j < ch.length; j++) {
				if (ch[i] == ch[j] && ch[i] != ' ') {
					count++;
					ch[j] = '0';
				}
			}
			if (count >= 1 && ch[i] != '0'&&ch[i]!=' ') {
				System.out.println(ch[i] + " = " + count);
			}
		}

	}
}
