package com.learnings;

public class ThisUsages2 {
	// see how local variable and instance variable is properly returned in output.

	int id = 10;

	ThisUsages2() {

		int id = 15;
	}

	void message() {
		int id = 20;
		// this will print 20
		System.out.println("local variable is " + id);
		// instance variable is still 10
		System.out.println("instance variable is " + this.id);

	}

	public static void main(String[] args) {
		ThisUsages2 t1 = new ThisUsages2();
		t1.message();
	}

}
