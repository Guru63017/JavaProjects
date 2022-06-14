package Migration;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FaceBookFollow
{
	@Test
	public void FaceBookFollow() throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "D:\\Guru Online Class\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		WebElement creatnNewAccount = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		creatnNewAccount.click();
		Thread.sleep(4000);
		WebElement femaleradio = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		femaleradio.click();
		WebElement femaleToMale = driver.findElement(By.xpath("(//input[@type='radio'])[1]/following::input[@value='2']"));
		Thread.sleep(2000);
		femaleToMale.click();
	}

}


