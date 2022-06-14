
// Select RadioButton From list of Radio Button //

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListOfRadioButtons 
{

	public static void main(String[] args)
	{	
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/reservation.php");

		WebElement RadioButton = driver.findElement(By.xpath("(//input[@type='radio'])[4]"));

		RadioButton.click();

		System.out.println("Done");

	}
}
