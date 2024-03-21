package com.mybank_application;

public enum TransferMode {

	NEFT,
	IMPS,
	RTGS;
	
	private String mode;
	
	private TransferMode() {
		
		this.mode = mode;
	}
	
	
	public String getMode() {
		return mode;
	}
}
