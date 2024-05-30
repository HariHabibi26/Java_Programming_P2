import java.util.Arrays;

public class may_28 {
	public static void main(String[] args) {
		int n = 5;
		int arr[] = { 1, 2, 3, 5 };
		int a = missingNumber(arr, n);
		System.out.println(a);
	}

	static int missingNumber(int array[], int n) {
		Arrays.sort(array);
		int min = array[0];
		int max = array[array.length - 1];
		int sum = 0;
		int actualSum = 0;
		for (int i = 0; i < array.length; i++) {
			actualSum += array[i];
		}
		for (int i = 1; i <= n; i++) {
			sum = sum + (i);
		}
		System.out.println(sum);
		System.out.println(actualSum);
		
		return sum - actualSum;
		
		// for(int i=0;i<=n;i++){
		// sum+=i;
		// }
	}
}
