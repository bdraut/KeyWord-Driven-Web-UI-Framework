package com.tieto.array;

//Write a program to find the minimum number in the column having maximum number in 3*3  array
/* 2 7 4
 * 5 10 11
 * 8 3 1
 * Ans should be 1
 */

public class InterQuestion1 {

	public static void main(String[] args) {
	
		int arr[][] = {{2,7,4},{5,10,11},{8,3,1}};
		int max=arr[0][0] ;
		int maxcolumn = 0;
		
		
		for(int i=0; i<3;i++)
		{
			for(int j=0 ; j<3;j++)
			{
				if (arr[i][j] > max)
				{
					max = arr[i][j];
					maxcolumn =  j ;   //column having maximum number 
				}
			}
		}
		System.out.println("Coumn number having maximum number is :" +maxcolumn);
		int minnum =arr[0][maxcolumn] ;
		int k=0;
		while (k<3)
		{
			if(arr[k][maxcolumn] < minnum )
			{
				minnum = arr[k][maxcolumn] ;
				
			}
			k++;
		}
		
		System.out.println(minnum);

		
	}

}
