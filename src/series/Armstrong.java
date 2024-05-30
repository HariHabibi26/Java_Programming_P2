package series;

public class Armstrong {
	static String arm(int num) {
		int temp = num, rem, rev = 0;
		while (num > 0) {
			rem = num % 10;
			num = num / 10;
			rev = rem * rem * rem + rev;
		}
		if (temp == rev)
			return "Number is Armstrong";
		else
			return "Number is Not Armstrong";
	}

	public static void main(String[] args) {
//		System.out.println(2%2);
		System.out.println(arm(153));
	}
}
