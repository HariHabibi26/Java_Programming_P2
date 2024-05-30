package arrays;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Sort {

	static void AscSort(int[] array) {
		boolean swapped;
		do {
			swapped = false;
			for (int i = 1; i < array.length; i++) {
				if (array[i - 1] > array[i]) {
					array[i - 1] = array[i - 1] + array[i];
					array[i] = array[i - 1] - array[i];
					array[i - 1] = array[i - 1] - array[i];
					swapped = true;
				}
			}
		} while (swapped);

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	static int[] AscSort1(int[] array) {
		boolean swapped;
		do {
			swapped = false;
			for (int i = 1; i < array.length; i++) {
				if (array[i - 1] > array[i]) {
					array[i - 1] = array[i - 1] + array[i];
					array[i] = array[i - 1] - array[i];
					array[i - 1] = array[i - 1] - array[i];
					swapped = true;
				}
			}
		} while (swapped);

		return array;
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 2, 3, 3, 5 };
//			{ 1234,256776543, 1, 34, 1, 2334, 256776543 };

		AscSort(a);
		
		System.out.println();
		DeleteDuplicates(AscSort1(a));
		System.out.println();


		System.out.println(Arrays.stream(AscSort1(a)).boxed().collect(Collectors.toSet()));
	}

	static void DeleteDuplicates(int[] array) {
		int[] b = new int[array.length];
		int s = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i - 1] != array[i]) {
				b[s] = array[i - 1];
				s++;
			}
		}
		b[s]=array[array.length-1];
		
		for(int i=0;i<=s;i++) {
			System.out.print(b[i]+" ");
		}

	}
}
