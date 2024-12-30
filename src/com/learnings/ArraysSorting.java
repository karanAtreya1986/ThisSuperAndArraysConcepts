package com.learnings;

import java.util.Arrays;

public class ArraysSorting {

	public static void main(String[] args) {

		// only one way to sort arrays using sort method.

		int[] i1 = { 234, 234324, 56, 5, 6, 7, 324, 1223, 343 };
		// sort method returns void
		// does in place sorting

		// Pass in array name
		Arrays.sort(i1);
		// when we try to print the array name directly we get memory address in this
		// case
		// when we declare array in this way.
		System.out.println(i1);
	}

}
