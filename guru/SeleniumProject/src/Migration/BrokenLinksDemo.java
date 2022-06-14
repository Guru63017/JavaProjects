package Migration;

import java.util.List; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class BrokenLinksDemo
{
	@Test
	public void BrokenLinksTest() 
	{	
		System.setProperty("webdriver.chrome.driver", "D:\\Guru Online Class\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//	  		driver.get("https://www.bbc.com/");
		driver.get("http://demo.guru99.com/test/newtours/reservation.php");

		List<WebElement> links= driver.findElements(By.xpath("//a"));

		int size = links.size();

		System.out.println("size....:"+size);

		for(int i=0; i<size; i++)
		{
			String actualLink = links.get(i).getAttribute("href");
			String expectedLink = "";
			String exception = "its a broken link";
			Assert.assertNotEquals(actualLink, expectedLink, exception);
//			System.out.println(i);
//			System.out.println(actualLink+i);
		}

		System.out.println("Done");
	}
}


