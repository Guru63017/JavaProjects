package Migration;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo1 
{
	@Test
	public void CheckBoxDemo1Test() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Guru Online Class\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");

		WebElement checkBox = driver.findElement(By.xpath("//*[@id='ContentHolder_lbFeatures_LBI0C']"));

		boolean checkBoxisDisply = checkBox.isDisplayed();
		boolean expcetd = true;
		String exception = "isDisplay";
		Assert.assertEquals(checkBoxisDisply, expcetd,exception);

		boolean checkBoxisEnable = checkBox.isEnabled();
		boolean expected1 = true;
		String exception1 = "isEnable";
		Assert.assertEquals(checkBoxisEnable, expected1,exception1);

		boolean checkBoxSelected = checkBox.isSelected();
		boolean expected3 = true;
		String excption3 = "isSelected";
		Assert.assertEquals(checkBoxSelected, expected3,excption3);

		checkBox.click();
		WebElement checkBoxafterSelected = driver.findElement(By.xpath("//*[@id='ContentHolder_lbFeatures_TG_D']"));
		boolean checkboxSelectedAfterclick = checkBoxafterSelected.isSelected();
		boolean exected4 = true;
		String exception4 = "checkboxSelectedAfterclick";
		Assert.assertEquals(checkboxSelectedAfterclick, exected4,exception4);

		System.out.println("Done");

	}

}


