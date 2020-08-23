package com.tieto.realtimeP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestScript extends Util{
	
	static By username_locator = By.xpath("//input[@name='uid']");
	static By password_locator = By.name("password");
	static  WebDriver driver;
	
	public TestScript()
	{
		this.driver = driver;
	}
	
	@BeforeTest
	public static void setup()
	{
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	System.out.println("Diver initialised");
	
	}
	
	@Test
	public void login(WebDriver driver)
	{
		driver.get(BASEURL);
		driver.findElement(username_locator).sendKeys(Util.USERNAME);  //username entered
		System.out.println("Username entered");
		
		driver.findElement(password_locator).sendKeys(Util.PASSWORD); //password entered
		System.out.println("Password entered");	
	}
	
	
	
	

}
