package com.learnings;

public class ThisUsages7 {

	int id;

	// calling one method from another by passing objects
	// also method overloading is happening
	void method1() {
		method1(this);
	}

	private void method1(ThisUsages7 thisUsages6) {
		System.out.println("value of id is from method is " + thisUsages6.id);
	}

	public static void main(String[] args) {
		ThisUsages7 t6 = new ThisUsages7();
		t6.method1();
	}

}
