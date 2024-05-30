package may_25;
public class SplitBasedonDot {
	public static String Split(String S) {

		String[] str = S.split("[.]");
		String rev = "";

		System.out.println(str.length);
		for (int i = str.length - 1; i >= 0; i--) {
			if (i == 0)
				rev = rev + str[i];
			else
				rev = rev + str[i] + ".";
		}

		return rev;
	}

	public static void main(String[] args) {
		String a = "q.wer.rew.xf.w";
		if (a.contains(".")) {
			System.out.println(true);
		}
		System.out.println(Split(a));
	}

}