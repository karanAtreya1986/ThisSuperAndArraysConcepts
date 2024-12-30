package com.learnings;

public class ThisUsages4 {

	int id = 10;

	ThisUsages4() {

		int id = 15;
	}

	void message(int id) {
		id = 36;
	}

	void message() {
		id = 36;
		System.out.println("local variable " + id);
		System.out.println("instance variable " + this.id);
	}

	public static void main(String[] args) {
		ThisUsages4 t1 = new ThisUsages4();
		// here this clearly knows that instance and local variable have same value
		// we have replaced the value of instance variable in this case.
		t1.message();
	}

}
