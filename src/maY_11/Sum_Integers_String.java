package maY_11;

public class Sum_Integers_String {

	public static int name(String word) {

		char[] ch = word.toCharArray();
		String temp = "0";

		int value = 0;

		for (char c : ch) {
			if (Character.isDigit(c)) {
				temp += c;
			} else {
				value += Integer.parseInt(temp);
				temp = "0";
			}
		}
		return value+Integer.parseInt(temp);
	}
	public static void main(String[] args) {

		String str = "Love10India20By30";

		System.out.println(name(str));
	}

}
