package com.ntapi.interfaces;

public interface Printable {
	int data=90; // public static final int a=9;
	abstract void print(); // public abstract by default
	//concrete method-> default/static keyword
	//to implement and support lambda function

	default void m1() { //-> may or may not be overridden
		System.out.println("m1 from Printable");
	}
	
	 static void m2() { //-> this can not be overridden
		 System.out.println("m2 from Printable");
	 }

}
