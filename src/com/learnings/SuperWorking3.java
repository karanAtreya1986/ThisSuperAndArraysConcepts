package com.learnings;

class Parent3 {

	public Parent3() {
		System.out.println("parent constructor is called.");
	}

	void parentClassMethod() {
		System.out.println("Parent class method is called");
	}

	int v1 = 102323;
}

public class SuperWorking3 extends Parent3 {

	SuperWorking3() {
		System.out.println("child class constructor");
	}

	void parentClassMethod() {
		System.out.println("Parent class method is overridden");
	}

	int v1 = 3432423;

	void display() {
		// see how to call parent class method using super keyword
		super.parentClassMethod();
		// calling parent class variable using super
		System.out.println("parent class variable value is " + super.v1);
		// child class variable called in normal way
		System.out.println("child class variable value is " + v1);
		// child class method called in normal way
		parentClassMethod();
	}

	public static void main(String[] args) {

		SuperWorking3 s1 = new SuperWorking3();
		// first parent class constructor called due to inheritance.
		// then child class constructor called.

		s1.display();
	}

}
