package com.ntapi.assignment;

public class ThisKeyWord3 {
	 
	 int x,y;
	 float length,breadth;
	 
	 ThisKeyWord3()
	 {
	  this(0,0,4,5);
	  
	 }
	 
	 ThisKeyWord3(float l,float b)
	 {
	  this(0,0,l,b);
	 }
	 
	 ThisKeyWord3(int a,int b, float l, float br)
	 {
	  x=a;
	  y=b;
	  length=l;
	  breadth=br;
	  
	 }
	 public static void main(String[] args) {
		 ThisKeyWord3 r1=new ThisKeyWord3();
		 ThisKeyWord3 r2=new ThisKeyWord3(2,3);
		 ThisKeyWord3 r3=new ThisKeyWord3(6,7,8,9);
		 
		 System.out.println("r1 constructor values...");
		 System.out.println(r1.x);
		 System.out.println(r1.y);
		 System.out.println(r1.length);
		 System.out.println(r1.breadth);
		 
		 System.out.println("r2 constructor values...");
		 System.out.println(r2.x);
		 System.out.println(r2.y);
		 System.out.println(r2.length);
		 System.out.println(r2.breadth);
		 
		 System.out.println("r3 constructor values...");
		 System.out.println(r3.x);
		 System.out.println(r3.y);
		 System.out.println(r3.length);
		 System.out.println(r3.breadth);

	 }

	}