package arrays;

public class Count_Char {
	public static void name(String cha) {
		char[] ch = cha.toCharArray();
		int count;
		for (int i = 0; i < ch.length; i++) {
			count = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j] && ch[i] != ' ') {
					count++;
					ch[j] = '0';
				}

			}
			if (count >= 1 && ch[i] != ' ' && ch[i] != '0')
				System.out.println(count + " = " + ch[i]);
		}
	}

	public static void main(String[] args) {
//		name("asdfghjklasdfghjklqwertyzzzxxxcccvvvbbbnnnnmmmm pppppp");
		Comm_nu_arrays();
	}

	public static void Comm_nu_arrays() {
		int[] a = { 2, 345, 56, 3456 };
		int[] b = { 12, 345, 67, 56 };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}
}
