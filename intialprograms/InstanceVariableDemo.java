package com.technoelevate.intialprograms;

public class InstanceVariableDemo {

	int empId;
	String name;
	int age;
	double sal;

	public static void main(String[] args) {
		InstanceVariableDemo ivd = new InstanceVariableDemo();

		ivd.empId = 101;
	}

	public int getName() {
		return empId;
	}
}
