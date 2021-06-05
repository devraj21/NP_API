package com.ntapi.assignment;
import java.util.Scanner;

public class UserCalculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter first number: ");
		int number1 = scan.nextInt();

		System.out.println("Enter second number: ");
		int number2 = scan.nextInt();
		
		System.out.println("\nEnter you choice of calculation...");
		System.out.println("Enter 1 for Addtion:");
		System.out.println("Enter 2 for Subtraction:");
		System.out.println("Enter 3 for Multiplication:");
		System.out.println("Enter 4 for Division:");
		System.out.println("Enter 5 for Modulo:");
		
		int choice = scan.nextInt();
		System.out.println("you entered "+ choice);
		if(choice == 1) {
				int add = number1 + number2;
				System.out.println("Addition is :" + add);
		}
		else if(choice == 2) {
					int sub = number1 - number2;
					System.out.println("Subtraction is :" + sub);
		}
		else if(choice == 3) {
			int mul = number1 * number2;
			System.out.println("Multiplication is :" + mul);
		}
		else if(choice == 4) {
			int div = number1 / number2;
			System.out.println("Division is :" + div);
		}
		else if(choice == 5) {
			int mod = number1 % number2;
			System.out.println("Modulo is :" + mod);
		}
		else {
			System.out.println("Sorry you have entered wrong choice (: (:");
		}
		

	}
}
