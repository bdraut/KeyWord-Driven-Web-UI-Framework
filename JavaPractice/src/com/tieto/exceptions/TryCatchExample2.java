package com.tieto.exceptions;

/*In this example we are handeling the arithmatic exception with diffrent execption that is arrayout of bound exception.
Here program will terminate and rest of code
will not execute */

public class TryCatchExample2 {

	public static void main(String[] args) {
		
		try {
			int res = 10/0;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		System.out.println("RestOfCode");
	}

}
