package com.mybank_application;

public class InsufficientBalanveException extends RuntimeException {

	public InsufficientBalanveException(String insufficientBalance) {
        super(insufficientBalance);
    }
}
