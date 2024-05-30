package may_14;

public class Longest_Substr_wo_re_Char {

	public static int repeStr(String word) {

		String text = "";
		int maxLength = -1;
		if (word.isEmpty())
			return 0;

		if (word.length() == 1)
			return 1;
		for (char c : word.toCharArray()) {
			String value = String.valueOf(c);

			if (text.contains(value)) {
				text = text.substring(text.indexOf(c));
			}
			text += value;

		}
		System.out.println(text);
		maxLength = Math.max(text.length(), maxLength);
		return maxLength;
	}

	public static void main(String[] args) {
		String str = "asdfgh fghtfg hwc";
		System.out.println("The input string is " + str);

		int len = repeStr(str);
		System.out.println("The length of the longest " + "non-repeating character " + "substring is " + len);
	}
}
