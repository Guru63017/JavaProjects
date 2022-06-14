package TestNGDemo;

import static org.testng.Assert.assertEquals; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PageTitleDemo1
{
	@Test
	public void testPageTitle() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		WebElement userName = driver.findElement(By.xpath("//input[@name='userName']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		WebElement submit = driver.findElement(By.xpath("//input[@name='submit']"));

		userName.sendKeys("mercury");
		password.sendKeys("mercury");
		submit.click();
		
		String actualTitleName = driver.getTitle();
		System.out.println(actualTitleName);
		String expectedName = "Login: Mercury Tours";
		String error = "Matching";
		System.out.println("homepageTitle...:"+actualTitleName);
		assertEquals(actualTitleName, expectedName,error);
	
		System.out.println("Done");
		driver.quit();
		
		

	}
}
