package com.learnings;

public class StaticKeywordExample {

	// non static example

	// non static variable
	// every time object created, this ten value will be newly assigned to it.
	// so output will always be 11 for every new object.
	int count = 10;

	public StaticKeywordExample() {
		count++;
		System.out.println("count value----" + count);
	}

	public static void main(String[] args) {
		StaticKeywordExample s1 = new StaticKeywordExample();
		StaticKeywordExample s2 = new StaticKeywordExample();
		StaticKeywordExample s3 = new StaticKeywordExample();
	}

}
