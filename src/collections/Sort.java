package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Sort {
	static ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2, 45, 1, 456, 5, 45678, 988778));

	public static void sort() {

		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {

				if (list.get(i) > list.get(j)) {
					Integer p1 = list.get(i);
					Integer p2 = list.get(j);
					list.set(j, p1);
					list.set(i, p2);
				}
			}
		}
		System.out.println(list);
	}

//	Print only even numbers in a list
	public static void even() {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 2 == 0)
				System.out.print(list.get(i) + " ");
		}

	}

	public static void main(String[] args) {
		sort();
		even();
	}
}
