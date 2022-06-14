import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookFollow 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");

		WebElement creatnNewAccount = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		creatnNewAccount.click();
		WebElement femaleradio = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		femaleradio.click();
		WebElement femaleToMale = driver.findElement(By.xpath("(//input[@type='radio'])[1]/following::input[@value='2']"));
		Thread.sleep(2000);
		femaleToMale.click();
	}

}
