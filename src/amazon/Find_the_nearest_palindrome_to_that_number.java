package amazon;

public class Find_the_nearest_palindrome_to_that_number {

	static boolean palin(int num) {
		int temp = num, rem, rev = 0;
		while (num > 0) {
			rem = num % 10;
			num = num / 10;
			rev = rev * 10 + rem;
		}
		if (temp == rev)
			return true;
		else
			return false;
	}

	public static int num(int s) {
		int low = s - 1;
		int high = s + 1;

		while (palin(low) == false) {
			low -= 1;
		}
		while (palin(high) == false) {
			high += 1;
		}

		if ((s - low) > high - s)
			return high;
		else
			return low;
	}



	public static void main(String[] args) {

		System.out.println(num(115));
		System.out.println(palin(113));
	}
}
