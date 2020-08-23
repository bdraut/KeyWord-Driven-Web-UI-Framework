package com.tieto.array;

public class EvenOdd {

	public static void main(String[] args) {
		int[] arr = {2,4,3,7,8,5};
		
		System.out.println("EVEN numbers are***");
		for (int i=0 ; i<arr.length ; i++)
		{
			
			if (arr[i]%2 == 0)
			{
				System.out.println(arr[i]);
			}
		}
		
		System.out.println("Oddd numbers are");
		{
			for (int i=0 ; i<arr.length ; i++)
			{
				if (arr[i]%2 != 0)
				{
					System.out.println(arr[i]);
				}
			}
		}
		

	}

}
