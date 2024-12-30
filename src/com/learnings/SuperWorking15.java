package com.learnings;

class Vehicle0 {

	public Vehicle0() {
		System.out.println("Vehicle0 constructor is called.");
	}

	int numberofgears = 40;

	void defaultSpeed() {
		System.out.println("default speed of vehice 0 is 50 kmhr");
	}
}

class Vehicle11 extends Vehicle0 {

	public Vehicle11() {
		System.out.println("Vehicle1 constructor is called.");
	}

	int numberofgears = 140;

	void defaultSpeed() {
		System.out.println("default speed of vehice 1 is 150 kmhr");
	}

}

//see how constructors called automatically when we inherit without super keyword also
//child inherits vehicle 1
//vehicle 1 inherits vehicle 0
public class SuperWorking15 extends Vehicle11 {

	SuperWorking15() {
		System.out.println("child class constructor");
	}

	int numberofgears = 440;

	void defaultSpeed() {
		System.out.println("default speed of child class is 2150 kmhr");
	}

	public static void main(String[] args) {
		SuperWorking15 s15 = new SuperWorking15();

	}

}
