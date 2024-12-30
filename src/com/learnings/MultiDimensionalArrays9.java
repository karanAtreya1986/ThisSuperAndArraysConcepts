package com.learnings;

public class MultiDimensionalArrays9 {

	public static void main(String[] args) {

		int[][] a = { { 1, 2, 3, 4 }, { 4, 5, 6, 7, 8 } };
		int[][] b = { { 5, 6, 7, 8, 90, 10 }, { 5, 6, 7, 8, 9, 0, 1, 23, 34432 } };

		// give the correct dimension you want
		// give proper values in for loop and it works
		// memory assigned can be more but cant be less.
		// extra memory will result in wastage but no errors
		int[][] c = new int[10][24];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j]);
			}
			System.out.println();

		}

	}
}
