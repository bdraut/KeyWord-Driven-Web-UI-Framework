package com.tieto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private  By userlocator = By.id("authUser");
	private  By passlocator = By.id("clearPass");
	
	public void enterUsername(WebDriver driver , String username)
	{
		driver.findElement(userlocator).sendKeys(username);
	}
	
	public  void enterPassword(WebDriver driver , String password)
	{
		driver.findElement(passlocator).sendKeys(password);
	}
	
	//public void 

}
