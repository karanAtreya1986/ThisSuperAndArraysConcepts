package com.learnings;

class Vehicle {
	Vehicle(){
		System.out.println("parent class constructor vehicle");
	}
}
	
//when we dont extend parent class, then only child class constructor is called.
public class SuperWorking6{
	SuperWorking6(){
		System.out.println("child class constructor");
	}
	
	public static void main(String[] args) {
		SuperWorking6 s6=new SuperWorking6();
	}
}
