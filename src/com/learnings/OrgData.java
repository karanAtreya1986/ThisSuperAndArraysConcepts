package com.learnings;

public class OrgData {

	// example of using static and non static block.

	// non static
	int employeeId;
	String name;

	// static
	static String companyName;

	// constructor to initialise non static field
	public OrgData(int employeeid, String name) {
		this.employeeId = employeeid;
		this.name = name;
	}

	// static initialiser block
	// runs even before main data
	// class level data
	static {
		System.out.println("first block before main");
		companyName = "abcd corporate";
	}

	// non static method
	void display() {
		System.out.println("employee id --" + employeeId + "name is --" + name + " org name is -- " + companyName);
	}

	public static void main(String[] args) {
		System.out.println("main method --");
		OrgData o1 = new OrgData(123123, "alison tiger");
		OrgData o2 = new OrgData(12, "lion king");
		OrgData o3 = new OrgData(54654656, "usa india");

		o1.display();
		o2.display();
		o3.display();
		System.out.println();
	}

}
