package com.learnings;

import java.time.chrono.MinguoChronology;
import java.util.Iterator;

public class PassArrayToMethod {

	// pass array to method
	// lets find minimum element in array

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 5435, 23324 };
		min(a);
	}

	static void min(int[] b) {
		// assume first value is minimum
		int minimumvalue = b[0];
		// iterate the array from index 1 as first value is assumed minimum
		for (int i = 1; i < b.length; i++) {
			// check if minimum is greater than current value
			// if yes then the new value is minimum
			if (minimumvalue > b[i]) {
				minimumvalue = b[i];
			}
		}
		// finally print the minimum value
		System.out.println("minimum value is " + minimumvalue);
	}

}
