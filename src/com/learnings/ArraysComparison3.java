package com.learnings;

import java.util.Arrays;

public class ArraysComparison3 {

	public static void main(String[] args) {

		int[] i1 = { 1, 2, 3, 4 };
		int[] i2 = { 1, 2, 3 };

		boolean[] b1 = { true, true };
		boolean[] b2 = { true, false };

		// compare arrays which are not same using the same equals method
		// we should get false.

		boolean booleanCompare = Arrays.equals(b1, b2);
		boolean booleanCompareOfIntArrays = Arrays.equals(i1, i2);

		System.out.println(booleanCompare);
		System.out.println(booleanCompareOfIntArrays);
	}

}
