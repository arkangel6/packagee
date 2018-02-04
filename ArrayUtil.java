package packagee;

/**
 * Reverse elements of array arr Precondition: arr.length > 0. Postcondition:
 * The elements of arr have been reversed
 * 
 * @param arr
 *            the array to manipulate
 */
class ArrayUtil {
	public static void reverseArray(int[] arr) {
		/* code goes here */
		int[] newArray = new int[arr.length];
		int counter = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			newArray[counter] = arr[i];
			counter++;
		}

		for (int l = 0; l < arr.length; l++) {
			System.out.println(newArray[l]);
		}

	}

	public static void main(String[] args) {
		int[][] testArr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		int[] testArr2 = { 12, 11, 10, 9 };
		Matrix m = new Matrix(testArr);
		System.out.println("Reverse Array:");
		ArrayUtil.reverseArray(testArr2);
		System.out.println("Reverse All Rows:");
		m.reverseAllRows();
		System.out.println("Reverse Matrix:");
		m.reverseMatrix();
	}
}

class Matrix {
	private int[][] mat;

	public Matrix(int[][] m) {
		mat = m;
	}

	/**
	 * Revereses the elements in each row of mat. Postcondition: The elements in
	 * each row have been reversed
	 */
	public void reverseAllRows() {

		// System.out.println(mat);
		int[][] newMat = new int[mat.length][];
		int counter = 0;
		for (int i = 0; i < mat.length; i++) {
			int[] newArray = new int[mat[i].length];

			for (int j = mat.length; j >= 0; j--) {

				newArray[counter] = mat[i][j];
				counter++;

			}

			newMat[i] = newArray;

			counter = 0;

		}

		for (int l = 0; l < newMat.length; l++) {
			for (int m = 0; m < newMat[l].length; m++) {
				System.out.println(newMat[l][m]);

			}
			System.out.println(" ");

		}

	}

	/**
	 * Reverses the elements of mat. Postcondition: - The final elements of mat,
	 * when read in row-major order, are the same as the original elements of mat
	 * when read from the bottom corner, right to left, going upward. - mat[0][0]
	 * contains what was originally the last element. - mat[mat.length -
	 * 1][mat[0].length -1] contains what was originally the first element.
	 */
	public void reverseMatrix() {
		// System.out.println(mat);
		int[][] newMat = new int[mat.length][];
		int counter = 0;
		int sub = 2;
		for (int i = 0; i < mat.length; i++) {
			int[] newArray = new int[mat[i].length];

			for (int j = mat.length; j >= 0; j--) {

				newArray[counter] = mat[i][j];
				counter++;

			}

			newMat[sub] = newArray;

			// newMat[i] = newArray;
			sub--;

			counter = 0;

		}

		for (int l = 0; l < newMat.length; l++) {
			for (int m = 0; m < newMat[l].length; m++) {
				System.out.println(newMat[l][m]);

			}
			System.out.println(" ");

		}

	}

	public int[][] getIntArray() {
		return mat;
	}
}