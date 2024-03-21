package com.mybank_application;

public class Transfer_Account {
	
	
	 public static void addTransferData(AbstractClass fromAccount, AbstractClass toAccount, double transferAmount, int pin, String transfer_mode) {

	        System.out.println("From Account : "+fromAccount.getAccountNumber());
	        System.out.println("To Account : "+ toAccount.getAccountNumber());
	        System.out.println("Transfer Amount : "+ transferAmount);
	        System.out.println("Transfer Mode : "+ transfer_mode);
	        System.out.println("PIN : "+pin);
	    }

}
