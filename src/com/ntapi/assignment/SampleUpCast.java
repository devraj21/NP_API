package com.ntapi.assignment;

public class SampleUpCast {
	//factory method
	Shape create(){ // Return object of Circle/Rectangle/Triangle type
		int choice;
		choice = 2;
		System.out.println("Enter 1 for Circle");
		System.out.println("Enter 2 for Rectangle");
		System.out.println("Enter 3 for Triangle");
		if(choice == 1) {
			Circle c = new Circle();
			return c;
		}
		else if(choice == 2) {
			return new Rectangle(); //anonymous object.
		}
		else if(choice == 3) {
			return new Triangle(); //anonymous object.
		}
		else
			return new Shape();
		
	}

	public static void main(String[] args) {
		SampleUpCast s =  new SampleUpCast();
		Shape obj = s.create();
		obj.draw();

	}

}
