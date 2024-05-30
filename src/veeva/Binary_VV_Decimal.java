package veeva;

import java.util.ArrayList;
import java.util.List;

public class Binary_VV_Decimal {

	public static void DB(int num) {
		List<Integer> a = new ArrayList<Integer>();

		while (num > 0) {
			int rem = num % 2;
			a.add(rem);
			num = num / 2;
		}

		for (int i = a.size() - 1; i >= 0; i--) {
			System.out.print(a.get(i));
		}
	}

	public static void main(String[] args) {
		DB(32);
	}

}
