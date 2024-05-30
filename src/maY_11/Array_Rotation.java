package maY_11;

public class Array_Rotation {

	static int d = 21;
//		Output:3 4 5 6 7 1 2

	public static int[] name(int[] arr, int d) {
		if (d > arr.length)
			d = d % arr.length;

		int[] temp = new int[arr.length];
		int k = 0;
		for (int i = d; i < arr.length; i++) {
			temp[k] = arr[i];
			k++;
		}
		for (int i = 0; i < d; i++) {
			temp[k] = arr[i];
			k++;
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = temp[i];
		}
		return arr;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int a[] = name(arr, d);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
