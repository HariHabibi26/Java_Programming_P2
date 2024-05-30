package may_21;

public class Frequency_Digit_D_Number_N {
	public static int name(int D, int N) {

		if (D == 0 && N == 0)
			return 0;

		if (N < 0)
			return -1;
		int res = 0;
		while (N != 0) {
			int temp = N % 10;
			if (temp == D) {
				res++;
			}
			N /= 10;
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(name(4, 142454));
	}
}
