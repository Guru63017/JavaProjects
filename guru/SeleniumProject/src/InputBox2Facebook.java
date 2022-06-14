import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputBox2Facebook 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement userNameBox = driver.findElement(By.xpath("//*[@id='email']"));
		
		boolean userNameEditBoxisDisplayed = userNameBox.isDisplayed();

		if(userNameEditBoxisDisplayed==true)
		{
			System.out.println("userNameEditBox is Displayed");
		}
		else
		{
			System.out.println("userNameEditBox is not Displayed");	
		}

		WebElement passwordBox = driver.findElement(By.xpath("//*[@id='pass']"));
		boolean passwordEditBoxisDisplyed = passwordBox.isDisplayed();

		if(passwordEditBoxisDisplyed==true)
		{
			System.out.println("passwordEditBox is Displyed");
		}
		else
		{
			System.out.println("passwordEditBoxisDisplyed");
		}
		
		boolean userNameInputBoxEnable = userNameBox.isEnabled();

		if(userNameInputBoxEnable==true)
		{
			System.out.println("userNameInputBox is Enable");
		}
		else
		{
			System.out.println("userNameInputBox is not Enable");
		}
		
		boolean passwordInputBoxisEnable = passwordBox.isEnabled();
		
		if(passwordInputBoxisEnable==true)
		{
			System.out.println("passwordInputBox is Enable");
		}
		else
		{
			System.out.println("passwordInputBox is not Enable");
		}
		
		String expecteduserNameWatermark = ("Email address or phone number");
		
		String actualuserNameWatermark = userNameBox.getAttribute("aria-label");
		
		if(actualuserNameWatermark.equals(expecteduserNameWatermark))
		{
			System.out.println("userName watermark is dislying correctly ");
		}
		else
		{
			System.out.println("userName watermark is not dislying correctly");
		}

		String expectedPasswordwatermark = "Password";
		
		String actualPasswordwatermark = passwordBox.getAttribute("aria-label");

		if(actualPasswordwatermark.equals(expectedPasswordwatermark))
		{
			System.out.println("Password watermark is dislying correctly");
		}
		else
		{
			System.out.println("Password watermark is not dislying correctly");
		}
		
		userNameBox.sendKeys("6304846409");
		
		passwordBox.sendKeys("azaddudekula");

		String actualEntereduserName = userNameBox.getAttribute("value");
		
		String actualEnteredPassword = passwordBox.getAttribute("value");
		
//		System.out.println(actualEntereduserName);

		if(actualEntereduserName.equals("6304846409"))
		{
			System.out.println("actualEntereduserName is correct");
		}
		else
		{
			System.out.println("actualEntereduserName is not correct");

		}

		System.out.println(actualEnteredPassword);

		if(actualEnteredPassword.equals("azaddudekula"))
		{
			System.out.println("actualEnteredPassword is correct");
		}
		else
		{
			System.out.println("actualEnteredPassword is not correct");
		}
		
		boolean userNametextBoxisSelected = userNameBox.isSelected();
		
		if(userNametextBoxisSelected==true)
		{
			System.out.println("userNametextBox is Selected ");
		}
		else
		{
			System.out.println("userNametextBoxis not Selected");
		}
		
		boolean PasswordtextBoxisSelected = passwordBox.isSelected();
	
		if(PasswordtextBoxisSelected==true)
		{
			System.out.println("PasswordtextBox is Selected");
		}
		else
		{
			System.out.println("PasswordtextBox is not Selected");
		}
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
//		userNameBox.clear();
//		passwordBox.clear();
		
//		userNameInputBox.clear();
//		passwordInputBox.clear();
		
		driver.quit();
		
		System.out.println("Done");
	}

}
