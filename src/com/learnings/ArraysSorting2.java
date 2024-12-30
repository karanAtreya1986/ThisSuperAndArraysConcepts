package com.learnings;

import java.util.Arrays;

public class ArraysSorting2 {

	// print the sorted values using tostring method of arrays.
	public static void main(String[] args) {

		int[] i1 = { 234, 234324, 56, 5, 6, 7, 324, 1223, 343 };
		Arrays.sort(i1);
		// see how to use to string on arrays.
		// it is not arrayname.tostring
		// it is Arrays.tostring(passinthearrayname)
		// returns list of array values in sorted order.
		String s1 = Arrays.toString(i1);
		System.out.println(s1);
	}

}
