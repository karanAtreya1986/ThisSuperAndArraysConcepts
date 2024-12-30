package com.learnings;

public class ArraysExample {

	// Arrays-
	// Similar elements can only be present. Memory is allocated continuously. Use
	// arrays for primitive data types and simple data.
	// arrays have fixed size and cannot grow as we add or delete elements.

	public static void main(String[] args) {

//		Instantiate an array-
//		Means give length to array.

		int[] a1 = new int[10];

		// Initialization of array-
		// Give value to array.

		// Array is index based or bit wise data structure because we deal with indexes.
		a1[0] = 11;
		a1[4] = 32324;
		a1[5] = 12213;
		a1[8] = 34;

		// cannot store other data type inside array
		// compile error - Type mismatch: cannot convert from double to int
//		a1[9] = 234.324;

		// when value not specified then default value assigned
		// like int has default value zero

		// to traverse arrays use for loop or for each loop.
		for (int i = 0; i < a1.length; i++) {
			// See how to print the values inside array.
			// Pass array name and index.

			System.out.println("array values are " + a1[i]);
		}

	}

}
