package com.learnings;

class Parent654 {

	Parent654() {
		System.out.println("parent 6 constructor called by parent 5");
	}
}

class Parent655 extends Parent654 {

	public Parent655() {
		System.out.println("parent constructor is called.");
	}

	void parentClassMethod() {
		System.out.println("Parent class method is called");
	}

	int v1 = 102323;
}

public class SuperWorking9 extends Parent655 {

	SuperWorking9() {
		System.out.println("child class constructor");
		// super like this cannot be second sentence in constructor call.
		// super like this has to be first line inside the block
		super();
	}

	void parentClassMethod() {
		System.out.println("Parent class method is overridden");
	}

	int v1 = 3432423;

	void display() {

		super.parentClassMethod();

		System.out.println("parent class variable value is " + super.v1);
		System.out.println("child class variable value is " + this.v1);
		this.parentClassMethod();
	}

	public static void main(String[] args) {

		SuperWorking9 s1 = new SuperWorking9();
		s1.display();
	}

}
