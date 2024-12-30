package com.learnings;

class Vehicle810 {

	public Vehicle810() {
		System.out.println("Vehicle0 constructor is called.");
	}

	int numberofgears = 40;

	void defaultSpeed() {
		System.out.println("default speed of vehice 0 is 50 kmhr");
	}
}

class Vehicle811 extends Vehicle810 {

	public Vehicle811() {
		System.out.println("Vehicle1 constructor is called.");
	}

	int numberofgears = 140;

	void defaultSpeed() {
		System.out.println("default speed of vehice 1 is 150 kmhr");
	}

}

//now child is inheriting from grand parent directly
//we are not involving the parent here
//so constructor of grandparent called
//constructor of child called
//constructor of parent not called as child is asking for icecream quietly to grandparents.
public class SuperWorking17 extends Vehicle810 {

	SuperWorking17() {
		System.out.println("child class constructor");
	}

	int numberofgears = 440;

	void defaultSpeed() {
		System.out.println("default speed of child class is 2150 kmhr");
	}

	public static void main(String[] args) {
		SuperWorking17 s15 = new SuperWorking17();

	}

}
