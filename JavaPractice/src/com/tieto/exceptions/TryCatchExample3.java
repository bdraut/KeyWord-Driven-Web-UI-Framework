package com.tieto.exceptions;

// demo to handle ArrayIndexOutOfBoundsException

public class TryCatchExample3 {

	public static void main(String[] args) {
		
		int arr[] = {2,3,2,4,0,9};
		try {
			
			System.out.println(arr[15]);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Rest Of code");

	}

}
