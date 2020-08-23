package com.tieto.array;

public class SumOfMembers {

	public static void main(String[] args) {
		
		int[] arr = {2,3,4,5,2,3,4};
		
	/*	Object obj = new Object();
		obj.getClass();
		System.out.println(obj.getClass()); */
		
		
		int sum = 0;
		
		for(int i=0 ; i<arr.length ; i++)
		{
		
		sum = arr[i] + sum;
		
		}
		System.out.println("sum is "+sum);
	}

}
