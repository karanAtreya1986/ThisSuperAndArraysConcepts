package com.learnings;

public class ThisUsages13 {

	// will default value of id be printed or our assigned value from main
	// our value from main will be printed.

	int id;

	ThisUsages13(int id, String name) {
		this.id = id;
	}

	void display() {
		System.out.println("value of id is " + id);
	}

	public static void main(String[] args) {
		ThisUsages13 t6 = new ThisUsages13(45, "tiger");
		t6.display();
	}

}
