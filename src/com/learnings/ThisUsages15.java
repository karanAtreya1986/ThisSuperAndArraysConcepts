package com.learnings;

public class ThisUsages15 {

	// this will return the object of the class.
	ThisUsages15 getmessage() {
		return this;
	}

	// lets see what this prints
	// this will print the memory address.
	void newmessage() {
		System.out.println("new message method is created " + this);
	}

	public static void main(String[] args) {
		new ThisUsages15().newmessage();
	}
}
