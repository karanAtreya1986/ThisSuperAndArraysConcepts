package com.learnings;

public class CopyArrays4 {

	public static void main(String[] args) {

		char[] copyFrom = { 'a', 'b', 'c', 'c', '4', 'g', 'l', 'm' };
		char[] copyTo = new char[5];

		System.arraycopy(copyFrom, 2, copyTo, 0, 4);
		// when we try to convert to string and then print we get memory address.
		String s1 = copyTo.toString();
		System.out.println(s1);

	}

}
