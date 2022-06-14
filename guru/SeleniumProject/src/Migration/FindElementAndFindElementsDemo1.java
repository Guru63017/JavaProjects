package Migration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class FindElementAndFindElementsDemo1
{
	@Test
	public void FindElementAndFindElementsTest()
	{



		System.setProperty("webdriver.chrome.driver", "D:\\Guru Online Class\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/reservation.php");

//		WebElement EnterWrongData = driver.findElement(By.xpath("//input[@name='RBG Technologies']"));

		List<WebElement> EnterWrongData1 = driver.findElements(By.xpath("//input[@name='RBG Technologies']"));

		int size = EnterWrongData1.size();

		System.out.println("size : "+size);

		System.out.println("Done");

	}
}
