package com.learnings;

//we have same method and same variable name in parent and child class.
//we have used override at method level and variable level.
//override cannot be used with variables only methods.
class Vehicle411 {
	int numberofgears = 5;

	void defaultSpeed() {
		System.out.println("default speed of vehicle is 50kmhr");
	}
}

public class SuperWorking13 extends Vehicle411 {

	// The annotation @Override is disallowed for this location - compile error
	// we cannot use override above variable name.
//	@Override
	int numberofgears = 4;

	@Override
	void defaultSpeed() {
		System.out.println("default speed of my vehicle is 40 kmhr");
	}

	void numberofgears() {
		super.defaultSpeed();
		this.defaultSpeed();
	}

	public static void main(String[] args) {

		// both parent class and child class constructor called automatically.
		// no need of super in inheritance.
		SuperWorking13 s1 = new SuperWorking13();
		s1.numberofgears();
	}

}
