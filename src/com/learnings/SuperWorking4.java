package com.learnings;

class Parent4 {

	public Parent4() {
		System.out.println("parent constructor is called.");
	}

	void parentClassMethod() {
		System.out.println("Parent class method is called");
	}

	int v1 = 102323;
}

public class SuperWorking4 extends Parent4 {

	SuperWorking4() {
		System.out.println("child class constructor");
	}

	void parentClassMethod() {
		System.out.println("Parent class method is overridden");
	}

	int v1 = 3432423;

	void display() {

		super.parentClassMethod();

		System.out.println("parent class variable value is " + super.v1);

		// using this keyword also we can access current class or child class variables.
		// this is not mandatory to write as this method is inside child class only.
		System.out.println("child class variable value is " + this.v1);
		// using this keyword also we can access current class or child class methods.
		// this is not mandatory to write as this method is inside child class only.
		this.parentClassMethod();
	}

	public static void main(String[] args) {

		SuperWorking4 s1 = new SuperWorking4();
		s1.display();
	}

}
