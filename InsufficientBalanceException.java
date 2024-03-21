package com.mybank_application;

public class InsufficientBalanceException extends RuntimeException {

	public InsufficientBalanceException(String insufficient_balance_exception) {
		
		super(insufficient_balance_exception);
	}
}
