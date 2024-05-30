package maY_11;

public class SecondLargestElement {

	public static void main(String[] args) {
		int[] arr = { 23, 456, 23, 123, 1233 };
		int lar = arr[0];
		int sec = arr[0];
		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//
//				if (arr[i] > arr[j]) {
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
			if (arr[i] > lar) {
				sec = lar;
				lar = arr[i];
			} else if (arr[i] > sec) {
				sec = arr[i];
			}

		}
		System.out.println(lar);
		System.out.println(sec);
	}
}
