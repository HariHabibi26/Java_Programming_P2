package may_14;

import java.util.ArrayList;
import java.util.List;

public class SubString_Finder {

	public static void substrFinder(String word, int length) {
		List<String> substr = new ArrayList<>();
		for (int i = 0; i < word.length()-length; i++) {
			substr.add(word.substring(i, i + length));
		}
		System.out.println(substr);
	}

	public static void main(String[] args) {
		substrFinder("Example", 3);
	}

}
