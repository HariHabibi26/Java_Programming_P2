package arrays;

public class Sort_specific_Even_Odd {
	static int[] sortEven(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (i% 2 == 0 && j % 2 == 0) {
					if (a[i] < a[j]) {
						a[i] = a[i] + a[j];
						a[j] = a[i] - a[j];
						a[i] = a[i] - a[j];
					}
				}
			}
		}
		return a;
	}

	public static void main(String[] args) {
		int[] array = { 9757233, 1, 89772344, 2, 233, 3, 223344, 4, 0 };

		for (int i = 0; i < array.length; i++) {
			int j = sortEven(array)[i];
			System.out.print(j + " ");
		}

	}
}
