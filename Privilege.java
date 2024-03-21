package com.mybank_application;

public enum Privilege {
	
	PRIMIUN(100000),
	GOLD(50000),
	SILVER(25000);

	
	private final double associatedAmount;
	
	Privilege(int associatedAmount) {
		
		this.associatedAmount = associatedAmount;
	}

	
	
	public double getAssociatedAmount() {
		return associatedAmount;
	}


}
