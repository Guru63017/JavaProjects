package DDFWDemos;

public class GenericWebTableTest
{

	public static void main(String[] args) throws InterruptedException
	{
		GenericWebtable web = new GenericWebtable();
		web.openBrowser("chrome");		
		web.enterUrl("https://www.bseindia.com/markets/equity/EQReports/mktwatchR.html?filter=gainer*all$all$");
		/**
		 * Select one Persone
		 */
//		web.selectedOneSecurity("xpath","//*[@id='fontSize']/div[2]/div/div[1]/div/div/div/div[3]/table/tbody/tr/td/table/tbody/tr[6]/td[2]/a" );
		/**
		 * Select One Persone From List of Securities
		 */
		web.selectSecurity(2,3);
		
		System.out.println("Done");
	}

}
