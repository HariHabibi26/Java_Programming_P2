package amazon;

public class Find_first_Duplicate_Element {

//	public static int first(int[] arr, int n) {
//		for (int i = 0; i < n; i++) {
//			for (int j = i + 1; j < n; j++) {
//				if (arr[i] == arr[j]) {
//					return i;
//				}
//			}
//		}
//		return -1;
//	}
//
//	public static void main(String[] args) {
//		int[] arr = { 10, 5, 3, 4, 3, 5, 6 };
////			{ 1, 2, 4, 4, 1, 3, 7, 5, 5, 2 };
//
//		System.out.println(first(arr, arr.length));
//	}
	public static int firstRepeatingElement(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					return i;
				}
			}
		}
		return -1;
	}

	// Driver code
	public static void main(String[] args) {
		int[] arr = { 10, 5, 3, 4, 3, 5, 6 };
		int n = arr.length;
		int index = firstRepeatingElement(arr, n);
		System.out.println(index);

		if (index == -1) {
			System.out.println("No repeating element found!");
		} else {
			System.out.println("First repeating element is " + arr[index]);
		}
	}
}
