package may_12;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Collections_Map {
	public static void HashTable() {
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		table.put(5089, "qwer");
		table.put(50899, "louuy");
		table.put(50889, "45fgcvvk");

		Set<Entry<Integer, String>> a = table.entrySet();
		for (Entry<Integer, String> v : a) {
			System.out.println(v.getKey() + " = " + v.getValue());
		}

		Collection<String> values = table.values();

		for (String v : values) {
			System.out.println(v);
		}
		table.put(66, "Harsha");

		table.putIfAbsent(508, "g");
		System.out.println(table);
	}

	public static void HashMap() {
		TreeMap<Integer, String> table = new TreeMap<Integer, String>();
		table.put(5089, "qwer");
		table.put(5083349, "qwer");
		table.put(50899, "louuy");
		table.put(50889, "45fgcvvk");

		Set<Entry<Integer, String>> a = table.entrySet();
		for (Entry<Integer, String> v : a) {
			System.out.println(v.getKey() + " = " + v.getValue());
		}

		Collection<String> values = table.values();

		for (String v : values) {
			System.out.println(v);
		}
//		table.put(null, "Harsha");

		table.putIfAbsent(508, null);
		System.out.println(table);
	}

	public static void main(String[] args) {
		HashMap();
	}
}
