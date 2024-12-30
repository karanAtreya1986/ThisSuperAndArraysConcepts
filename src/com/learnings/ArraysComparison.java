package com.learnings;

public class ArraysComparison {
	
	//comparing arrays
	
	//we cannot use == to compare arrays.
	
	public static void main(String[] args) {
		
		int []i1= {1,2,3,4};
		int []i2= {1,2,3,4};
		
		boolean []b1= {true,false};
		boolean []b2= {true, false};
		
		if (i1==i2) {
			System.out.println("==can be used to compare arrays");
		}else {
			System.out.println("==cannot be used to compare arrays");
		}
		
		if (b1==b2) {
			System.out.println("==can be used to compare arrays");
		}else {
			System.out.println("==cannot be used to compare arrays");
		}
	}

}
