package TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class CloseAndQuiteDemo3 
{
	WebDriver driver;
	@Test()
	public void f() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Guru Online Class\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://uat.cap.org/");
		driver.manage().window().maximize();
		WebElement shop = driver.findElement(By.xpath("(//a[@href='https://estoreuat.cap.org/OA_HTML/xxCAPibeCZzpHome.jsp?sitex=10020%3A22372%3AUS&ref=xxCAPibeCZzpHome.jsp'])[1]"));
		shop.click();
	}
	@AfterClass
	public void funB()
	{
		driver.quit();

	}
}
