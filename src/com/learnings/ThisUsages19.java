package com.learnings;

public class ThisUsages19 {

	// program to show that if we pass values but dont give them to instance
	// variables
	// we get their default value when we try to print the instance variables value.

	int id;
	String name;

	ThisUsages19() {
		System.out.println("default constructor");
	}

	ThisUsages19(int id, String name) {
		id = id;
		name = name;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		ThisUsages19 t18 = new ThisUsages19(1, "tiger");
		ThisUsages19 t19 = new ThisUsages19(2, "lion");
		t18.display();
		t19.display();
	}
}
