import java.util.HashMap;
import java.util.Map.Entry;

public class Sum_Arrays {
	public static void main(String[] args) {

		HashMap<Integer, Integer> map = new HashMap<>();

		int[] a = { 1, 2, 1, 3, 5, 1 };

		for (int list : a) {

			if (map.containsKey(list)) {
				map.put(list, map.get(list) + 1);
			} else {
				map.put(list, 1);

			}
		}

		for (Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() <= 1) {
				System.out.println(entry.getKey());
			}
		}

//		for (int i = 0; i < a.length; i++) {
//			int count = 1;
//			for (int j = i + 1; j < a.length; j++) {
//				if (a[i] == a[j]) {
//					count++;
////					a[j]=null;
//				}
//
//			}
//			if (count <= 1) {
//				System.out.println(a[i]);
//			}
//		}
	}
}
