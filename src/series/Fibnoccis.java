package series;

public class Fibnoccis {

	static void fibbnocis(int n) {
		int a = 0, b = 1, c;
		System.out.println(a + "\n" + b);
		for (int i = 1; i < n - 1; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.println(c);

		}
	}

	public static void main(String[] args) {

		for (int i = 0; i < 4; i++) {
			System.out.println(fib(i));
		}
	}

	static int fib(int n) {
		if (n <= 1)
			return n;
		return fib(n - 1) + fib(n - 2);

	}
}
