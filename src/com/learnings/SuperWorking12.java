package com.learnings;

class Parent409 {
	

	public Parent409() {
		System.out.println("parent constructor is called.");
	}

	void parentClassMethod() {
		System.out.println("Parent class method is called");
	}

	int v1 = 102323;
}

public class SuperWorking12 extends Parent409 {

	SuperWorking12() {
		System.out.println("child class constructor");
	}

	// writing the override word is not mandatory when we use extends keyword
	// even if we write it wont throw error
	void parentClassMethod() {
		System.out.println("Parent class method is overridden");
	}

	public static void main(String[] args) {

		// both parent class and child class constructor called automatically.
		// no need of super in inheritance.
		SuperWorking12 s1 = new SuperWorking12();
	}

}
