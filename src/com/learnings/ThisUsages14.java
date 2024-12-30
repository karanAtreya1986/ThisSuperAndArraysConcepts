package com.learnings;

public class ThisUsages14 {

	// now we did not assign value of the variable to instance
	// so default value will be printed which will be zero.

	int id;

	ThisUsages14(int id, String name) {

	}

	void display() {
		System.out.println("value of id is " + id);
	}

	public static void main(String[] args) {
		ThisUsages14 t6 = new ThisUsages14(45, "tiger");
		t6.display();
	}

}
