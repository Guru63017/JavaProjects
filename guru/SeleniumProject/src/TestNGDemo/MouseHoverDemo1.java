package TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHoverDemo1 
{
	@Test
	public void TestMouseHover() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement countrySymb = driver.findElement(By.xpath("//span[@class='icp-nav-flag icp-nav-flag-in']"));
		Actions act = new Actions(driver);
		act.moveToElement(countrySymb).perform();
		Thread.sleep(2000);
		WebElement changeCountry = driver.findElement(By.xpath("(//div[@class='icp-mkt-change-lnk'])[1]"));
		changeCountry.click();
		System.out.println("Done");
		driver.quit();

	}
}
