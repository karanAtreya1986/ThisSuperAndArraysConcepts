package com.learnings;

public class ThisUsages17 {

	// this and super used with dot notation can be used at any line inside the
	// block.
	// how we used method chaining using this keyword.
	void method1() {
		this.method2("karan");
		System.out.println("method 1");
		
	}

	void method2(String name) {
		this.method3();
		System.out.println("method 2 " + name);
		
	}

	void method3() {
		System.out.println("method 3 " + this);
	}

	public static void main(String[] args) {
		ThisUsages17 t16 = new ThisUsages17();
		t16.method1();
	}
}
