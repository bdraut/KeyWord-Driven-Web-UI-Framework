package com.tieto.strings;

public class ReverseStrindDemo {

	public static void main(String[] args) {
		String s = "Bhushan";
		String reverse = "";   // No need if we want only printing
		
		for(int i=s.length();i>0;i--)  // loop to print the string in reverse order
		{
			System.out.println(s.charAt(i-1));
			reverse = reverse + s.charAt(i-1);
		}
		
		
		System.out.println("Reversed string is  "+reverse);
		
		

	}

}
