package Migration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ButtonDemo1 
{
	@Test
	public void ButtonTest1() 
	{

		System.setProperty("webdriver.chrome.driver", "D:\\Guru Online Class\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		WebElement buttonName = driver.findElement(By.xpath("//button[@name='login']"));

		boolean actualButtonisDisply = buttonName.isDisplayed();
		boolean expected = true;
		String exception = "isDisplayed";
		Assert.assertEquals(actualButtonisDisply, expected,exception);

		boolean actualButtonisEnable = buttonName.isEnabled();
		boolean expectedButtonisEnable = true;
		String exception1 = "isEnabled";
		Assert.assertEquals(actualButtonisEnable, expectedButtonisEnable, exception1);
	
		String expectedButtonName = "Log In";
		String actualButtonName = buttonName.getAttribute("value");
		String exception2 = "buttonNameIsNotMacthed";
		Assert.assertEquals(actualButtonName, expectedButtonName,exception2);
		
		driver.findElement(By.xpath("//button[@name='login']")).click();

		System.out.println("Done");

	}

}
