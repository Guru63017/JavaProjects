package Migration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LabelTestGmailDemo1 {
	@Test
	public void LabelTestGmail() 
	{

		System.setProperty("webdriver.chrome.driver", "D:\\Guru Online Class\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://gmail.com");

		WebElement element = driver.findElement(By.xpath("//*[@id='headingSubtext']/span"));

		String expectedData = "to continue to Gmail";
		String actualData = element.getText();
		String exception = "actualDataisMatched";
		Assert.assertEquals(actualData, expectedData,exception);

		System.out.println("Done");
	}
}

