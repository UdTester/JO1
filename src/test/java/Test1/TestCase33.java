package Test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase33 extends TestCase11{
 WebDriver d;
{
	System.setProperty("webdriver.chrome.driver", "/Users/udaya/Desktop/Learning-Selenium/Zip-files/chromedriver");
	ChromeDriver d = new ChromeDriver();
	this.d = d;
}
		
	@Test
	public void LandingPage2()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/udaya/Desktop/Learning-Selenium/Zip-files/chromedriver");
		ChromeDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		d.get("http://www.tangerineorange.com.au/");

		// Click on Contact us link in the header
				 d.findElement(By.linkText("Contact Us")).click();

				// Enter details on the page
				d.findElement(By.name("username")).sendKeys("Udaya test");
				d.findElement(By.id("email")).sendKeys("ud.ikm.test.email@gmail.com");
				d.findElement(By.name("url")).sendKeys("http://www.tangerineorange.com.au/");
				d.findElement(By.name("comment")).sendKeys("Please ignore this message, this is sent for ikm assignment by ud, using an automated script");
			
				// this below statement will submit in real time, hence I commented it.
				//c.findElementByPartialLinkText("Send Message").click();
			
	}
}
