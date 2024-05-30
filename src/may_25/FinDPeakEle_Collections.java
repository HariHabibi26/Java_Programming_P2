package may_25;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FinDPeakEle_Collections {
	public static void main(String[] args) {
		LinkedList<Integer> a = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1));
		System.out.println(findPeakElement(a));
	}

	public static int findPeakElement(List<Integer> a) {
		int max = a.get(0);
		for (int i = 1; i < a.size(); i++) {
			if (a.get(i ) > a.get(i-1)) {
				max = a.get(i);
			}
		}
		return max;
	}

}
