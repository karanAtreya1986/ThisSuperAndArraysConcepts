package com.learnings;

public class ArraysExample7 {

	public static void main(String[] args) {

		// we give lesser space for arrays but add more elements.
		// we get index out of bounds for that index which is not present
		// we give random index numbers here.
		// so we get out of bounds for the very first index which is out of array
		// length.
		int[] a1 = new int[4];

		a1[0] = 11;
		a1[4] = 32324;
		a1[5] = 12213;
		a1[8] = 34;
		a1[9] = 12;

		for (int i = 0; i < a1.length; i++) {
			System.out.println("array values are " + a1[i]);
		}

	}

}
