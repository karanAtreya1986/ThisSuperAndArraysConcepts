package com.learnings;

public class ArraysExample4 {

	public static void main(String[] args) {

		int[] a1 = new int[10];

		a1[0] = 11;
		a1[4] = 32324;
		a1[5] = 12213;
		a1[8] = 34;

		// we started from first index.
		// so the first element is now skipped

		// Array always starts from zero.
		for (int i = 1; i < a1.length; i++) {
			System.out.println(a1[i]);
		}

	}

}
