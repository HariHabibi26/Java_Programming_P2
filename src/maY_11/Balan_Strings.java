package maY_11;

import java.util.ArrayDeque;
import java.util.Deque;

public class Balan_Strings {

	public static boolean a() {
		Deque<Character> stack = new ArrayDeque<Character>();

		String word = "{[()]}[[]]()";

		char[] ch = word.toCharArray();
		for (char c : ch) {
			switch (c) {
			case '(':
			case '[':
			case '{':
				stack.push(c);
				break;
			case ')':
				if (stack.isEmpty() || stack.poll() != '(')
					return false;
				break;
			case ']':
				if (stack.isEmpty() || stack.poll() != '[')
					return false;
				break;
			case '}':
				if (stack.isEmpty() || stack.poll() != '{')
					return false;
				break;
			}
		}

		return stack.isEmpty();

	}

	public static void main(String[] args) {
		System.out.println(a());
	}

}
