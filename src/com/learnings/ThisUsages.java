package com.learnings;

public class ThisUsages {

	// see how local variable and instance variable is properly returned in output.

	// this resolves confusion between instance variable, local variable, method
	// parameters.

	// instance variable
	int id = 10;

	ThisUsages() {

		// local variable
		int id = 15;
		// prints 15 as it refers to local variable.
		System.out.println("value of local variable is " + id);
		// prints 10 as we are referring to instance variable using this keyword.
		System.out.println("value of instance variable is " + this.id);
	}

	public static void main(String[] args) {
		ThisUsages t1 = new ThisUsages();
	}

}
