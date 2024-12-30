package com.learnings;

public class ThisExample4 {

	public static void main(String[] args) {

		// every object and its corresponding this will have same memory address
		ThisExample4 t1 = new ThisExample4();
		System.out.println("value of the object1 is " + t1);
		t1.display();

		ThisExample4 t2 = new ThisExample4();
		System.out.println("value of the object2 is " + t2);
		t2.display();
	}

	void display() {
		System.out.println("this keyword value is " + this);
	}

}
