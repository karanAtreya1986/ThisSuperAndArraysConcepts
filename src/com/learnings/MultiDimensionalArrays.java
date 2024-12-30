package com.learnings;

import java.util.Iterator;

public class MultiDimensionalArrays {

	public static void main(String[] args) {

		// Multi dimensional array-
		// Not used much. More than one index.

		// create 2d array
		// 2d array means two [][]
		// 3d array means three [][][]

		// create array with three rows and three columns

		// even though you have given uneven combination of values
		// how many {} are present determines the number of rows and number of columns
		// in our case three rows and three columns so indexes are 0, 1,2
		// rest of the values in other indexes ignored and no error will be thrown for
		// them
		int i1[][] = { { 1, 2, 3, 90 }, { 4, 5, 6 }, { 7, 8, 9, 0 } };

		// traverse 2d arrays

		// first traverse rows
		for (int i = 0; i < i1.length; i++) {
			// then once inside first row start traversing columns
			for (int j = 0; j < i1.length; j++) {
				// then do the needed operation
				System.out.println(i1[i][j]);
			}
			// print new line after every row column combination is done
			System.out.println();

		}

	}
}
