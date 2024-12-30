package com.learnings;

public class ExplicitConstructorChaining4 {

	// calling non argument constructor from argument constructor.

	ExplicitConstructorChaining4() {
		System.out.println("first constructor called from second parameterised constructor");
	}

	public ExplicitConstructorChaining4(String string) {
		this();
		System.out.println("second parameter constructor calling first constructor " + string);
	}

	public static void main(String[] args) {

		// you can call specific argument constructor also.
		ExplicitConstructorChaining4 e1Chaining = new ExplicitConstructorChaining4("tiger");
	}

}
