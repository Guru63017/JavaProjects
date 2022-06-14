package Migration;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrokenLinksDemo1 
{
	@Test
	public void BrokenLinks()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bbc.com/");
//		driver.get("http://demo.guru99.com/test/newtours/reservation.php");

		List<WebElement> links= driver.findElements(By.xpath("//a"));

		int size = links.size();

		System.out.println("size....:"+size);

		for(int i=0; i<size; i++)
		{
			String actualLink = links.get(i).getAttribute("href");
			String expectedLink = "";
			String error = "brokenLink";
			Assert.assertNotEquals(actualLink, expectedLink,error);		

		}
		driver.quit();
		System.out.println("Done");
	}
}


