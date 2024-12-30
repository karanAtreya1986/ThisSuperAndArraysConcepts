package com.learnings;

public class CopyArrays2 {

	public static void main(String[] args) {

		char[] copyFrom = { 'a', 'b', 'c', 'c', '4', 'g', 'l', 'm' };
		char[] copyTo = new char[5];

		// copy from second index
		// copy four values
		// copy into indexes starting from zero
		// output is cc4g
		System.arraycopy(copyFrom, 2, copyTo, 0, 4);
		System.out.println(new String(copyTo));

	}

}
