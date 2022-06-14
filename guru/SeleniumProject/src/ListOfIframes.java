import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;

public class ListOfIframes 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/reservation.php");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement iframe = driver.findElement(By.xpath("(//iframe)[6]"));
//		List<WebElement> f = driver.findElements(By.xpath("//iframe"));
//		int size = f.size();
//		System.out.println(size);
		
		Actions a = new Actions(driver);
		a.click(iframe).perform();
//		iframe.click();
//		driver.quit();
		System.out.println("Done");

	}

}
