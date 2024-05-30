package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class List_Contains_Odd_Numbers {

	public static boolean list_Contains_odd(List<Integer> list) {
//		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
//			Integer integer = (Integer) iterator.next();
//			if (integer % 2 != 0)
//				return true;
//
//		}
		for (Integer a : list) {
			if (a % 2 != 0)
				return true;

		}
		return false;
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(12, 22334, 36, 5638, 7));
		boolean a = list_Contains_odd(list);
		System.out.println(a);
	}
}
