package com.ntapi.abstraction;
//abstract method -> method without body or just declaration;
//whenever a class has at least one abstract method, then class should also be declared abstract.
//which can not be instantiated, they need to be extended.
// abstract class may or may not have abstract method.
//abstract method of super class should be overridden by subclass
//or subclass should be declared as abstract.

abstract class Shape{
	abstract void draw();
}

class Circle extends Shape{
	@Override //annotation
	void draw() {
		System.out.println("Drawing Circle");
	}
	
}

class Rectangle extends Shape{
	void draw() {
		System.out.println("Drawing Rectangle");
	}
	
}

abstract class Triangle extends Shape{
	
}

class UpperTriangle extends Shape{

	@Override
	void draw() {
		System.out.println("Drawing UpperTriangle");
		
	}
	
}

class LowerTriangle extends Shape{

	@Override
	void draw() {
		System.out.println("Drawing LowerTriangle");
		
	}
	
}

public class TestAbstractMethod {

	public static void main(String[] args) {
		Circle c = new Circle();
		Rectangle r =  new Rectangle();
		UpperTriangle ut = new UpperTriangle();
		LowerTriangle lt = new LowerTriangle();
		c.draw();
		r.draw();
		ut.draw();
		lt.draw();

	}

}
