package com.learnings;

public class CopyArrays7 {

	public static void main(String[] args) {

		char[] copyFrom = { 'a', 'b', 'c', 'c', '4', 'g', 'l', 'm' };
		char[] copyTo = new char[5];

		// we want to copy from index number 2 in copyto array.
		// here we copy the elements but it is less than the array size.
		// index 0 has no element so blank
		// index 1 has no element so blank
		// index 2 will have the first element
		// index 3 will have the second element
		// index 4 has no element so blank
		System.arraycopy(copyFrom, 2, copyTo, 2, 2);
		for (int i = 0; i < copyTo.length; i++) {
			System.out.println(copyTo[i]);
		}

	}

}
