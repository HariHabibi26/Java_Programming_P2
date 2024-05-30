package maY_11;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;

public class HAshMap {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Math", 98);
		map.put("Data Structure", 85);
		map.put("Database", 91);
		map.put("Java", 95);
		map.put("Operating System", 79);
		map.put("Networking", 80);
//		System.out.println(map);
		Map<String, Integer> abc = name(map);

		for (Map.Entry<String, Integer> entry : abc.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();

			System.out.println(key + " = " + val);

		}

	}

	public static Map<String, Integer> name(HashMap<String, Integer> map) {

		LinkedList<Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(map.entrySet());

		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});

		Map<String, Integer> temp = new LinkedHashMap<String, Integer>();

		for (Map.Entry<String, Integer> a : list) {
			temp.put(a.getKey(), a.getValue());
		}
		return temp;
	}
}
