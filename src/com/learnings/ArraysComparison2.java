package com.learnings;

import java.util.Arrays;

public class ArraysComparison2 {

	public static void main(String[] args) {

		int[] i1 = { 1, 2, 3, 4 };
		int[] i2 = { 1, 2, 3, 4 };

		boolean[] b1 = { true, false };
		boolean[] b2 = { true, false };

		// only way to compare arrays is use arrays.equal method
		// pass in the array names, you want to compare
		// gives true if arrays same
		// false if arrays different
		
		boolean booleanCompare=Arrays.equals(b1, b2);
		boolean booleanCompareOfIntArrays=Arrays.equals(i1,i2);
		
		System.out.println(booleanCompare);
		System.out.println(booleanCompareOfIntArrays);
	}

}
