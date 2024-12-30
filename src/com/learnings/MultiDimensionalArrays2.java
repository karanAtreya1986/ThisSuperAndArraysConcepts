package com.learnings;

public class MultiDimensionalArrays2 {

	public static void main(String[] args) {

		// square bracket can come after variable name or before variable name
		int i1[][] = { { 1, 2, 3, 90 }, { 4, 5, 6 }, { 7, 8, 9, 0 } };
		int[][] i2 = { { 1, 2, 3, 90 }, { 4, 5, 6 }, { 7, 8, 9, 0 } };

		for (int i = 0; i < i1.length; i++) {
			for (int j = 0; j < i1.length; j++) {
				System.out.println(i1[i][j]);
			}
			System.out.println();

		}

	}
}
