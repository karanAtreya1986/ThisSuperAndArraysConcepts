package com.learnings;

class Vehicle1{
	public Vehicle1() {
		System.out.println("parent class constructor");
	}
}
public class RulesOfIDE extends Vehicle1 {

	// not related to programming
	// its IDE rules
	// two public classes cant exist inside a class
	// only class which has main method should be public
	// also the name of the file should be the same as the class name which contains
	// main
	
	RulesOfIDE(){
		System.out.println("child class constructor");
	}
	
	public static void main(String[] args) {
		RulesOfIDE object1=new RulesOfIDE();
	}

}
