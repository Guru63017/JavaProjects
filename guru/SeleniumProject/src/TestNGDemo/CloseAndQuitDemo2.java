package TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CloseAndQuitDemo2 
{
	@Test
	public void CloseQuitTest2() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Guru Online Class\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://uat.cap.org/");
		driver.manage().window().maximize();
		WebElement shop = driver.findElement(By.xpath("(//a[@href='https://estoreuat.cap.org/OA_HTML/xxCAPibeCZzpHome.jsp?sitex=10020%3A22372%3AUS&ref=xxCAPibeCZzpHome.jsp'])[1]"));
		shop.click();
		Thread.sleep(4000);
//		driver.close();
		driver.quit();
	}
}
