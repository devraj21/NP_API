package com.ntapi.assignment;
//super-> to refer instance variable of immediate parent class
//super and this-> can not be used in static context.
//super->to refer to method of immediate parent class
//super()-> to invoke the constructor of the immediate parent class.
class Vehicle3{
	Vehicle3() {
		this("hello");
		System.out.println("Vehicle running inside default constructor: " );
	}
	Vehicle3(String s) {
		System.out.println("Vehicle running inside parameterise constructor: " );
	}
}
public class Bike3 extends Vehicle3 {
	Bike3(){
		super("Hello"); //invoke the constructor of the immediate parent class
		System.out.println("Bike running: " );
		
	}
	

	public static void main(String[] args) {
		Bike3 b = new Bike3();
		
	}

}

