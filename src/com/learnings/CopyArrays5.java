package com.learnings;

public class CopyArrays5 {

	public static void main(String[] args) {

		char[] copyFrom = { 'a', 'b', 'c', 'c', '4', 'g', 'l', 'm' };
		char[] copyTo = new char[5];

		System.arraycopy(copyFrom, 2, copyTo, 0, 4);
		// using for loop on copy to array
		// it will print on separate lines in the output area
		// c
		// c
		// 4
		// g
		for (int i = 0; i < copyTo.length; i++) {
			System.out.println(copyTo[i]);
		}

	}

}
