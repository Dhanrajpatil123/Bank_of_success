package com.mybank_application;

public class AccountOpeningException extends RuntimeException {
	
	public AccountOpeningException(String age_is_less) {
		
		super(age_is_less);
	}

}

