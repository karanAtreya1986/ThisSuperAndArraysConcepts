package com.learnings;

public class MultiDimensionalArrays3 {

	public static void main(String[] args) {

		int i1[][] = { { 1, 2, 3, 90 }, { 4, 5, 6 }, { 7, 8, 9, 0 } };
		int[][] i2 = { { 1, 2, 3, 90 }, { 4, 5, 6 }, { 7, 8, 9, 0 } };

		for (int i = 0; i < i1.length; i++) {
			for (int j = 0; j < i1.length; j++) {

				// remove the println and change to print
				// we can see the output in matrix form
				// for every row after traversing all columns then move to the next line.
				System.out.print(i1[i][j]);
			}
			System.out.println();

		}

	}
}
