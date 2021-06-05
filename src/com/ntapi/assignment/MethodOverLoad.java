package com.ntapi.assignment;

public class MethodOverLoad {
	void area(float r) {
		System.out.println("Area of circle: "+(3.14*r*r));
	}
	void area(float l, float b) {
		System.out.println("Area of Rectangle: "+(l*b));
	}
	void area(float pt, float b, float h) {
		System.out.println("Area of circle: "+(pt*b*h));
	}

	public static void main(String[] args) {
		MethodOverLoad mol = new MethodOverLoad();
		mol.area(3.5f);
		mol.area(2.5f, 5.5f);
		mol.area(0.5f, 3f, 0.5f);

	}

}
