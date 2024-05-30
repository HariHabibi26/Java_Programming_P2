package series;

public class Palindrome {
	static String palin(int num) {
		int temp = num, rem, rev = 0;
		while (num > 0) {
			rem = num % 10;
			num = num / 10;
			rev = rev * 10 + rem;
		}
		if (temp == rev)
			return "Number is Palindrome";
		else
			return "Number is Not Palindrome";
	}

	public static void main(String[] args) {
		System.out.println(palin(121));
	}
}
