package may_28;

public class FormAPalindrome {
	public static void main(String[] args) {
		String str = "as";
//		countMin(str);
//		System.out.println(str.length());
		System.out.println(countMin(str));
	}

	static int countMin(String str) {
		StringBuilder strB = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			strB.append(str.charAt(i));
		}
		if (str.equals(strB.toString())) {
			return 0;
		} else {
			return str.length() - 1;
		}

	}
}
