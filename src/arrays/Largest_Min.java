package arrays;

public class Largest_Min {

	static void largest_2nd_largest(int[] array) {
		int max = Integer.MIN_VALUE;
		int smax = Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				smax = max;
				max = array[i];
			} else if (array[i] > smax && array[i] != max) {
				smax = array[i];
			}
		}

		if (smax == Integer.MIN_VALUE)
			smax = -1;
		System.out.println(max);
		System.out.println(smax);
	}

	public static void main(String[] args) {
//		System.out.println(Integer.MIN_VALUE);
		int[] array = { 23, 23, 23 };
//		int[] array = { 1, 234, 4567, 7654, 345, 3, -4551, 456789876 };
//		int[] array = { 61, 30, 28, 47, 42, 25, 41, 56, 27, 45, 44, 34, 46, 35, 58, 36, 60, 29, 53, 55, 32, 31, 33, 59,
//				50, 51, 52, 37, 39, 38, 43, 49, 54, 57, 40, 26, 48 };
		largest_2nd_largest(array);
		min(array);
	}

	static void min(int[] array) {
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println(min);
	}
}
