package com.ntapi.assignment;

public class SilverSavingAccount extends SavingAccount {
	String offerId;
	
	void inputSilverDetails() {
		System.out.println("Enter offerId :");
		offerId = sc.next();
	}
	
	void showSilverDetails() {
		System.out.println("offerId: " + offerId);
	}
	
	
	public static void main(String[] args) {
		SilverSavingAccount slv = new SilverSavingAccount();
		slv.input();
		slv.inputSavingDetails();
		slv.inputSilverDetails();
		slv.show();
		slv.showSavingDetails();
		slv.showSilverDetails();

	}

}
