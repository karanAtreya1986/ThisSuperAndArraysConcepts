package com.learnings;

public class MultiDimensionalArrays4 {

	public static void main(String[] args) {
//some timepass code with multi dimensional array
		// lets try to add them

		// we declared big arrays
		// but in output array we want to consider only two rows and three columns
		// output will be
		// 68
		// 911
		// because only two rows are considered 0 and 1
		// three columns are considered 0,1,2
		// values which will be considered are 00, 01, 10, 11 as per the for loop.

		int[][] a = { { 1, 2, 3, 4 }, { 4, 5, 6, 7, 8 }, { 5, 3, 234, 234, 456, 567657 } };
		int[][] b = { { 5, 6, 7, 8, 90, 10 }, { 5, 6, 7, 8, 9, 0, 1, 23, 34432 },
				{ 534, 323, 2234, 22334, 43456, 53467657 }, { 32345, 33, 2334, 2334, 4356, 3567657 } };

		int[][] c = new int[2][3];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j]);
			}
			System.out.println();

		}

	}
}
