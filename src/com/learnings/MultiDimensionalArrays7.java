package com.learnings;

public class MultiDimensionalArrays7 {

	public static void main(String[] args) {

		int[][] a = { { 1, 2, 3, 4 }, { 4, 5, 6, 7, 8 } };
		int[][] b = { { 5, 6, 7, 8, 90, 10 }, { 5, 6, 7, 8, 9, 0, 1, 23, 34432 } };

		// here we will get out of bounds here
		// we didnt give proper size
		// we want 0 and 1 element from rows - two elements from rows which will fit in
		// from columns we want 0, 1,2,3 but we have given size of 3 which wont fit.
		int[][] c = new int[3][3];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j]);
			}
			System.out.println();

		}

	}
}
