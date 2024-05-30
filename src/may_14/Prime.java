package may_14;

public class Prime {
	public static boolean prime(int num) {
		if (num == 0 || num == 1)
			return false;

		if (num == 2 || num == 3)
			return true;
		if (num % 2 == 0 || num % 3 == 0)
			return false;
		for (int i = 5; i <= num; i = i + 6) {
			if (num % i == 0 || num % (i + 2) == 0)
				return true;
		}
		return false;

	}

	static {
		System.out.println("hhbdj");
	}

	public static void main(String[] args) {
		System.out.println(prime(29));
	}
}
