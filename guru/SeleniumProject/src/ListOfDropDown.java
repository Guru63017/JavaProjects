

// Select DropDown From list of DropDown //

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListOfDropDown
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/reservation.php");
		driver.manage().window().maximize();
		WebElement DropDown = driver.findElement(By.xpath("(//select)[6]"));
		DropDown.click();
		driver.quit();
		System.out.println("Done");
	}

}