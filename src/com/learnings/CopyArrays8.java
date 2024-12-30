package com.learnings;

public class CopyArrays8 {

	public static void main(String[] args) {

		char[] copyFrom = { 'a', 'b', 'c', 'c', '4', 'g', 'l', 'm' };
		//destination array has loads of space for elements
		//but we want to add only two elements
		//so all other element space will have blank values in output
		char[] copyTo = new char[15];

		System.arraycopy(copyFrom, 2, copyTo, 2, 2);
		for (int i = 0; i < copyTo.length; i++) {
			System.out.println(copyTo[i]);
		}

	}

}
