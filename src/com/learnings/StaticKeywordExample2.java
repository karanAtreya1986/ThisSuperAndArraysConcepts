package com.learnings;

public class StaticKeywordExample2 {

	// static example

	// static variable
	// so every time you create object, this count will hold updated value.
	// so output will always be 11,12,13,.... for every new object.
	static int count = 10;

	public StaticKeywordExample2() {
		count++;
		System.out.println("count value----" + count);
	}

	public static void main(String[] args) {
		StaticKeywordExample2 s1 = new StaticKeywordExample2();
		StaticKeywordExample2 s2 = new StaticKeywordExample2();
		StaticKeywordExample2 s3 = new StaticKeywordExample2();
	}

}
