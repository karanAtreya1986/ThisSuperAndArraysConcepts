package com.learnings;

//with super we can call anything of immediate parent class
//they can be variables, class, methods, inner class, final, static, void, private, protected, default, public.
class Parent6 {

	Parent6() {
		System.out.println("parent 6 constructor called by parent 5");
	}
}

class Parent5 extends Parent6 {

	public Parent5() {
		System.out.println("parent constructor is called.");
	}

	void parentClassMethod() {
		System.out.println("Parent class method is called");
	}

	int v1 = 102323;
}

public class SuperWorking5 extends Parent5 {

	SuperWorking5() {
		// super can also be used to call parent class constructor
		// most common way in programming
		super();
		System.out.println("child class constructor");
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

		SuperWorking5 s1 = new SuperWorking5();
		s1.display();
	}

}
