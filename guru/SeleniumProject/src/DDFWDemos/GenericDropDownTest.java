package DDFWDemos;


public class GenericDropDownTest 
{
	public static void main(String[] args) throws InterruptedException 
	{
		GenericDropDown key =new GenericDropDown();
		
		key.openBrowser("chrome");
		key.openBrowser("firefox");
		key.enterURL("http://demo.guru99.com/test/newtours/reservation.php");
		key.dropDown("name", "toMonth");
//		key.selectMonth("December");
//		key.selectMonth("2");
		key.selectMonthByIndex(10);
			
		System.out.println("Done");
		
	}

}
