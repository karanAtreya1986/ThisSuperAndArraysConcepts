package com.learnings;

public class ExplicitConstructorChaining2 {

	// Job of constructor-
	// Initialize non static instance members.

	ExplicitConstructorChaining2() {

		System.out.println("first constructor calling second constructor");
		// this has to be the first line in constructor
		// else compile error
		// Constructor call must be the first statement in a constructor
		this("titan");
	}

	public ExplicitConstructorChaining2(String string) {
		System.out.println("second constructor and called from first " + string);
	}

	public static void main(String[] args) {
		ExplicitConstructorChaining2 e1Chaining = new ExplicitConstructorChaining2();
	}

}
