package com.learnings;

public class ThisExample2 {

	// This and super cannot be used in static method
	// because this and super deals with objects and not at class level.

	public static void main(String[] args) {
		ThisExample2 t1 = new ThisExample2();
		System.out.println("value of the object is " + t1);
		t1.display();
		// we cannot use this and super inside static methods.
		// compile error - Cannot use this in a static context
		System.out.println("value of this keyword is " + this);
	}

	void display() {
		System.out.println("this keyword value is " + this);
	}

}
