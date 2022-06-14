import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementAndFindElementsDemo1 
{

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/reservation.php");

//		WebElement EnterWrongData = driver.findElement(By.xpath("//input[@name='RBG Technologies']"));

		List<WebElement> EnterWrongData1 = driver.findElements(By.xpath("//input[@name='RBG Technologies']"));
		
		int size = EnterWrongData1.size();

		System.out.println("size : "+size);
		
		System.out.println("Done");

	}

}
