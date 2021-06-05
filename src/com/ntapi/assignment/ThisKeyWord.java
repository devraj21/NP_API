package com.ntapi.assignment;
// this keyword is used to refer to the instance variable.
// this keyword refers to the current class object
public class ThisKeyWord {
	int i = 20;
	
	void m() {
		int i = 60;
		System.out.println(i);
		System.out.println(this.i);
	}
	public static void main(String[] args) {
		ThisKeyWord ths= new ThisKeyWord();
		ths.m();

	}

}
