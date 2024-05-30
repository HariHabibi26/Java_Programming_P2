package maY_11;

public class Comples_Pyramids {

	public static void main(String[] args) {
		int row = 4;
		int space = 3, star = 1;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print("*");
			}
			System.out.println();
			star += 2;
			space -= 1;
		}
	}
}
