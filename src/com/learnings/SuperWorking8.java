package com.learnings;

class Vehicle642 {

	int numberofgears = 4;

	Vehicle642() {
		System.out.println("parent class constructor vehicle");
	}

	void speed() {
		System.out.println("speed of parent class is 40 kmhr");
	}
}

public class SuperWorking8 extends Vehicle642 {

	int numberofgears = 5;

	SuperWorking8() {
		super();
		System.out.println("child class constructor");
	}

	void speed() {
		System.out.println("speed of child class is 10 kmhr");
	}

	void display() {
		int i1 = super.numberofgears;
		System.out.println("parent class gears " + i1);
		super.speed();
		int i2 = this.numberofgears;
		this.speed();

	}

	public static void main(String[] args) {
		SuperWorking8 s6 = new SuperWorking8();
		s6.display();

		// we cannot use this and super inside static block
		// static refers to class level things
		// this and super refers to object level things.

		// compile error - Cannot use super in a static context
		int i1 = super.numberofgears;
		System.out.println("parent class gears " + i1);
		// compile error - Cannot use super in a static context
		super.speed();
		// compile error - Cannot use this in a static context
		int i2 = this.numberofgears;
		this.speed();
	}
}
