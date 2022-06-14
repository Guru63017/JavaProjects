import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LabelTestGmailDemo1
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//*[@id='headingSubtext']/span"));
		
		String expectedData = "to continue to Gmail";
		
		String actualData = element.getText();
			
		if(expectedData.equals(actualData))
		{
			System.out.println("Data is matching");
		}
		else
		{
			System.out.println("Data is not matching");
		}
//		driver.quit();
		
		System.out.println("Done");
	}
}