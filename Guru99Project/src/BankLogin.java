

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



//import com.sun.tools.javac.util.Assert;

public class BankLogin extends Util {
	
	public BankLogin() {
		//super();
		this.driver = driver;
	}


	 WebDriver driver;
	public void login(driver) {
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr277577");
		System.out.println("UserName entered");
		driver.findElement(By.name("password")).sendKeys("ehyqerA");
		System.out.println("PasswordEnterd");
		driver.findElement(By.cssSelector("input[type='submit']")).click();

	//	Thread.sleep(5000);

		String NewPageTitle = driver.getTitle();

		System.out.println(NewPageTitle);
	}
	

	public static void main(String[] args) throws InterruptedException {
		

		Util u = new Util();
		BankLogin b = new BankLogin();
		u.initDriver();
	b.login();
		
		
	//	assertTrue(NewPageTitle.contains("Guru99 Bank Manager"));
			
	//	driver.close();

	}

}
