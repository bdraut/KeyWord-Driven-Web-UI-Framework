package com.tieto.multipletab;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Citibanktest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.online.citibank.co.in/products-services/online-services/internet-banking.htm");
		driver.findElement(By.linkText("APPLY FOR CREDIT CARDS")).click();

		// driver.quit(); //close all thes sessions

		Thread.sleep(5000);

		String parent = driver.getWindowHandle();
		System.out.println("sessionID is " + parent);

		Set<String> windows = driver.getWindowHandles();

		for (String win : windows) {
			System.out.println(win);
			driver.switchTo().window(win);
			String title = driver.getTitle();
			System.out.println(title);

			if (title.equals("Credit Card Application Online, Apply Now - Citi India")) {
				// stop iteration
				break;
			}
		}

		// click on travel
		driver.findElement(By.linkText("Travel")).click();
		System.out.println("clicked on travel");

		driver.close();

		driver.switchTo().window(parent);
		System.out.println("Parent title is " + driver.getTitle());
	}

}
