package com.tieto.logics;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] numbers = {55,65,84,25,36,75,65,35,98};
		 
		 int size = numbers.length;
		 
		 for (int i=0 ; i<size ; i++)
		 {
			// System.out.println(numbers[i]);
			  if (numbers[i] > 50)
			  {
				  System.out.println(numbers[i]);
			  }
		 }
		 
		 String[] names= { "king","queen","jack"};
		    
	     for( String name :names)
	     {
	    	 System.out.println(name);
	     }
		 
		

	}

}
