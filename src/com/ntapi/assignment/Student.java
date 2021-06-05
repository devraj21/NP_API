package com.ntapi.assignment;
//construction overloading.
public class Student {
	 int id;//instance variable
	 String name;////instance variable
	 //constructor overloading
	 
	 Student()//constructor-default->without parameters
	 {
	  System.out.println("constructor called");
	  id=10;
	  name="pqr";
	 }
	 
	 Student(int i,String n)//parametrised contructor
	 {
	  id=i;
	  name=n;
	 }
	 
	 void show()
	 {
	  System.out.println(id);
	  System.out.println(name);
	 }

	 public static void main(String[] args) {
	  Student s1=new Student(1,"abc");//instantiation->object creation
	  Student s2=new Student(2,"xyz");
	  Student s3=new Student();
	  //instance->object
	  //ClassName refVar=new ClassName()
	  //Sacnner sc=new Scanner(System.in);
	  s1.show();
	  s2.show();
	  s3.show();
	  //Student.input();
	  
	 }

	}

