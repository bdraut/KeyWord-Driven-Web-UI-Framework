package com.tieto.assignmentday3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Redbussignin {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications"); 
		
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//i[@id=\'i-icon-profile\']")).click();
		
		driver.findElement(By.xpath("//li[@id='signInLink']")).click();
		
		Thread.sleep(5000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='modalIframe']")));
		
	//	driver.findElement(By.partialLinkText("Generate")).click();;
		
	//	System.out.println("clicked");
		
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("9890913492");

	}

}
