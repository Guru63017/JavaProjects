import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialinkTest 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\GuruOnlineClass\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.guru99.com/test/newtours/index.php");

		driver.findElement(By.linkText("REGISTER")).click();
		
		
		driver.findElement(By.partialLinkText("REGIST")).click();
		driver.quit();
		System.out.println("Done");
	}

}
