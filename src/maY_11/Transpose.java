package maY_11;

public class Transpose {

	public static void name() {

	}

	public static void main(String[] args) {
		int A[][] = { { 1, 1, 1, 1 }, { 2, 2, 2, 2 }, { 3, 3, 3, 3 }, { 4, 4, 4, 4 } };
//		System.out.println(A.length);
//
//		System.out.println(A[0].length);

		int row = A.length;
		int col = A[0].length;

		int B[][] = new int[row][col];

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < col; j++) {
				B[j][i] = A[i][j];
			}
		}
		for (int i = 0; i < row; i++) {

			for (int j = 0; j < col; j++) {
				System.out.print(B[i][j] + " ");
				
			}
			System.out.print("\n");
		}

	}
}
