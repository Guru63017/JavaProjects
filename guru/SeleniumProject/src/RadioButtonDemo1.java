import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import zmq.io.coder.raw.RawDecoder;

public class RadioButtonDemo1
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/reservation.php");

		WebElement RadioButton = driver.findElement(By.xpath("//input[@type='radio']//following::input[@name='servClass'][2]"));

		boolean RadiobuttonDisply = RadioButton.isDisplayed();

		if(RadiobuttonDisply==true)
		{
			System.out.println("Radiobutton is Disply");	
		}
		else
		{
			System.out.println("Radiobutton is not Disply");
		}

		boolean RadioButtonEnable = RadioButton.isEnabled();

		if(RadioButtonEnable==true)
		{
			System.out.println("RadioButton i Enable");
		}
		else
		{
			System.out.println("RadioButton is not Enable");
		}
		boolean RadioButtonSelected = RadioButton.isSelected();
		
		if(RadioButtonSelected==false)
		{
			System.out.println("RadioButton i not Selected");
		}
		else
		{
			System.out.println("RadioButton is Selected");
		}
		
		RadioButton.click();
		
		boolean RadioButtonAfterClickSelected = RadioButton.isSelected();
		
		if(RadioButtonAfterClickSelected==true)
		{
			System.out.println("RadioButtonAfterClick is Selected");
		}
		else
		{
			System.out.println("RadioButtonAfterClick is not Selected");
		}

		driver.quit();
		System.out.println("Done");
	}

}
