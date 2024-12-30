package com.learnings;

//compile error - The public type Vehicle2 must be defined in its own file
//we cant have two public classes in one file.
public class Vehicle2 {
	public Vehicle2() {
		System.out.println("parent class constructor");
	}
}

public class RulesOfIDE3 extends Vehicle2 {

	// not related to programming
	// its IDE rules
	// two public classes cant exist inside a class
	// only class which has main method should be public
	// also the name of the file should be the same as the class name which contains
	// main

	RulesOfIDE3() {
		System.out.println("child class constructor");
	}

	public static void main(String[] args) {
		RulesOfIDE3 object1 = new RulesOfIDE3();
	}

}
