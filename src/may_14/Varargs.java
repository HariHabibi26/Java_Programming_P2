package may_14;

public class Varargs {

	public static int Add(int... numbers) {
		int sum = 0;
		for (int num : numbers) {
			sum += num;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(Add(2,3,4,5,6,7,1));
	}
}
