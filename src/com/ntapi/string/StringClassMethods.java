package com.ntapi.string;

public class StringClassMethods {

	public static void main(String[] args) {
		String s1 = "Welcome";
		String s2 =  "Hello How Are You";
		String s3 =  "Bad-Luck";
		
		System.out.println(s1.charAt(2));//1
		System.out.println(s1.indexOf('l'));//2
		System.out.println(s2.contains("Are"));//true
		System.out.println(s1.length());//7
		System.out.println(s2.substring(6));//How Are You
		System.out.println(s2.substring(7,9));//ow
		System.out.println(s1.startsWith("We"));//true
		System.out.println(s1.endsWith("hello"));//false
		System.out.println(s3.replace("Bad", "Good"));//Good-Luck
		System.out.println(s1.toUpperCase());//WELCOME
		System.out.println(s1.toLowerCase());//welcome


	}

}
