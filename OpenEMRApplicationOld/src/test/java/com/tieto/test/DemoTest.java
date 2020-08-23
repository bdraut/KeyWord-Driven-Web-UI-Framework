package com.tieto.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoTest {
	@DataProvider
	public Object[][] filformData()
	{
		Object[][] main = new Object[3][2];
		main[0][0] = "john";
		main[0][1] = "john123";
		main[1][0] = "peter";
		main[1][1] = "peter123";
		main[2][0] = "paul";
		main[2][1] = "apul123";
				
		return main;
	}

	@Test(dataProvider = "filformData")
	public void fillformTest(String username, String password) {
		
		System.out.println(username+password);

	}
	
	@DataProvider
	public Object[][] invalidData()
	{
		Object[][] main=new Object[2][4];
		main[0][0]="john";
		main[0][1]="john123";
		main[0][2]="American";
		main[0][3]="nvalid username or password";
		
		main[1][0]="peter";
		main[1][1]="peter123";
		main[1][2]="paul";
		main[1][3]="nvalid username or password";
		
		return main;
	}
	
	@Test(dataProvider = "invalidData")
	public void invalidData(String username,String password,String Language,String message)
	{
		System.out.println(username+password+Language+message);
		}
}
