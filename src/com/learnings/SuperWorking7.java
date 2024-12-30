package com.learnings;

class Vehicle627 {
	Vehicle627() {
		System.out.println("parent class constructor vehicle");
	}
}

//when we dont extend parent class and we use the super keyword in constructor
//it will not class parent class constructor as its not extended.
public class SuperWorking7 {
	SuperWorking7() {
		super();
		System.out.println("child class constructor");
	}

	public static void main(String[] args) {
		SuperWorking7 s6 = new SuperWorking7();
	}
}
