package com.learnings;

public class ThisUsages8 {

	// we give some value to the id
	// this will print 10 in output
	int id = 10;

	void method1() {
		method1(this);
	}

	private void method1(ThisUsages8 thisUsages6) {
		System.out.println("value of id is from method is " + thisUsages6.id);
	}

	public static void main(String[] args) {
		ThisUsages8 t6 = new ThisUsages8();
		t6.method1();
	}

}
