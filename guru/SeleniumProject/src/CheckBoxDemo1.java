import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo1 // SINGLE CHECKBOX SELECTED NOT COMPLETED
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");

		WebElement checkBox = driver.findElement(By.xpath("//*[@id='ContentHolder_lbFeatures_LBI0C']"));

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

		WebElement checkBoxafterSelected = driver.findElement(By.xpath("//*[@id='ContentHolder_lbFeatures_TG_D']"));

		boolean checkboxSelectedAfterclick = checkBoxafterSelected.isSelected();

		if(checkboxSelectedAfterclick==true)
		{
			System.out.println("checkbox is SelectedAfterclick");
		}
		else
		{
			System.out.println("checkbox is not SelectedAfterclick");
		}

		System.out.println("Done");

	}

}
