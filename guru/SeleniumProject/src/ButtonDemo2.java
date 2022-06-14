import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonDemo2   // A SUBMIT BUTTON DEMO
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/button/");
		
		driver.switchTo().frame(0);

		WebElement Asubmitbutton = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));


		boolean AsubmitbuttonisDisply =  Asubmitbutton.isDisplayed();

		if(AsubmitbuttonisDisply==true)
		{
			System.out.println("Asubmitbutton is Disply");
		}
		else
		{
			System.out.println("Asubmitbutton is not Disply");
		}

		boolean AsubmitbuttonisEnable = Asubmitbutton.isEnabled();

		if(AsubmitbuttonisEnable==true)
		{
			System.out.println("Asubmitbutton is Enable");
		}
		else
		{
			System.out.println("Asubmitbutton is not Enable");
		}

		String expectedsubmitName = "A submit button";
		String actualsubmitName = Asubmitbutton.getAttribute("value");

		if(actualsubmitName.equals(expectedsubmitName))
		{
			System.out.println("actualsubmitName is matched");
		}
		else
		{
			System.out.println("actualsubmitName is not matched");
		}

		Asubmitbutton.click();

		System.out.println("Done");
	}

}
