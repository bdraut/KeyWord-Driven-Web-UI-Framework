package com.tieto.interfacep;

public class SBI implements Bank {

	@Override
	public void withdraw() {
		
		System.out.println("Withdrawn from SBI !!!");
	}

	@Override
	public void payment() {
	
		System.out.println("PAid in SBI");
		
	}

	
}
