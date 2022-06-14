package TestNGDemo;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertDemo1 
{
	@Test
	public void TestAlert() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.meghanabus.in/index.html");
		driver.manage().window().maximize();
		WebElement manage = driver.findElement(By.xpath("//a[@title='Manage Bookings']"));
		manage.click();
		Thread.sleep(4000);
		WebElement search = driver.findElement(By.xpath("//button[@class='btn theme-btn btn-default']"));
		search.click();
		Thread.sleep(4000);

		String alert = driver.switchTo().alert().getText();
		String expected = "Not a valid request";
		Assert.assertEquals(alert, expected);

		System.out.println(alert);
		driver.switchTo().alert().accept();

		WebElement label1 = driver.findElement(By.xpath("//*[@id='manage_booking']/div[1]/div[1]/div[1]/span"));
		String actualData1 = label1.getText();
		String expectedData1 = "Please enter the details for Print, Update, Cancel and Pre/Postpone Ticket.";
		String error1 = "not same";
		assertEquals(actualData1, expectedData1,error1);

		System.out.println("Done");
		driver.quit();
	}
}
