package com.mybank_application;

public class AccountException extends RuntimeException {

	public AccountException(String Account_Is_Inactive) {
		
		super(Account_Is_Inactive);
	}
}
