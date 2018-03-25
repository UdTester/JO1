package Test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase22{

	
	@Test
	public void Login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/Users/udaya/Desktop/Learning-Selenium/Zip-files/chromedriver");
		ChromeDriver c = new ChromeDriver();
		Thread.sleep(5000);
		c.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Go to Home page
		c.get("https://www.seek.com.au/");
		Thread.sleep(6000);
		// Click on sign-in link
		c.findElement(By.linkText("Sign in")).click();				
		
		// Enter details on the page
		c.findElementByName("email").sendKeys("ud.ikm.test.email@gmail.com");
		c.findElementByName("password").sendKeys("tangerineorange");
		
		Thread.sleep(6000);

		c.findElement(By.linkText("Register")).click();				
	
		
	}
}
