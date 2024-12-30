package com.learnings;

public class ThisUsages3 {

	int id = 10;

	ThisUsages3() {

		int id = 15;
	}

	void message() {
		id = 25;
	}

	void message(int id) {
		id = 36;
		System.out.println("local variable " + id);
		System.out.println("instance variable " + this.id);
	}

	public static void main(String[] args) {
		ThisUsages3 t1 = new ThisUsages3();
		// we pass here 100
		// when it goes into method it changes to 36
		// see how this separates instance variable with method local parameters.
		t1.message(100);
	}

}
