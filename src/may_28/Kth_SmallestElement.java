package may_28;

import java.util.Arrays;

public class Kth_SmallestElement {
	public static void main(String[] args) {
		int n = 3;
		int[] a = { 3, 1, 2 };
		int k = 3;
		kthSmallest(a, k, n, k);
	}

	public static int kthSmallest(int[] arr, int l, int r, int k) {
		// Your code here
		Arrays.sort(arr);
		// int b[]=new int[arr.length];
		// int s=0;
		// for(int i=l+1;i<r;i++){
		// if(arr[i-1]!=arr[i]){
		// b[s]=arr[i-1];
		// s++;
		// }
		// }
		// b[s]=arr[arr.length-1];
		// for(int i=0;i<=s;i++){
		// if((i+1)==k)
		// return b[i];
		// }
		for (int i = l; i <= r; i++) {
			if ((i + 1) == k)
				return arr[i];
		}
		return -1;
	}
}
