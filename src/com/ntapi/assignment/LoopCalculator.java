package com.ntapi.assignment;
import java.util.Scanner;


public class LoopCalculator {
private static final boolean True = false;

	// menu() function definition.
	public static void menu() {
		System.out.println("Enter the choice below...\r\n"
						+ " 1. Addition\r\n"
						+ " 2. Substraction\r\n"
						+ " 3. Multiplication\r\n"
						+ " 4. Division\r\n"
						+ " 5. Modulo\r\n"
						+ " 6. Exit\r\n"
						+ "");
		}
		


//addition() function definition.
	public static int addition(int number1, int number2) {
		return number1 + number2;
	}

// substraction() function definition.
	public static int substraction(int number1, int number2) {
		return number1 - number2;
	}

// multiplication() function definition.
	public static int multiplication(int number1, int number2) {
		return number1 * number2;
	}

// division() function definition.
	public static int division(int number1, int number2) {
		if (number2 == 0){
			System.out.println("number2 cann't be zero: ");
			return 0;
		}
		else {
			return number1 / number2;
		}
	}
// modulo() function definition.	
	public static int modulo(int number1, int number2) {
		return number1 % number2;
	}

// calculator() function definition.
	public static void calculator(int choice, int number1, int number2) {
		switch(choice) {
		case 1:
			int add = addition(number1, number2);
			System.out.println("Addition is :" + add);
			break;
		case 2:
				int sub = substraction(number1, number2);
				System.out.println("Substraction is :" + sub);
				break;
		case 3:
			int mul = multiplication(number1, number2);
			System.out.println("Multiplication is :" + mul);
			break;
		case 4:
			int div = division(number1, number2);
			System.out.println("Division is :" + div);
			break;
		case 5:
			int mod = modulo(number1, number2);
			System.out.println("Modulo is :" + mod);
			break;
		default:
			System.out.println("No calculation happened");
		}
	}
	
// main method starts here.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		menu();
		int choice = scan.nextInt();
		System.out.println("Your choice is: "+ choice);
		if(choice == 6) {
			System.out.println("Ok, We're exiting now.." );
		}
		else if(choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5){
		System.out.println("Enter first number: ");
		int number1 = scan.nextInt();
	
		System.out.println("Enter second number: ");
		int number2 = scan.nextInt();
	
		System.out.println("The number you entered are: "+ number1 + " & " + number2);
		calculator(choice, number1, number2);
		}
		else{
			System.out.println("Sorry, wrong choice entered, try again" );
			do{
			menu();
			choice = scan.nextInt();
			System.out.println("Your choice is: "+ choice);
			if(choice == 6) {
				System.out.println("Ok, We're exiting now.." );
			}
			else if(choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5){
			System.out.println("Enter first number: ");
			int number1 = scan.nextInt();
		
			System.out.println("Enter second number: ");
			int number2 = scan.nextInt();
		
			System.out.println("The number you entered are: "+ number1 + " & " + number2);
			calculator(choice, number1, number2);
			}
			}
			while(choice > 7 && choice < 0);
		}
	}
}
