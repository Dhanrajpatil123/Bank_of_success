package com.mybank_application;

import java.time.LocalDate;

public abstract class AbstractClass implements Account{
	
	private long accountNumber;
	
	private String accountName;
	
	private int pinNumber;
	
	private double accountBalance;
	
	protected Privilege privilege;
	
	private boolean isActive;
	
	private LocalDate activatedDate;
	
	private LocalDate closedDate;
	
	
	
	
	
	

	public AbstractClass(String accountName, int pinNumber, double accountBalance,
			Privilege privilege) {
		
		super();
		
		this.accountNumber = IdGenerator.getAccountNumber();
		this.accountName = accountName;
		this.pinNumber = pinNumber;
		this.accountBalance = accountBalance;
		this.privilege = privilege;
		this.isActive = false;
		this.activatedDate = null;
		this.closedDate = null;
	}
	
	
	



	public AbstractClass() {
//		super();
	}






	public long getAccountNumber() {
		return accountNumber;
	}



	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}



	public String getAccountName() {
		return accountName;
	}



	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}



	public int getPinNumber() {
		return pinNumber;
	}



	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}



	public double getAccountBalance() {
		return accountBalance;
	}



	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}



	public Privilege getPrivilege() {
		return privilege;
	}



	public void setPrivilege(Privilege privilege) {
		this.privilege = privilege;
	}



	public boolean isActive() {
		return isActive;
	}



	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}



	public LocalDate getActivatedDate() {
		return activatedDate;
	}



	public void setActivatedDate(LocalDate activatedDate) {
		this.activatedDate = activatedDate;
	}



	public LocalDate getClosedDate() {
		return closedDate;
	}



	public void setClosedDate(LocalDate closedDate) {
		this.closedDate = closedDate;
	}

	
	
	@Override
	public void open() {
		isActive = true;
		activatedDate = LocalDate.now();
		System.out.println("Congratulations Your Account Is Successfully Opened");
	}
	
	
	@Override
	public void close() {
		isActive = false;
		closedDate = LocalDate.now();
	}
	
	
	
	
	@Override
	public void withdraw(double amount) {
		
		if(isActive()) {
			
			if(amount > getAccountBalance()) {
				throw new InsufficientBalanceException("Insufficient Balance");
			}
			
			if(amount < getAccountBalance()) {
				accountBalance -= amount; 
			}
			
		}
	}
	
	
	
	@Override
	public void deposite(double amount) {


		if(isActive()) {
			
			accountBalance += amount;
		}
	}
	
	
	
	
	
	
	
	
	
	
	public void transferAmount(AbstractClass toAccount, double transferAmount, int pin, String transfer_mode) {

//		if(!isActive() || toAccount.isActive()) {
//			throw new AccountException("Account Is Inactive");
//		}
		
		if (transferAmount > getAccountBalance()){
	            throw new InsufficientBalanveException("Insufficient Balance");
	     }

	  
		if (transferAmount <= 0){
	            throw new IllegalArgumentException("Amount is too less put correct amount");
	     }


		if (pinNumber != getPinNumber()){
	            throw new IllegalArgumentException("Wrong PIN number");
	     }
	        
		
		double transfer_Limit = getTransmitLimit(privilege);

        if (transferAmount > transfer_Limit){
            throw new InsufficientBalanveException("Transfer transferAmount is more as per the privilege type");
        }

        
        
        
        withdraw(transferAmount);
        toAccount.deposite(transferAmount);
        

//        Transfer_Account.addTransferData(this, toAccount, transferAmount, pinNumber, transfer_mode);
//        Transfer_Account.addTransferData(this, toAccount, transferAmount, pinNumber, transfer_mode);
        
        System.out.println("Amount Is Successfully Transfer");

	}
	


		public double getTransmitLimit(Privilege privilege){

			switch (privilege){

        		case PRIMIUN :
        			return 100000;
        		
        		case GOLD:
        			return 50000;

        		case SILVER:
        			return 25000;

        		default:
        			return 0.0d;
			}
		}
	
	
	
	
}
