package com.tieto.logics;

public class LogicDemo {

	public static void main(String[] args) {
		String browserName = "ch1";
		
		if (browserName == "ch" || browserName == "test")  // == is case sensative comparison
		{
			System.out.println("launching chrome");
		}
		
		else if (browserName == "ff")  // == is case sensative comparison
		{
			System.out.println("launching fireFox");
		}
		
		else if (browserName == "ie")  // == is case sensative comparison
		{
			System.out.println("launching Internet explorer");
		}
		else
			
		{
			System.out.println("launching nothing ");
		}
		
		int number = 201;
		
		if (number > 100 && number < 200)
		{
			System.out.println("excuetd");
		}


	}

}
