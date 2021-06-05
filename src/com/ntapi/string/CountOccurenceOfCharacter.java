package com.ntapi.string;
import java.util.Scanner;

public class CountOccurenceOfCharacter {

	public static void main(String[] args) {
		String s;
		char ch, c;
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		s=sc.next();
		System.out.println("Enter a character");
		ch=sc.next().charAt(0);
		sc.close();
		for(int i=0; i<s.length(); i++) {
			c=s.charAt(i);
			if(ch==c) {
				count++;
			}
		}
		
		System.out.println("The normal for loop using charAt()");
		System.out.println(ch +" occurs "+ count +" time");
		
		count=0;
		
		char ar[]=s.toCharArray();
		for(char r:ar) {
			if(r==ch) {
				count++;
			}
		}
		System.out.println("The extended for loop using toCharArray()");
		System.out.println(ch +" occurs "+ count +" time");
	}

}
