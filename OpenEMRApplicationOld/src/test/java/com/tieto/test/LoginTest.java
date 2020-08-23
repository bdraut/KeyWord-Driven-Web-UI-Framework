package com.tieto.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tieto.base.WebDriverWrapper;
import com.tieto.pages.LoginPage;

import org.testng.annotations.Test;

public class LoginTest extends WebDriverWrapper {

	@Test(priority = 2)
	public void invalidCrentialTest() {
		
		LoginPage login = new LoginPage();
	//	login.enterUsername(driver, "admin");
	//	login.enterPassword(driver, "pass");

		driver.findElement(By.id("authUser")).sendKeys("admin");
		driver.findElement(By.id("clearPass")).sendKeys("pass11");
		Select selectLanguage = new Select(driver.findElement(By.name("languageChoice")));
		selectLanguage.selectByVisibleText("English (Indian)");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		String error = driver.findElement(By.cssSelector(".alert.alert-danger.login-failure")).getText();
		Assert.assertTrue(error.contains("Invalid username or password"), "Passed");
		System.out.println(error);

	}

	@Test(priority = 1)
	public void validCrentialTest() {
		driver.findElement(By.id("authUser")).sendKeys("admin");
		driver.findElement(By.id("clearPass")).sendKeys("pass");
		Select selectLanguage = new Select(driver.findElement(By.name("languageChoice")));
		selectLanguage.selectByVisibleText("English (Indian)");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Assert.assertEquals(driver.getTitle(), "OpenEMR");
	}

	@Test
	public void linkCount() {
		Dimension linkCounta = driver.findElement(By.tagName("a")).getSize();
		System.out.println(linkCounta);
	}

}
