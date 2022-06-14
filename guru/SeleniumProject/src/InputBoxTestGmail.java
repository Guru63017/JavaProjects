import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputBoxTestGmail
{					
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://gmail.com");	
		driver.manage().window().maximize();

		WebElement userNmaeEditBox = driver.findElement(By.xpath("//*[@id='identifierId']"));

		boolean userNmaeEditBoxisDisply = userNmaeEditBox.isDisplayed();

		if(userNmaeEditBoxisDisply==true)
		{
			System.out.println("userNmaeEditBox is Disply");
		}
		else
		{
			System.out.println("userNmaeEditBox is not Disply");
		}

		boolean userNmaeEditBoxisEnable = userNmaeEditBox.isDisplayed();

		if(userNmaeEditBoxisEnable==true)
		{
			System.out.println("userNmaeEditBox is Enable");
		}
		else
		{
			System.out.println("userNmaeEditBox is not enable");
		}
		String expectedwatermark = "Email or phone";

		String actualwatermark = userNmaeEditBox.getAttribute("aria-label");

		if(actualwatermark.equals(expectedwatermark))

		{
			System.out.println("watermark is dislying correctly");
		}
		else
		{
			System.out.println("watermark is not displying correctly");
		}
		userNmaeEditBox.sendKeys("RBG Technologies");

		String actualEnteredData = userNmaeEditBox.getAttribute("value");

//		System.out.println(actualEnteredData);

		if(actualEnteredData.equals("RBG Technologies"))
		{
			System.out.println("actualEnteredData is correct");
		}
		else
		{
			System.out.println("actualEnteredData is not corret");
		}
		
		userNmaeEditBox.clear();
		driver.quit();
		
		System.out.println("Done");
	}

}
