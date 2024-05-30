package arrays;

public class Deter_3_numbers_sum_Equal_Given {
	static boolean sumGivenDetermine(int[] a, int sum) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				for (int j2 = j + 1; j2 < a.length; j2++) {
					int s = a[i] + a[j] + a[j2];
					if (sum == s) {
						System.out.println("The Triplets are: " + a[i] + ", " + a[j] + ", " + a[j2]);
						return true;
					}

				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 5, 6, 6 };
		System.out.println(sumGivenDetermine(arr, 9));
	}
}
