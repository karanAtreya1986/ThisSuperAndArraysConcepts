package com.learnings;

public class MultiDimensionalArrays5 {

	public static void main(String[] args) {

		int[][] a = { { 1, 2, 3, 4 }, { 4, 5, 6, 7, 8 }};
		int[][] b = { { 5, 6, 7, 8, 90, 10 }, { 5, 6, 7, 8, 9, 0, 1, 23, 34432 }};

		int[][] c = new int[3][3];

		//here a.length will return two because two rows and columns are more
		//b.length will return two because two rows and columns are more
		//so length will always check the number of rows not columns.
		int i1=a.length;
		int i2=b.length;
		
		System.out.println("length of array a is " +i1);
		System.out.println("length of array b is " +i2);
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j]);
			}
			System.out.println();

		}

	}
}
