package com.tieto.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.tieto.base.WebDriverWrapper;

public class AddPatientTest extends WebDriverWrapper {
	
	WebDriver driver;
	
	@Test
	public void createPatientTest ()
	{

		driver.findElement(By.id("authUser")).sendKeys("admin");
		driver.findElement(By.id("clearPass")).sendKeys("pass11");
		Select selectLanguage = new Select(driver.findElement(By.name("languageChoice")));
		selectLanguage.selectByVisibleText("English (Indian)");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//Fill patient
		
		//varify
	}

}
