package pattern;

public class Pyramid {
	static void pyr(int rowNum, int colNum) {
		for (int i = 0; i < rowNum; i++) {
			for (int j = 0; j < colNum; j++) {

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		border(4, 4);
	}

	static void border(int row, int col) {
		for (int i = 1; i <=row; i++) {
			for (int j = 1; j <= col; j++) {
				if ((i == 0 || i == row) || (j == 0 || j == col)) {
					System.out.print("* ");
				} else {
					System.out.print(" ");
				}
			}			System.out.println();

		}
	}

	static void pyra(int rowNum, int colNum) {
		for (int i = rowNum; i > 0; i++) {
			for (int j = 1; j <= colNum; j++) {
				if (j >= i) {
					System.out.print("* ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
