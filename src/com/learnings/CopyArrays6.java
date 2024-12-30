package com.learnings;

public class CopyArrays6 {

	public static void main(String[] args) {

		char[] copyFrom = { 'a', 'b', 'c', 'c', '4', 'g', 'l', 'm' };
		char[] copyTo = new char[5];

		// this will give array out of bounds because we start at index 2 in copy to
		// array.
		// we want to copy four elements.
		// but our copy to array is of length 5 which means indexes from 0 to 4.
		// so 0th will have blank
		// 1st index will have blank
		// 2nd index will have one value
		// 3rd index will have one value
		// 4th index will have one value
		// we need to add one more value but there are no indexes present in copy to
		// so we get index out of bounds exception.
		// we are copying more elements than the array size.
		System.arraycopy(copyFrom, 2, copyTo, 2, 4);
		for (int i = 0; i < copyTo.length; i++) {
			System.out.println(copyTo[i]);
		}

	}

}
