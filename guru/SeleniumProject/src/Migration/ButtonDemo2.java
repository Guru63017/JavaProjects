package Migration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ButtonDemo2 
{
	@Test
	public void ButtonDemo2Test() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Guru Online Class\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/button/");

		driver.switchTo().frame(0);

		WebElement Asubmitbutton = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));

		boolean AsubmitbuttonisDisply =  Asubmitbutton.isDisplayed();
		boolean exected = true;
		String exception = "isDisply";
		Assert.assertEquals(AsubmitbuttonisDisply, exected, exception);

		boolean AsubmitbuttonisEnable = Asubmitbutton.isEnabled();
		boolean expected1	= true;
		String exception1= "isEnable";
		Assert.assertEquals(AsubmitbuttonisEnable, expected1,exception1);

		String expectedsubmitName = "A submit button";
		String actualsubmitName = Asubmitbutton.getAttribute("value");
		String exception2 = "submitName is Samee";
		Assert.assertEquals(actualsubmitName, expectedsubmitName,exception2);		

		Asubmitbutton.click();

		System.out.println("Done");
	}

}

