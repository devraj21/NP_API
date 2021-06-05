package com.ntapi.interfaces;

public class SampleTest implements Printable, Showable{

	public static void main(String[] args) {
		SampleTest s = new SampleTest();
		s.print();
		System.out.println(Printable.data);
		s.show();
		System.out.println(Showable.data);
		s.m1();
		Printable.m2();

	}

	@Override
	public void m1() {
		System.out.println("m1 from sample");
		//System.out.println(data);
		
	}

	@Override
	public void print() {
		System.out.println("print from sample");
		//System.out.println(data);
		
	}

	@Override
	public void show() {
		System.out.println("show from sample");
		
	}

}
