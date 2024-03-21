package com.mybank_application;

public interface Account {
	
	void open();
	
	void close();
	
	void withdraw(double amount);
	
	void deposite(double amount);
	
}
