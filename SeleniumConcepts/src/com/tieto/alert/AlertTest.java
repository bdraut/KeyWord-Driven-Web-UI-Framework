package com.tieto.alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("http://www.echoecho.com/javascript4.htm");

		driver.findElement(By.name("B1")).click();
		
	//	WebDriverWait wait = new WebDriverWait(driver, 40);
	//	wait.until(aler)

		Thread.sleep(2000);

		Alert alertBox = driver.switchTo().alert();
		String alertText = alertBox.getText();
		System.out.println(alertText);
		
		Thread.sleep(2000);
		
		alertBox.accept();
		
		
	}

}
