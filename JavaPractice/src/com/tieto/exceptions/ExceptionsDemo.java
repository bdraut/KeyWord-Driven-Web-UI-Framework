package com.tieto.exceptions;

public class ExceptionsDemo {
	int a=10;
	static int res;
	public void arithTest()
	{
		try {
		 res = 10/0;
	//	return res;
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
	//	return res;
	}

	public static void main(String[] args) {
		
		System.out.println(res);
		 
		ExceptionsDemo e = new ExceptionsDemo();
		e.arithTest();
		System.out.println("Test passed");
	}

}
