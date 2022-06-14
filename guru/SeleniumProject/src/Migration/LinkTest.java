package Migration;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinkTest 
{
	@Test
	public void TestLink()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Guru Online Class\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bbc.com/");
		WebElement label = driver.findElement(By.xpath("//a[@href='/news/world-europe-61285178' and @class='media__link']"));
		label.click();
		System.out.println("Done");
	}

}

