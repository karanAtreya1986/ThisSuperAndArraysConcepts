package com.learnings;

public class ThisExample3 {

	public static void main(String[] args) {
		ThisExample3 t1 = new ThisExample3();
		System.out.println("value of the object is " + t1);
		t1.display();
		// we cannot try to access this and super using object also
		// this and super - no relation to static
		// compile error - t1 cannot be resolved to a type
		System.out.println("value of this keyword is " + t1.this);
	}

	void display() {
		System.out.println("this keyword value is " + this);
	}

}
