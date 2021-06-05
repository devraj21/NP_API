package com.ntapi.assignment;
//method overriding and runtime polymorphism

class Shape{
	void draw(){
		System.out.println("Drawing no shape");
	}
	
}

class Circle extends Shape{
	void draw(){ //method overriding
		System.out.println("Drawing Circle");
	}
	
}

class Rectangle extends Shape{
	void draw(){ //method overriding
		System.out.println("Drawing Rectangle");
	}
	
}

class Triangle extends Shape{
	void draw(){ //method overriding
		System.out.println("Drawing Triangle");
	}
	void m() {
		System.out.println("m from Triangle");
	}
	
}

public class TestMethodOveriding {

	public static void main(String[] args) {
		Shape s; //s= null
		s = new Shape(); //Shape s=new Shape()
		s.draw();
		s= new Circle(); // Shape s = new Circle()
		s.draw();
		s= new Rectangle();
		s.draw();
		s= new Triangle();
		s.draw();
		Triangle t = new Triangle();
		t.m();
//with upcasting we can call only overridden methods.
	}

}
