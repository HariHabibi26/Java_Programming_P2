package may_12;

import java.util.Arrays;
import java.util.Stack;
import java.util.Vector;

public class Iterable_Collection_List {

	public static void vector() {
		Vector<Integer> vector = new Vector<>();
		vector.add(12);
		vector.add(12);
		vector.add(12);
		vector.add(12);
		vector.add(12);
		vector.add(12);
		vector.add(12);
		vector.add(12);

//		System.out.println(vector.capacity());
		System.out.println(vector);

		System.out.println(Arrays.toString(vector.toArray()));

	}

	public static void stack() {

		Stack<Integer> stack = new Stack<Integer>();
		stack.add(12);
		stack.add(122);
		stack.add(1222);
		stack.add(12222);
		stack.add(122222);
		stack.add(1222222);
		stack.add(12222222);
		stack.add(122222222);
		stack.set(3, 0);

		stack.push(3);
		stack.push(111111111);
		System.out.println(stack.pop());
		System.out.println(stack.peek());
//		System.out.println(stack);
		System.out.println(stack.search(122222222));
		System.out.println(stack.indexOf(122));

	}

	public static void main(String[] args) {
		stack();
	}

}
