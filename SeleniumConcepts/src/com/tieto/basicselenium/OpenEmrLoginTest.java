package com.tieto.basicselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class OpenEmrLoginTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://demo.openemr.io/b/openemr/interface/login/login.php?site=default");
		
		driver.findElement(By.id("authUser")).sendKeys("admin");
		driver.findElement(By.id("clearPass")).sendKeys("pass");
		
		Select Language = new Select(driver.findElement(By.name("languageChoice")));
		
		Language.selectByIndex(5);
		
		Thread.sleep(10000);
		
		driver.findElement(By.cssSelector(".btn")).click();;
		
		Actions actions = new Actions(driver);
		
	//	actions.moveToElement(driver.findElement(By.xpath("xpathExpression"))).build().perform();    // mouse over
		
		
		// for mulltiple mouse over.
		
	/*	actions.moveToElement(driver.findElement(By.xpath("xpathExpression")))
		.pause(1000)
		.moveToElement(driver.findElement(By.xpath("xpathExpression")))
		.build()
		.perform()  */
		
	}

}
