package strings;

public class Distinct_Count_WO_Collection {
	static void distinct(String word) {
		char[] ch = word.toCharArray();
		int count;
		for (int i = 0; i < ch.length; i++) {
			count = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j] && ch[i] != ' ') {
					count++;
					ch[j] = '0';
				}

			}
			if (count == 1 && ch[i] != ' ' && ch[i] != '0') {
				System.out.println(ch[i] + " = " + count);
			}

		}
	}

	public static void main(String[] args) {

		distinct("Harshavardhan Reddy");
	}
}
