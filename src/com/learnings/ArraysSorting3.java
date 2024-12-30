package com.learnings;

import java.util.Arrays;

public class ArraysSorting3 {
//lets sort string array
	public static void main(String[] args) {

		// sorted based on ascii value
		// capital values have lower ascii value so all values in capital sorted first
		// by their alphabets.
		// output is - [Angur, Tiger, arrow, broken, tiger, tiger]
		// returns list of array values in sorted order.
		String[] s1 = { "tiger", "tiger", "Tiger", "arrow", "Angur", "broken" };
		Arrays.sort(s1);
		String s2 = Arrays.toString(s1);
		System.out.println(s2);
	}

}
