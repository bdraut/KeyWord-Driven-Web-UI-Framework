package com.tieto.basicselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MagentoValidCredentials {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver  driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://magento.com");
		
		driver.findElement(By.linkText("My Account")).click(); // wait until page load.
		
		Thread.sleep(6000);
		
		driver.findElement(By.id("email")).sendKeys("balaji0017@gmail.com");
		Thread.sleep(6000);
		driver.findElement(By.id("pass")).sendKeys("welcome@123");
		driver.findElement(By.cssSelector(".action.login.primary.ml-10")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Log Out")));
		
		String title = driver.getTitle();
		System.out.println(title);
		
	}

}