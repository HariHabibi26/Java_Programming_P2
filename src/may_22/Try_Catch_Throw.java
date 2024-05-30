package may_22;

public class Try_Catch_Throw {
	public static void name(int age) {
		if (age < 18) {
			throw new ArithmeticException("Not elligible to voote");

		} else {
			System.out.println("Elogible to vote");
		}

	}

	public static void main(String[] args) {

		name(17);
	}
}
