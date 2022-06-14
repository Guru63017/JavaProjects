package Migration;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckBoxDemo2 
{
	@Test
	public void CheckBoxDemo2Test() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.calculator.net/mortgage-calculator.html");

		WebElement checkbox = driver.findElement(By.xpath("//*[@id='content']/table[1]/tbody/tr/td[1]/table/tbody/tr[6]/td/label/b"));

		WebElement checkbox2 = driver.findElement(By.xpath("//input[@id='caddoptional']"));

		boolean checkboxDisplay = checkbox.isDisplayed();

		if(checkboxDisplay==true)
		{
			System.out.println("checkbox is Display");
		}
		else
		{
			System.out.println("checkbox is not Display");
		}

		boolean checkboxEnable = checkbox.isEnabled();
		if(checkboxEnable==true)
		{
			System.out.println("checkbox is Enabled");
		}
		else
		{
			System.out.println("checkbox is not Enabled");
		}

		boolean checkboxSelected = checkbox2.isSelected();

		if(checkboxSelected==true)
		{
			System.out.println("checkbox is Selected");
		}
		else
		{
			System.out.println("checkbox is not Selected");
		}

		checkbox.click();

		boolean afterclickCheckboxSelected = checkbox2.isSelected();

		if(afterclickCheckboxSelected==false)
		{
			System.out.println("Afterclick checkbox is not Selected");
		}
		else
		{
			System.out.println("Afterclick checkbox is Selected");
		}



		System.out.println("Done");






	}
}
