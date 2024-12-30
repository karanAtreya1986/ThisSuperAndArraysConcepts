package com.learnings;

public class ThisUsages11 {

	// return object of class using this keyword

	// see how to return the object of class
	// use return this
	// return type becomes object of class
	// so we pass in the class name because return type of object of class is
	// classname
	// example class abcd = new class(); here class is return type
	ThisUsages11 getmessage() {
		return this;
	}

	void newmessage() {
		System.out.println("new message method is created");
	}

	public static void main(String[] args) {
		// this is another way to directly create object without reference
		// we call the method name directly.
		// this is called method chaining.
		new ThisUsages11().getmessage().newmessage();
	}
}
