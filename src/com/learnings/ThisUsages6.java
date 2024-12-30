package com.learnings;

public class ThisUsages6 {

	int id;

	// how to pass object of the class to another method
	// use this keyword when calling the method
	// id value is zero which is the default value when not assigned
	void method() {
		// this will pass object to the second method
		// method chaining within one class
		// method is calling another method which needs object of class as argument.
		method1(this);
	}

	// see object being passed to this method
	// this method needs object of class as parameter.
	private void method1(ThisUsages6 thisUsages6) {
		System.out.println("value of id is from method is " + thisUsages6.id);
	}

	public static void main(String[] args) {
		ThisUsages6 t6 = new ThisUsages6();
		t6.method();
	}

}
