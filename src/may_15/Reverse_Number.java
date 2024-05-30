package may_15;

public class Reverse_Number {
	static int ans = 0;

	static int reverse(int num) {

		if (num == 0)
			return ans;
		if (num > 0) {
			int temp = num % 10;
			ans = ans * 10 + temp;
			reverse(num / 10);
		}
		return ans;
	}

	public static void main(String[] args) {
		System.out.println(reverse(2));
	}
}
