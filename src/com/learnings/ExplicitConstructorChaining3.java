package com.learnings;

import java.util.Formatter.BigDecimalLayoutForm;

public class ExplicitConstructorChaining3 {

	ExplicitConstructorChaining3() {
		this("karan");
		System.out.println("first constructor calling second constructor");
	}

	public ExplicitConstructorChaining3(String string) {
		System.out.println("second constructor and called from first " + string);
	}

	public static void main(String[] args) {

		// you can call specific argument constructor also.
		ExplicitConstructorChaining3 e1Chaining = new ExplicitConstructorChaining3("tiger");
	}

}
