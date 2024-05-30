package may_13;

import java.util.Arrays;
import java.util.Random;

public class Shuffle_Array {

	public static void main(String[] args) {
		int[] a = { 1, 2, 4, 5, 4, 3, 2, 789 };
		System.out.println(Arrays.toString(a));
		Random random = new Random();
		for (int ll : a) {
			int ss = random.nextInt(a.length);
			int temp = a[ss];
			a[ss] = ll;
			ll = temp;
		}
		System.out.println(Arrays.toString(a));
	}
}
