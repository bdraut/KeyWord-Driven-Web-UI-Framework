package com.tieto.array;

//Program to print smallest number from single dim array.

public class SmallestNumberPrint {
	


	public static void main(String[] args) {
		
		int arr [] = {3,9,3,1,3,7,8};
		int small=arr[0];
		for(int i=0; i<arr.length;i++)
		{
			
				if (arr[0]>arr[i])
						{
						small = arr[i];
						}
				
			
			
		}
		
		System.out.println("Current smallest number is :"+small);

	}

}
