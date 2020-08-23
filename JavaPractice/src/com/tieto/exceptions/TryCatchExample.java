package com.tieto.exceptions;

public class TryCatchExample {

	public static void main(String[] args) {
		
		try {
			int res = 10/0;
		}
		catch(Exception e){
			
		//	int res1 = 2/0;
			 System.out.println(e);
			 System.out.println("Dude we cant devide by zero");
		}
		
		System.out.println("Rest of the code");

	}

}
