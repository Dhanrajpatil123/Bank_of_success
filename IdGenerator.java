package com.mybank_application;

public class IdGenerator {

	private static long accNumber = 1000;
	
	public static synchronized long getAccountNumber() {
        return ++accNumber;
    }
}
