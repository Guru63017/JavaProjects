package Migration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InputBoxTestGmail
{
	@Test
	public void InputBoxTest()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Guru Online Class\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://gmail.com");	

		WebElement userNmaeEditBox = driver.findElement(By.xpath("//*[@id='identifierId']"));

		boolean userNmaeEditBoxisDisply = userNmaeEditBox.isDisplayed();
		boolean expectedEditBox = true;
		String exception1 = "userNmaeEditBoxisDisply";
		Assert.assertEquals(userNmaeEditBoxisDisply, expectedEditBox,exception1);

		boolean userNmaeEditBoxisEnable = userNmaeEditBox.isDisplayed();
		boolean expectedEditBoxisEnable = true;
		String exception2 = "userNmaeEditBoxisDisply";
		Assert.assertEquals(userNmaeEditBoxisEnable, expectedEditBoxisEnable,exception2);

		String expectedwatermark = "Email or phone";
		String actualwatermark = userNmaeEditBox.getAttribute("aria-label");
		String exception3 = "Email or phone";
		Assert.assertEquals(actualwatermark, expectedwatermark,exception3);

		userNmaeEditBox.sendKeys("RBG Technologies");
		String expectedData = "RBG Technologies";
		String actualEnteredData = userNmaeEditBox.getAttribute("value");
		String exception4 = "DataisMatching";
		Assert.assertEquals(actualEnteredData, expectedData,exception4);

		userNmaeEditBox.clear();

		System.out.println("Done");
	}

}
