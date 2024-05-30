package may_28;

import java.util.Arrays;

public class Merge_wO_Exra_Space {
	public static void main(String[] args) {
		int n = 4, m = 5;
		long arr1[] = { 1, 3, 5, 7 };
		long arr2[] = { 0, 2, 6, 8, 9 };
		merge(arr1, arr2, n, m);
	}

	public static void merge(long arr1[], long arr2[], int n, int m) {
		long b[] = new long[n + m];
		int s = 0;
		for (int i = 0; i < n; i++) {
			b[s] = arr1[i];
			s++;
		}
		for (int i = 0; i < m; i++) {
			b[s] = arr2[i];
			s++;
		}
		Arrays.sort(b);
		for (long a : b) {
			System.out.print(a + " ");
		}
		for (int i = 0; i < n; i++) {
			arr1[i] = b[i];
		}
		System.out.println();
		for (long a : arr1) {
			System.out.print(a + " ");
		}

		int j = 0;
		for (int i = n; i < n + m; i++) {
			arr2[j] = b[i];
			j++;
		}
		System.out.println();

		for (long a : arr2) {
			System.out.print(a + " ");
		}

	}
}
