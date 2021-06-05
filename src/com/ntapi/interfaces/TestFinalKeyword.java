package com.ntapi.interfaces;

//final-> can be used with data member -> constant-> mandatory to initialize
//final-> method -> can not be overridden
//final->class-> can not be extended

class SuperClass{
	
	final void m() {
		System.out.println("final m called");
		
	}
}
public class TestFinalKeyword extends SuperClass{
	
	final int data;
	TestFinalKeyword(){
		data=90;
	}
	
	void show() {
		System.out.println(data);
	}
	

	public static void main(String[] args) {
		TestFinalKeyword f = new TestFinalKeyword();
		f.show();
		f.m();

	}

}
