package TestNGDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownDemo2 
{
	@Test
	public void listOfCountries()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/reservation.php");
		driver.manage().window().maximize();
		WebElement arrivingDropDown = driver.findElement(By.xpath("//select[@name='toPort']"));
		Select country = new Select(arrivingDropDown);
		//country.selectByIndex(3);
		country.selectByVisibleText("Paris");
		//country.selectByValue("8");  it is not possible because its not mentioned in xpath

		List<WebElement> countryNames = driver.findElements(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[6]/td[2]/select"));

		for(int tr=1;tr<=countryNames.size();tr++)
		{
			WebElement countries=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[6]["+tr+"]/td[2]/select"));	
			String  countriesList= countries.getText();
			System.out.println(countriesList);
		}
		driver.quit();
		System.out.println("Done");
		
	}
}
