package com.learnings;

public class ThisExample1 {

	// this keyword-
	// refers to the current class object.
	// Super –
	// Refers to immediate parent class object.

	// this keyword and the object will give same memory address
	// this refers to current object being used

	public static void main(String[] args) {
		ThisExample1 t1 = new ThisExample1();
		System.out.println("value of the object is " + t1);
		t1.display();
	}

	void display() {
		System.out.println("this keyword value is " + this);
	}

}
