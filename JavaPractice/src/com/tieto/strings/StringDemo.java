package com.tieto.strings;

public class StringDemo {

	public static void main(String[] args) {
		
		String a = "madam";
		String rev = "";
	   
		for (int i=0 ; i<a.length() ; i++)  //Printing string in same order
		{
		//	
		//	System.out.print(a.charAt(i));
		}
		
		
		for (int j=a.length(); j>0; j--)
		{
		//	System.out.println(a.charAt(j-1));
			rev =rev +  a.charAt(j-1);
		}
		System.out.println("Reveresed string is "+rev);
	
	
	if
		(a.equals(rev))
	{
		System.out.println("String is palindrome");
	}
	else
	{
		System.out.println("String is not palindrome...");
	}

}
}
