package com.learnings;

import java.util.Arrays;

public class ArraysSorting4 {
//lets sort string array
	public static void main(String[] args) {

		// lets use all different combinations of characters in string.
		// here also ascii code is considered when sorting.
		String[] s1 = { "&", "45345", "32434.234324", "true", "b", "figer" };
		Arrays.sort(s1);
		String s2 = Arrays.toString(s1);
		System.out.println(s2);
	}

}
