package com.learnings;

class Vehicle659 {
	public Vehicle659() {
		System.out.println("parent class constructor");
	}

	Vehicle659(String s1) {
		System.out.println("argument constructor in parent " + s1);
	}
}

public class SuperWorking11 extends Vehicle659 {

	SuperWorking11() {
		// two constructors in parent
		// one with argument
		// one without argument
		// to call non argument constructor we can use this way
		super();
		System.out.println("child class constructor");
	}

	public static void main(String[] args) {

		SuperWorking11 s1 = new SuperWorking11();
	}

}
