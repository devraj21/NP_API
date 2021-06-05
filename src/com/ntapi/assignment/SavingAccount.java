package com.ntapi.assignment;
import java.util.Scanner;

class Account{
	String accountId;
	double balance;
	Scanner sc=new Scanner(System.in);
	
	void input(){
		System.out.println("Enter Id and Balance");
		accountId =  sc.next();
		balance =  sc.nextDouble();
	}
	void show(){
		System.out.println("Id : " + accountId);
		System.out.println("Balance : " + balance);
	}
}


public class SavingAccount extends Account{
	float rateOfInterest;
	void inputSavingDetails() {
		System.out.println("Enter ROI");
		rateOfInterest = sc.nextFloat();
	}
	void showSavingDetails() {
		System.out.println("ROI : " + rateOfInterest);
	}
	public static void main(String[] args) {
		  SavingAccount s=new SavingAccount();
		  s.input();
		  s.inputSavingDetails();
		  s.show();
		  s.showSavingDetails();
		  
		 }
}
