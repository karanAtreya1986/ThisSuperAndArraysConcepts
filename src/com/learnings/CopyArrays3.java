package com.learnings;

public class CopyArrays3 {

	public static void main(String[] args) {

		char[] copyFrom = { 'a', 'b', 'c', 'c', '4', 'g', 'l', 'm' };
		char[] copyTo = new char[5];

		System.arraycopy(copyFrom, 2, copyTo, 0, 4);
		// if we just print the array name also it returns cc4g
		// just print the copiedto array name.
		System.out.println(copyTo);

	}

}
