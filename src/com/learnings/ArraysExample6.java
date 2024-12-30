package com.learnings;

public class ArraysExample6 {

	// Size is for collections.
	// Length with arrays.

	public static void main(String[] args) {

		int[] a1 = { 1, 2, 3, 4, 5, 56 };

		// if we try to use enhanced for loop for arrays, we need to manipulate code to
		// avoid index out of bounds exception.

		// using enhanced for loop also works but need manipulation.
		for (int i : a1) {
			int i1 = a1[i];
			System.out.println(i1);
		}

	}

}
