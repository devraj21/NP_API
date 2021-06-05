package com.ntapi.abstraction;

public abstract class A {
	int a;
	static int b =10;
	A(){
		System.out.println("A constructor called");
	}
	
	void m1(){
		System.out.println("m1 from A called");
	}
	
	static void m2(){
		System.out.println("m2 from A called");
	}
	
	abstract void m3();
	
	public static void main(String[] args) {
		m2();
		//System.out.println(b);

	}


}
