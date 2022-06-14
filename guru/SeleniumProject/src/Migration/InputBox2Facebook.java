package Migration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InputBox2Facebook 
{
	@Test
	public void InputBox2FacebookTest() throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "D:\\Guru Online Class\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		WebElement userNameBox = driver.findElement(By.xpath("//*[@id='email']"));

		boolean userNameEditBoxisDisplayed = userNameBox.isDisplayed();
		boolean expecteduser = true;
		String exception1 = "userNameEditBoxisDisplayed";
		Assert.assertEquals(userNameEditBoxisDisplayed, expecteduser,exception1);

		WebElement passwordBox = driver.findElement(By.xpath("//*[@id='pass']"));
		boolean passwordEditBoxisDisplyed = passwordBox.isDisplayed();
		boolean expectedpass = true;
		String exception2 = "passwordEditBoxisDisplyed";
		Assert.assertEquals(passwordEditBoxisDisplyed, expectedpass,exception2);

		boolean userNameInputBoxEnable = userNameBox.isEnabled();
		boolean expectedUserInput = true;
		String exception3 = "userNameInputisBoxEnable";
		Assert.assertEquals(userNameInputBoxEnable, expectedUserInput,exception3);

		boolean passwordInputBoxisEnable = passwordBox.isEnabled();
		boolean expectedPassInput = true;
		String exception4 = "passwordInputBoxisEnable";
		Assert.assertEquals(passwordInputBoxisEnable, expectedPassInput,exception4);

		String expecteduserNameWatermark = ("Email address or phone number");
		String actualuserNameWatermark = userNameBox.getAttribute("aria-label");
		String exception5 = "Email address or phone number";
		Assert.assertEquals(actualuserNameWatermark, expecteduserNameWatermark,exception5);


		String expectedPasswordwatermark = "Password";
		String actualPasswordwatermark = passwordBox.getAttribute("aria-label");
		String exception6 = "Password";
		Assert.assertEquals(actualPasswordwatermark, expectedPasswordwatermark,exception6);

		userNameBox.sendKeys("6304846409");

		passwordBox.sendKeys("azaddudekula");

		String actualEntereduserName = userNameBox.getAttribute("value");
		String expecteduserName = "6304846409";
		String exceptionUserId = "enterDataisMatched";
		Assert.assertEquals(actualEntereduserName, expecteduserName,exceptionUserId);

		String actualEnteredPassword = passwordBox.getAttribute("value");
		String excpassUserId = "azaddudekula";
		String exceptionPassId = "enterDataisMatched";
		Assert.assertEquals(actualEnteredPassword, excpassUserId,exceptionPassId);

		boolean userNametextBoxisSelected = userNameBox.isSelected();
		boolean expecteduserText = true;
		String exception7 = "userNametextBoxisSelected";
		Thread.sleep(2000);
		Assert.assertNotEquals(userNametextBoxisSelected, expecteduserText,exception7);

		boolean PasswordtextBoxisSelected = passwordBox.isSelected();
		boolean expectedPassText = true;
		String exception8 = "PasswordtextBoxisSelected";
		Assert.assertNotEquals(PasswordtextBoxisSelected, expectedPassText,exception8);

		driver.findElement(By.xpath("//button[@name='login']")).click();

		//	  		userNameBox.clear();
		//	  		passwordBox.clear();

		//	  		userNameInputBox.clear();
		//	  		passwordInputBox.clear();
		//	  		
		System.out.println("Done");


	}
}
