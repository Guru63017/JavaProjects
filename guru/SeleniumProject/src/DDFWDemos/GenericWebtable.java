package DDFWDemos;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericWebtable
{
	public WebDriver driver ;

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


	public void enterUrl(String URL)
	{
		driver.get(URL);
	}
	public void selectedOneSecurity(String locatorType,String locatorValue)
	{
		if(locatorType.equals("name"))
		{
			driver.findElement(By.name(locatorValue)).click();
		}
		else if(locatorType.equals("id"))
		{
			driver.findElement(By.id(locatorValue)).click();
		}
		else if(locatorType.equals("className"))
		{
			driver.findElement(By.className(locatorValue)).click();
		}
		else if(locatorType.equals("xpath"))
		{
			driver.findElement(By.xpath(locatorValue)).click();
		}
		else if(locatorType.equals("tagName"))
		{
			driver.findElement(By.tagName(locatorValue)).click();
		}
		else if(locatorType.equals("cssSelector"))
		{
			driver.findElement(By.cssSelector(locatorValue)).click();
		}
		else if(locatorType.equals("linkText"))
		{
			driver.findElement(By.linkText(locatorValue)).click();
		}
		else if(locatorType.equals("partialLinkText"))
		{
			driver.findElement(By.partialLinkText(locatorValue)).click();
		}
	}
	public void selectSecurity(int locatorValue1,int locatorValue2) throws InterruptedException
	{
		int select[] = { locatorValue1,locatorValue2 };
		for(int i=0; i<select.length; i++)
		{
			int  selectedName=select[i];
			WebElement selectedLink = driver.findElement(By.xpath("//*[@id='fontSize']/div[2]/div/div[1]/div/div/div/div[3]/table/tbody/tr/td/table/tbody/tr["+selectedName+"]/td[2]/a"));
			Thread.sleep(3000);
			selectedLink.click();
			Thread.sleep(3000);
			Set<String> popupPage2 = driver.getWindowHandles();
			Iterator<String> switchpage = popupPage2.iterator();
			String parentWindow = switchpage.next();
			String childWindow = switchpage.next();
			driver.switchTo().window(childWindow);
			driver.switchTo().window(parentWindow);

		}
	}
}
