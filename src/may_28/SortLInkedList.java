package may_28;

import java.util.Collections;
import java.util.LinkedList;

public class SortLInkedList {
	public static void main(String[] args) {
		sort();
	}

	public static void sort() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(12);
		list.add(2);
		Collections.sort(list);
		System.out.println(list);
	}

}
