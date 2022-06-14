package TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExceptionQuite
{
	WebDriver driver;
	@Test
	public void ExceptionQuiteTest() throws InterruptedException 
	{	
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://uat.cap.org/");
			driver.manage().window().maximize();
			WebElement shop = driver.findElement(By.xpath("(//a[@href='https://estoreuat.cap.org/OA_HTML/xxCAPibeCZzpHome.jsp?sitex=10020%3A22372%3AUS&ref=xxCAPibeCZzpHome.jsp'])[1]"));
			shop.click();
			System.out.println(0/0);
		}
		catch (Exception e)
		{
			System.out.println("throw Exception");
		}
		driver.quit();

	}

}
