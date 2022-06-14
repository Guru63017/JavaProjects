import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\GuruOnlineClass\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bbc.com/");
		driver.manage().window().maximize();
		WebElement Link = driver.findElement(By.xpath("//a[@href='/news/world-europe-61285178' and @class='media__link']"));
		Link.click();
		driver.quit();
		System.out.println("Done");
	}

}
