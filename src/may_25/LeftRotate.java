package may_25;

public class LeftRotate {

	static void rotateArr(int arr[], int d, int N) {
		if (d > arr.length)
			d = d % N;

		int k = 0;
		int[] temp = new int[N];
		for (int i = d; i < N; i++) {
			temp[k] = arr[i];
			k++;
		}
		for (int i = 0; i < d; i++) {
			temp[k] = arr[i];
			k++;
		}

		for (int i = 0; i < N; i++) {
			arr[i] = temp[i];
		}
	}
}
