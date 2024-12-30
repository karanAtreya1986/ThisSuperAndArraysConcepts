package com.learnings;

public class CopyArrays {

	public static void main(String[] args) {

		char[] copyFrom = { 'a', 'b', 'c', 'c', '4', 'g', 'l', 'm' };
		char[] copyTo = new char[5];

		// we have given 6 here
		// 6 is more than the number of elements in array to be copied to

		// first is from which array to copy
		// second is from which index you want to copy
		// third is which array you want to copy to
		// fourth is which index do you want to copy to
		// fifth is length which says number of elements to copy
		// once we see output it will be easy to understand how the args work.

		System.arraycopy(copyFrom, 2, copyTo, 0, 6);

		// How to print updated array.
		// Use new string(copied to array name)
		System.out.println(new String(copyTo));

	}

}
