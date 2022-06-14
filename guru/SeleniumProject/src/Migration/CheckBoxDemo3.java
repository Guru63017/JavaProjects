package Migration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class CheckBoxDemo3 
{
	@Test
	public void TestonCheckBox() 
	{

		System.setProperty("webdriver.chrome.driver", "D:\\Guru Online Class\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://faculty.washington.edu/chudler/java/boxes.html");

		WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox'][5]"));

		boolean checkBoxisDisply = checkBox.isDisplayed();
		if(checkBoxisDisply==true)
		{
			System.out.println("checkBoxis Disply");
		}
		else
		{
			System.out.println("checkBoxis not Disply");
		}
		boolean checkBoxisEnable = checkBox.isEnabled();
		if(checkBoxisEnable==true)
		{
			System.out.println("checkBoxis Enable");
		}
		else
		{
			System.out.println("checkBoxis not Enable");
		}

		boolean checkBoxSelected = checkBox.isSelected();

		if(checkBoxSelected==false)	
		{
			System.out.println("checkBox is not Selected");
		}
		else
		{
			System.out.println("checkBox is Selected");
		}

		checkBox.click();

		boolean checkboxSelectedAfterclick = checkBox.isSelected();

		if(checkboxSelectedAfterclick==true)
		{
			System.out.println("checkbox is SelectedAfterclick");
		}
		else
		{
			System.out.println("checkbox is not SelectedAfterclick");
		}
		//	  		multiple checkBox Selected

		int checkboxNumbers[]={12,24,36,59,62,75,84,90};
		for(int i=0; i<checkboxNumbers.length; i++)
		{
			int  select=checkboxNumbers[i];
			WebElement selectedcheckBox = driver.findElement(By.xpath("//input[@type='checkbox']["+select+"]"));
			selectedcheckBox.click();

		}

		System.out.println("Done");
	}

}

