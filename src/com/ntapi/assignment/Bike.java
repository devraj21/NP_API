package com.ntapi.assignment;
//super-> to refer instance variable of immediate parent class
//super and this-> can not be used in static context.
//super->to refer to method of immediate parent class
class Vehicle{
	int speed = 70;
}
public class Bike extends Vehicle {
	int speed = 90;
	int newSpeed = super.speed;
	void show() {
		System.out.println("speed of bike: " + speed);
		System.out.println("speed of Vehicle: " + super.speed);
	}
	public static void main(String[] args) {
		Bike b = new Bike();
		b.show();
		
		System.out.println(b.speed);
		System.out.println("new speed is: " + b.newSpeed);

	}

}
