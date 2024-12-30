package com.learnings;

public class ThisUsages12 {

	int id;

	ThisUsages12(int id) {
		// this and super used in this way with dot notation can be any line in the
		// block.
		// not necessary they have to be in first line.
		this.id = id;
		this.display(); // with this we can call the same class method also.
		// its basically like creating object of class and calling the class members.
		// example of object is t5 as seen below.
	}

	void display() {
		System.out.println("print the value of id " + id);
	}

	public static void main(String[] args) {
		ThisUsages12 t5 = new ThisUsages12(16);
		int i1 = t5.id;
		System.out.println("value of instance variable is " + i1);
		t5.display();

		// in outout we see the print statement twice.
		// once we call it from constructor.
		// second is when we call the method from main.

	}

}
