package collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;

public class Sort_Hashmap_Value {

///*
// * create linkedList
// *Then Use collections class and sort with Using Comparator class
// * 
// * */
	public static LinkedHashMap<String, Integer> sort(HashMap<String, Integer> map) {
		LinkedList<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(map.entrySet());

		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {

				return o1.getValue().compareTo(o2.getValue());
			}
		});

		LinkedHashMap<String, Integer> ls = new LinkedHashMap<String, Integer>();
//		for(Iterator iterator:ns.entrySet();iterator.hasNext()) {
//			
//		}
//		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
//			Entry<String, Integer> entry = (Entry<String, Integer>) iterator.next();
//			
//		}

		for (Map.Entry<String, Integer> ns : list) {
			ls.put(ns.getKey(), ns.getValue());
		}

		return ls;
	}

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Math", 98);
		map.put("Data Structure", 85);
		map.put("Database", 91);
		map.put("Java", 95);
		map.put("Operating System", 79);
		map.put("Networking", 80);

		// System.out.println(map);
		LinkedHashMap<String, Integer> hm1 = sort(map);

		// print the sorted hashmap
		for (Map.Entry<String, Integer> en : hm1.entrySet()) {
			System.out.println("Key = " + en.getKey() + ", Value = " + en.getValue());
		}
		// System.out.println(sort_HashMap_Value(map));
	}

}
