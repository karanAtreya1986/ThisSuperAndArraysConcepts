package com.learnings;

public class ExplicitConstructorChaining {

	// explicit constructor chaining.
	// how one constructor can call another constructor in the same class using this
	// keyword.

	ExplicitConstructorChaining() {
		this("titan");
		System.out.println("first constructor calling second constructor");
	}

	public ExplicitConstructorChaining(String string) {
		System.out.println("second constructor and called from first " + string);
	}

	public static void main(String[] args) {
		ExplicitConstructorChaining e1Chaining = new ExplicitConstructorChaining();
	}

}
