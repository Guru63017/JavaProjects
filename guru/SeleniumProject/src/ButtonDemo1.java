import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonDemo1 {

	public static void main(String[] args)   //fACEBOOK LOGIN BUTTON
	{

		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement buttonName = driver.findElement(By.xpath("//button[@name='login']"));
		
		boolean actualButtonisDisply = buttonName.isDisplayed();
		
		if(actualButtonisDisply==true)
		{
			System.out.println("actualButton is Disply");
		}
		else
		{
			System.out.println("actualButton is not Disply");
		}
		boolean actualButtonisEnable = buttonName.isEnabled();
		
		if(actualButtonisEnable==true)
		{
			System.out.println("actualButton is Enable");
		}
		else
		{
			System.out.println("actualButton is not Enable");
		}

		String actualButtonName = buttonName.getAttribute("value");
		String expectedButtonName = "Log In";
		if(actualButtonName.equals(expectedButtonName))
		{
			System.out.println("actualButtonName is matched");
		}
		else
		{
			System.out.println("actualButtonName is not matched");
		}
		

		driver.findElement(By.xpath("//button[@name='login']")).click();

		System.out.println("Done");

	}

}
