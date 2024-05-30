package strings;

import java.util.Arrays;

public class Distinct_Characters {
	static String distinct(String word) {
		int index = 0;

		char[] ch = word.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int j;
			for (j = 0; j < i; j++) {
				if (ch[i] == ch[j])
					break;
			}
			if (j == i)
				ch[index++] = ch[i];
		}
		return String.valueOf(Arrays.copyOf(ch, index));
	}

	public static void main(String[] args) {
		String a = "qqwertywerty";
		System.out.println(distinct(a));
		dis(a);
	}

	static void dis(String word) {
		char[] ch = word.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int flag = 0;

			
			for (int j = 0; j < ch.length; j++) {
				if (ch[i] == ch[j] && i != j) {
					flag = 1;
					break;
				}
			}

			if (flag == 0) {
				System.out.print(ch[i]);
			}
		}
	}
}
