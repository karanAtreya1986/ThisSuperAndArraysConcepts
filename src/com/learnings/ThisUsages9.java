package com.learnings;

public class ThisUsages9 {

	// we create parameterised constructor
	// we pass in the id from main method
	// the original id value is lost

	int id = 10;

	ThisUsages9(int id) {
		this.id = id;
	}

	void method1() {
		method1(this);
	}

	private void method1(ThisUsages9 thisUsages6) {
		System.out.println("value of id is from method is " + thisUsages6.id);
	}

	public static void main(String[] args) {
		ThisUsages9 t6 = new ThisUsages9(9234324);
		t6.method1();
	}

}
