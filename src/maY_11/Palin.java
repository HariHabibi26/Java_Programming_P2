package maY_11;

public class Palin {
	static boolean pa(String word) {
		char[] ch = word.toCharArray();

		String rev = "";

		for (int i = ch.length - 1; i >= 0; i--) {
			char a = ch[i];

			rev += a;
		}

		if (word.equals(rev))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		System.out.println(pa("racecar"));
	}
	
	
}
