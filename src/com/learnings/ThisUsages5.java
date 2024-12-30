package com.learnings;

public class ThisUsages5 {

	// most common way of using this keyword.
	// constructor used to initialise the instance variable using this keyword.

	int id;

	ThisUsages5(int id) {
		this.id = id;
	}

	public static void main(String[] args) {
		ThisUsages5 t5 = new ThisUsages5(16);
		int i1 = t5.id;
		System.out.println("value of instance variable is " + i1);

	}

}
