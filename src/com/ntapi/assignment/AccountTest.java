package com.ntapi.assignment;

class CurrentAccount extends Account{
	float transactionFee;
	
	void inputCurrentDetails() {
		System.out.println("Enter transaction fee :");
		transactionFee = sc.nextFloat();
	}
	
	void showCurrentDetails() {
		System.out.println("transaction fee: " + transactionFee);
	}
}


public class AccountTest {

	public static void main(String[] args) {
		SavingAccount s = new SavingAccount();
		CurrentAccount c = new CurrentAccount();
		
		System.out.println("Enter deatils of saving account: ");
		s.input();
		s.inputSavingDetails();
		
		System.out.println("Enter deatils of current account: ");
		c.input();
		c.inputCurrentDetails();
		
		System.out.println("Deatils of saving account: ");
		s.show();
		s.showSavingDetails();
		
		System.out.println("Deatils of current account: ");
		c.show();
		c.showCurrentDetails();

	}

}
