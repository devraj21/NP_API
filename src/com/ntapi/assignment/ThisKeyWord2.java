package com.ntapi.assignment;
// this()-> keyword is used to refer to the instance variable.
// this()-> keyword refers to the current class object
// this()-> keyword to invoke constructor from another constructor.
public class ThisKeyWord2 {
	ThisKeyWord2(){
		this("Devraj");
		System.out.println("Default constructor");
	}
	ThisKeyWord2(String s){
		//this();
		System.out.println("Parameterised constructor " + s);
	}
	
	public static void main(String[] args) {
		String Name = "Devraj";
		//ThisKeyWord2 ths= new ThisKeyWord2();
		ThisKeyWord2 ths2= new ThisKeyWord2(Name);
	}

}
