package com.ntapi.interfaces;

public class TestInterface implements Printable{

	public static void main(String[] args) {
		TestInterface i = new TestInterface();
		i.print();
		System.out.println(data);

	}

	@Override
	public void print() {
		System.out.println("print from TestInterface");
		System.out.println(data);
	}

}
