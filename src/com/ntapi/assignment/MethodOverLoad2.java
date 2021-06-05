package com.ntapi.assignment;
//with different type of data type
public class MethodOverLoad2 {
	void sum(int a, int b) {
		System.out.println("Sum of Integer: "+(a+b));
	}
	void sum(float a, float b) {
		System.out.println("Sum of Float: "+(a+b));
	}

	public static void main(String[] args) {
		MethodOverLoad2 mol2 = new MethodOverLoad2();
		mol2.sum(5.5f, 5.5f);
		mol2.sum(5, 5);

	}

}
