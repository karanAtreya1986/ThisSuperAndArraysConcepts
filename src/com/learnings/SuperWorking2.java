package com.learnings;

class Parent1 {

	public Parent1() {
		System.out.println("parent constructor is called.");
	}

	void parentClassMethod() {
		System.out.println("Parent class method is called");
	}

	int v1 = 102323;
}

public class SuperWorking2 extends Parent1 {

	SuperWorking2() {
		System.out.println("child class constructor");
	}

	// in inheritance the override word is not mandatory to be called.
	// when we are using same method in child class also.
	void parentClassMethod() {
		System.out.println("Parent class method is overridden");
	}

	public static void main(String[] args) {

		SuperWorking2 s1 = new SuperWorking2();
	}

}
