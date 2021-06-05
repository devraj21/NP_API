package com.ntapi.abstraction;

public class B extends A {
	 
	B(){
		super(); // is called by sub class
		System.out.println("B Constructor called");
	}

	@Override
	void m3() {
		System.out.println("m3 from B called");
		
	}
	
	public static void main(String[] args) {
		B b=new B();
		b.m1();
		b.m3();
		m2();
		//System.out.println(b.a);
		System.out.println(b.b);

	}


}
