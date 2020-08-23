package com.tieto.interfacep;

/**
 * @author rauttbhu
 *
 */
public class BankTest {
	
	public void payment1()
	{
		System.out.println("Payment in Bank Test class");
	}

	public static void main(String[] args) {

	//	Bank b = new BankTest();
		Bank b = new ICICI();
		Bank b1 = new SBI();
		BankTest bt = new BankTest();
		ICICI i = new ICICI();
	//	i.withdraw();
		b.withdraw();
		b1.withdraw();
		b1.payment();
		
		bt.payment1();

	}

}
