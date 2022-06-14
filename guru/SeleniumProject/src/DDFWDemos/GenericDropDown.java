package DDFWDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GenericDropDown 
{
	public WebDriver driver;
	public void openBrowser(String browserName)
	{
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();					
			driver.manage().window().maximize();
		}

		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\GuruOnlineClass\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();

		}

		else if(browserName.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver", "D:\\GuruOnlineClass\\Selenium\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}
	}
	public void enterURL(String URL)
	{
		driver.get(URL);
	}
	public void dropDown(String  locatorType,String locatorValue )
	{

		if(locatorType.equals("name"))
		{
			driver.findElement(By.name(locatorValue));

		}
		else if(locatorType.equals("id"))
		{
			driver.findElement(By.id(locatorValue));
		}
		else if(locatorType.equals("className"))
		{
			driver.findElement(By.className(locatorValue));
		}
		else if(locatorType.equals("xpath"))
		{
			driver.findElement(By.xpath(locatorValue));
		}
		else if(locatorType.equals("tagName"))
		{
			driver.findElement(By.tagName(locatorValue));
		}
		else if(locatorType.equals("cssSelector"))
		{
			driver.findElement(By.cssSelector(locatorValue));
		}
		else if(locatorType.equals("linkText"))
		{
			driver.findElement(By.linkText(locatorValue));
		}
		else if(locatorType.equals("partialLinkText"))
		{
			driver.findElement(By.partialLinkText(locatorValue));
		}

	}
	public void selectMonth(String locatorValue)
	{	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement dropDown = driver.findElement(By.name("toMonth"));
		Select month = new Select(dropDown);
		month.selectByValue(locatorValue);
		month.selectByVisibleText(locatorValue);	
	}
	public void selectMonthByIndex(int locatorValue)
	{	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement dropDown = driver.findElement(By.name("toMonth"));
		Select month = new Select(dropDown);
		month.selectByIndex(locatorValue);
	}

}
