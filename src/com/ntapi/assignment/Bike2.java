package com.ntapi.assignment;
//super-> to refer instance variable of immediate parent class
//super and this-> can not be used in static context.
//super->to refer to method of immediate parent class
//super()-> to invoke the constructor of the immediate parent class.
class Vehicle2{
	void show() {
		System.out.println("Vehicle running: " );
	}
}
public class Bike2 extends Vehicle2 {
	void show(){ //method overriding 
		System.out.println("Bike running: " );
	}
	
	void display() {
		show();
		super.show();
	}
	public static void main(String[] args) {
		Bike2 b = new Bike2();
		b.display();
		
	}

}

