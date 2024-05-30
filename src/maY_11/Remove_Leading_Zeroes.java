package maY_11;

public class Remove_Leading_Zeroes {

	public static String name(String word) {
		char[] ch = word.toCharArray();
		String ne = "";
		int index = 0;
		for (int i = 0; i < ch.length; i++) {

			if (ch[i] != '0') {
				index = i;
				break;

			}
		}
		return word.substring(index, word.length());
	}

	public static void main(String[] args) {
		System.out.println(name("00007654345609876000"));
	}
}
