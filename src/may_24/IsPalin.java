package may_24;

public class IsPalin {
	static int isPalindrome(String S) {
		char[] ch = S.toCharArray();
		StringBuffer string = new StringBuffer();
		for (int i = ch.length - 1; i >= 0; i--) {
			string.append(S.charAt(i));
		}

		if (S.equals(string.toString()))
			return 1;
		else
			return 0;
	}

	public static void main(String[] args) {

		System.out.println(isPalindrome("abcba"));
	}
}
