import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBoxDemo2 // CALCULATOR
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.calculator.net/mortgage-calculator.html");

		WebElement checkbox = driver.findElement(By.xpath("//*[@id='content']/table[1]/tbody/tr/td[1]/table/tbody/tr[6]/td/label/b"));
		WebElement checkbox2 = driver.findElement(By.xpath("//input[@id='caddoptional']"));

		boolean checkboxDisplay = checkbox.isDisplayed();
		boolean expectedCheckBox = true;
		String exception = "checkboxDisplay";
		Assert.assertEquals(checkboxDisplay, expectedCheckBox,exception);

		boolean checkboxEnable = checkbox.isEnabled();
		boolean expectedEnable = true;
		String exceptionEnable = "checkboxisEnable";
		Assert.assertEquals(checkboxEnable, expectedEnable,exceptionEnable);

		boolean checkboxSelected = checkbox2.isSelected();
		boolean expectedSelect = true;
		String exceptionSelect = "checkboxisSelected";
		Assert.assertEquals(checkboxSelected, expectedSelect,exceptionSelect);

		checkbox.click();

		boolean afterclickCheckboxSelected = checkbox2.isSelected();
		boolean expectedNotSelect = false;
		String exceptions = "expectedNotSelect";
		Assert.assertEquals(afterclickCheckboxSelected, expectedNotSelect,exceptions);

		System.out.println("Done");
	}

}
