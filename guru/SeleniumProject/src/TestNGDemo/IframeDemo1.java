package TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IframeDemo1
{
	@Test
	public void iframeTest()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://only-testing-blog.blogspot.com/2015/01/iframe1.html");		
		driver.manage().window().maximize();
		//		here we using webelement name to switch the frame

		//		WebElement element = driver.findElement(By.xpath("//iframe[@name='frame1']"));

		//		driver.switchTo().frame(element);

		//		driver.switchTo().frame(0);

		//		here we using String name to switch the frame
		driver.switchTo().frame("frame1");


		WebElement iframe = driver.findElement(By.xpath("//*[@id='Blog1']/div[1]/div/h2/span"));
		String actualData = iframe.getText();
		String expetedData = "Saturday, 3 January 2015";
		String error = "actualData and expetedData is same";
		Assert.assertEquals(actualData, expetedData, error);

		driver.switchTo().defaultContent();
		WebElement inputBox = driver.findElement(By.xpath("//input[@name='Town']"));
		inputBox.sendKeys("Hyderabad");
		WebElement inputBox2 = driver.findElement(By.xpath("//input[@name='Country']"));
		inputBox2.sendKeys("INDIA");
		System.out.println("Done");
//		driver.quit();
	}
}
