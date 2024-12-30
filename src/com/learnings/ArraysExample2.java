package com.learnings;

public class ArraysExample2 {

	public static void main(String[] args) {

		int[] a1 = new int[10];

		a1[0] = 11;
		a1[4] = 32324;
		a1[5] = 12213;
		a1[8] = 34;

		// if we put equal to we get array index out of bounds
		// array always start at zero and goes one less than length
		for (int i = 0; i <= a1.length; i++) {

			System.out.println(a1[i]);
		}

	}

}
