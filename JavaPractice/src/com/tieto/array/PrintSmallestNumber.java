package com.tieto.array;

//prograam to print smallet numer in multidimentional arrray.
public class PrintSmallestNumber {

	public static void main(String[] args) {
		int arr[][] = {{4,5},{3,8},{1,9}};
		int small = arr[0][0];
		
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<2;j++)
			{
				if (arr[0][0] > arr[i][j])
				{
					small = arr[i][j];
				
				}
			}
		}

		System.out.println("Smallest Number is "+small);
	}

}
