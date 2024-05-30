package may_25;

import java.util.LinkedList;

public class FirstRepe_Elm {
	public static int firstRepeated(int[] arr, int n) {

		LinkedList<Integer> set = new LinkedList<Integer>();
		for (int i = 0; i < n; i++) {
			if (set.contains(arr[i])) {

				int a = set.indexOf(arr[i]);
				return a + 1;
			} else {
				set.add(arr[i]);
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] a = { 1, 5, 3, 4, 3, 5, 6 };
//		int[] a= {7 ,4 ,0 ,9 ,4 ,8 ,8 ,2 ,4 ,5 ,5 ,1};
		System.out.println(firstRepeated(a, a.length));
	}
}
