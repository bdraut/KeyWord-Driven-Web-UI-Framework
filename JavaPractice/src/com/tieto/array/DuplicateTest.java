package com.tieto.array;

//program to find duplicate element element from the string.
public class DuplicateTest {

	// static int[] arr = {1,3,5,7,8,9,5,3,0};
	public static void main(String[] args) {
System.out.println("Bhushan");
		int[] arr = { 1, 3, 5, 7, 8, 9, 5, 3, 0 };
		for (int i = 0; i < arr.length; i++)

			for (int j = i+1; j < arr.length; j++) {
				
				if (arr[i] == arr[j]) {
					System.out.println(arr[j]);
				}

			}

	}

}
