import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Util {
	public String BaseURL = "http://demo.guru99.com/V4";
	WebDriver driver;
	public void initDriver()
	{
		WebDriver driver = new FirefoxDriver();

		driver.get(BaseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	

}
