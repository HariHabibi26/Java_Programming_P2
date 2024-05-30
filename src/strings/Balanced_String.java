package strings;

import java.util.ArrayDeque;

public class Balanced_String {
	static boolean balance(String word) {

		ArrayDeque<Character> stack = new ArrayDeque<Character>();
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
			case '}':
				if (stack.isEmpty() || stack.poll() != '{')
					return false;
				break;
			case ']':
				if (stack.isEmpty() || stack.poll() != '[')
					return false;
				break;

			}

		}

		return stack.isEmpty();

	}

	public static void main(String args[]) {

		// String[] str = { "{", "[", "(", ")", "]", "}", "[", "[", "]", "]", "(" };
		String str = "{[()]}[[]]()";

		if (balance(str))
			System.out.println(str + " is balanced");
		else
			System.out.println(str + " is not balanced");

	}
}
