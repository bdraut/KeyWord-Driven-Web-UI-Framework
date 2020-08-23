package com.tieto.table;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");

		String name1 = driver.findElement(By.xpath("//table[@id='example']/tbody/tr[1]/td[2]")).getText();

		// System.out.println(name1);

		for (int i = 1; i <= 10; i++) {
			String name = driver.findElement(By.xpath("//table[@id='example']/tbody/tr[" + i + "]/td[2]")).getText();

			System.out.println(name);
		}

	}

}
