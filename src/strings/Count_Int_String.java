package strings;

public class Count_Int_String {
	static int count(String word) {
		String temp = "0";
		int sum = 0;
		for (int i = 0; i < word.toCharArray().length; i++) {

			if (Character.isDigit(word.toCharArray()[i])) {
				temp += word.toCharArray()[i];
			} else {
				sum += Integer.parseInt(temp);
				temp = "0";
			}
		}
		return sum + Integer.parseInt(temp);
	}

	public static void main(String[] args) {
		String str = "Love10India20By30";

		System.out.println(count(str));
	}
}
