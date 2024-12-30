package com.learnings;

class Parent {
	// constructors are called automatically in inheritance.

	// Without super we invoked parent class constructor. With the help of extends
	// keyword.
	// super refers to immediate parent class not above that.

	public Parent() {
		System.out.println("parent constructor is called.");
	}

	void parentClassMethod() {
		System.out.println("Parent class method is called");
	}

	int v1 = 102323;
}

public class SuperWorking extends Parent {

	SuperWorking() {
		System.out.println("child class constructor");
	}

	// writing the override word is not mandatory when we use extends keyword
	// even if we write it wont throw error
	@Override
	void parentClassMethod() {
		System.out.println("Parent class method is overridden");
	}

	public static void main(String[] args) {

		// both parent class and child class constructor called automatically.
		// no need of super in inheritance.
		SuperWorking s1 = new SuperWorking();
	}

}
