package com.learnings;

public class ArraysExample5 {

	public static void main(String[] args) {

		//declare, instantiate and initialise array in one line
		
		//here also we can add only the correct data type values.
		//compile error - Type mismatch: cannot convert from double to int
//		int[] a1= {1,2,3,4,5,56.78};
		int[] a1= {1,2,3,4,5,56};
		
		for (int i = 0; i < a1.length; i++) {
			int i1=a1[i];
			System.out.println(i1);
		}

	}

}
