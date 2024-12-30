package com.learnings;

public class ThisUsages16 {

	// this and super used with dot notation can be used at any line inside the
	// block.
	// how we used method chaining using this keyword.
	void method1() {
		System.out.println("method 1");
		this.method2("karan");
	}

	void method2(String name) {
		System.out.println("method 2 " + name);
		this.method3();
	}

	void method3() {
		System.out.println("method 3 " + this);
	}

	public static void main(String[] args) {
		ThisUsages16 t16 = new ThisUsages16();
		t16.method1();
	}
}
