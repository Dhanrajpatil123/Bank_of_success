package com.mybank_application;

import java.time.LocalDate;

public class SavingAccount extends AbstractClass{
	

	private LocalDate dateOfBirth;
	
	private String gender;
	
	private long phoneNumber;

	
	
	
	
	
	
	public SavingAccount() {
	}





	public SavingAccount( String accountName, int pinNumber, double accountBalance,
			Privilege privilege) {
		super(accountName, pinNumber, accountBalance, privilege);
	}





	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}




	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}




	public String getGender() {
		return gender;
	}




	public void setGender(String gender) {
		this.gender = gender;
	}




	public long getPhoneNumber() {
		return phoneNumber;
	}




	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	
	@Override
	public void open() {
	
		
		 if (dateOfBirth.plusYears(18).isAfter(LocalDate.now())){
           throw new AccountOpeningException("Your age is less");
       }

       if (dateOfBirth.plusYears(18).isBefore(LocalDate.now())){

           setActive(true);
           setActivatedDate(LocalDate.now());
       }
		
		super.open();
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
	public void transferAmount(AbstractClass toAccount, double transferAmount, int pin, String transferMode) {
		
		super.transferAmount(toAccount, transferAmount, pin, transferMode);
	}
}
	
	
	

