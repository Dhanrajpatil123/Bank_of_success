package com.mybank_application;

import java.time.LocalDate;

public class CurrentAccount extends AbstractClass{
	
	private String companyName;
	
	private String website;
	
	private String registrationNumber;
	
	
	
	
	
	
	

	public CurrentAccount() {
	}



	public CurrentAccount(String accountName, int pinNumber, double accountBalance, Privilege privilege) {
		super(accountName, pinNumber, accountBalance, privilege);
	}



	public String getCompanyName() {
		return companyName;
	}



	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}



	public String getWebsite() {
		return website;
	}



	public void setWebsite(String website) {
		this.website = website;
	}



	public String getRegistrationNumber() {
		return registrationNumber;
	}



	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	
	
	
	
	
	
	@Override
	public void open() {
		
		if(registrationNumber != null) {
			
			setActivatedDate(LocalDate.now());
			super.open();
		}
		else {
			throw new IllegalArgumentException("Account could not be open. Registration number must not be NULL");
		}
	}
	
	
	
	
	
	@Override
	public void close() {
		
		setClosedDate(LocalDate.now());
		super.close();
	}

	
	
	
	
	@Override
	public void withdraw(double amount) {
		setActive(true);
		super.withdraw(amount);
	}
	
	
	
	@Override
	public void deposite(double amount) {
		setActive(true);
		super.deposite(amount);
	}
	
	
	
	
	@Override
	public void transferAmount(AbstractClass toAccount, double transferAmount, int pin, String transfer_mode) {
		
		super.transferAmount(toAccount, transferAmount, pin, transfer_mode);
	}
	
}
