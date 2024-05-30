package may_15;

import java.util.Arrays;

public class Delete_Duplicates {
	public static void main(String[] args) {
		int[] array = { 2, 34, 2, 34, 1 };
		Arrays.sort(array);
		int s = 0;
		int b[] = new int[array.length];
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] != array[i + 1]) {
				b[s] = array[i];
				s++;
			}
		}
		b[s] = array[array.length - 1];

		for (int i = 0; i <= s; i++) {
			System.out.println(b[i]);
		}
	}
}
