package com.tieto.loops;

public class NestedLoop {

	public static void main(String[] args) {
		
		for (int i=0;i<4;i++)
		{
			System.out.println("In outer loop");
			for(int j=0;j<4;j++)
			{
				System.out.println("I am in inner loop");
			}
			System.out.println("Outerloop finished..");
		}

	}

}
