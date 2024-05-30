package maY_11;

public class PyramidnumberPattern {

	public static void box(int row, int col) {

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void upperPyr(int row, int col) {

		for (int i = 4; i > 0; i--) {
			for (int j = 1; j <= col; j++) {

				if (i <= j) {
					System.out.print("* ");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}

	public static void invertedPyramid(int row, int col) {

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {

				if (i <= j) {
					System.out.print("* ");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}

	public static void rightTri(int row, int col) {

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {

				if (i >= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}

	public static void rightTriInverted(int row, int col) {

		for (int i = row; i > 0; i--) {
			for (int j = 1; j <= col; j++) {

				if (i >= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}

	public static void leftTri(int row, int col) {

		for (int i = 4; i > 0; i--) {
			for (int j = 1; j <= col; j++) {

				if (j >= i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}

	public static void leftTriInverted(int row, int col) {

		for (int i = row; i > 0; i--) {
			for (int j = col; j > 0; j--) {

				if (j <= i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}

	public static void outerBoxDesign(int row, int col) {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				if ((i == 1 || i == row) || (j == 1 || j == col)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	public static void MultiSymbol(int row, int col) {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				if (i==j||i+j==6) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		MultiSymbol(5, 5);
	}
}
