package may_14;

import java.util.ArrayList;
import java.util.List;

public class SubStrings_2Strings {

	public static List<String> subStr2Strings(String n1, String n2) {
		List<String> list = new ArrayList<>();
		String substr;
		System.out.println(n1.length());
		System.out.println(n2.length());
		for (int i = 0; i <= n1.length(); i++) {
			for (int j = i + 1; j <= n1.length(); j++) {
				substr = n1.substring(i, j);
				if (n2.contains(substr)) {
					list.add(substr);
				}

			}

		}
		return list;
	}

	public static void main(String[] args) {
		System.out.println(subStr2Strings("Harsha", "sha"));
	}
}
