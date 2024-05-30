package arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class Common_2_Arrays {
	static void common(Object[] a1, Object[] a2) {
		TreeSet set = new TreeSet<>();
		for (int i = 0; i < a1.length; i++) {
			Object o1 = a1[i];
			for (int j = 0; j < a2.length; j++) {

				Object o2 = a2[j];
				if (o1 == o2) {
					set.add(o1);
				}
			}

		}
		System.out.println(set.toString());
		for(Object s:set) {
			System.out.println(s);
			
		}
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
	}

	public static void main(String[] args) {

		Object[] a = { "Article", "in", "Geeks", "for", "Geeks" };
		Object[] b = { "Geeks", "for", "Geeks" };
		
//		Object[] a = { 1, 34, 2, 7689, 35678 };
//		Object[] b = { 1, 2, 8, 345678, 7654, 2, 4 };

		Arrays.sort(a);
		Arrays.sort(b);
		common(a, b);
	}
}
