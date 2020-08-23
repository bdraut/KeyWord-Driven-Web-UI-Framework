package com.tieto.logics;

public class LogicDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks = 81;
		
		if(marks >= 90 && marks <= 100)
		{
			System.out.println("Garde A");
		}
		else if (marks >= 80 && marks < 90)
		{
			System.out.println("Garde B");
		
		}
		else if (marks >= 70 && marks < 80)
		{
			System.out.println("Garde C");
		
		}
		else if (marks >= 60 && marks < 80)
		{
			System.out.println("Garde D");
		
		}
		else if (marks < 60)
		{
			System.out.println("Passed without grade");
		}

	}

}
