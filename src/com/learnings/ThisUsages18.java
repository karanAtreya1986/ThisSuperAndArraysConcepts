package com.learnings;

public class ThisUsages18 {

	// simple program to display this working and how the values are assigned from
	// local to instance variables.

	int id;
	String name;

	ThisUsages18() {
		System.out.println("default constructor");
	}

	ThisUsages18(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		ThisUsages18 t18 = new ThisUsages18(1, "tiger");
		ThisUsages18 t19 = new ThisUsages18(2, "lion");
		t18.display();
		t19.display();
	}
}
