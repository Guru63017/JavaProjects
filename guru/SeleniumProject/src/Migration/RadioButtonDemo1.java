package Migration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class RadioButtonDemo1
{
	@Test
	public void RadioButtonTest()
	{

		System.setProperty("webdriver.chrome.driver", "D:\\Guru Online Class\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/reservation.php");

		WebElement RadioButton = driver.findElement(By.xpath("//input[@type='radio'][4]"));

		boolean RadiobuttonDisply = RadioButton.isDisplayed();
		boolean expected = true;
		Assert.assertEquals(RadiobuttonDisply, expected);

		boolean RadioButtonEnable = RadioButton.isEnabled();
		boolean expectedenable = true;
		Assert.assertEquals(RadioButtonEnable, expectedenable);

		boolean RadioButtonSelected = RadioButton.isSelected();
		boolean expectedselected = false;
		Assert.assertEquals(RadioButtonSelected, expectedselected);

		RadioButton.click();

		boolean RadioButtonAfterClickSelected = RadioButton.isSelected();
		boolean expectedafter = true;
		Assert.assertEquals(RadioButtonAfterClickSelected, expectedafter);

		System.out.println("Done");
	}

}


