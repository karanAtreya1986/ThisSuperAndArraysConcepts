package com.learnings;

class Vehicle656 {
	public Vehicle656() {
		System.out.println("parent class constructor");
	}

	Vehicle656(String s1) {
		System.out.println("argument constructor in parent " + s1);
	}
}

public class SuperWorking10 extends Vehicle656 {

	SuperWorking10() {
		// two constructors in parent
		// one with argument
		// one without argument
		// to call argument constructor we can use this way
		super("tiger");
		System.out.println("child class constructor");
	}

	public static void main(String[] args) {

		SuperWorking10 s1 = new SuperWorking10();
	}

}
