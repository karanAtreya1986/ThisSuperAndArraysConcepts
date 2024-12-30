package com.learnings;

public class ArraysExample3 {

	public static void main(String[] args) {

		int[] a1 = new int[10];

		a1[0] = 11;
		a1[4] = 32324;
		a1[5] = 12213;
		a1[8] = 34;

		for (int i = 0; i < a1.length; i++) {

			// even this way of storing in a variable and printing it during run will work.
			int i1 = a1[i];
			System.out.println(i1);
		}

	}

}
