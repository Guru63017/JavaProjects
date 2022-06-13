package ArraysPracties;

import java.util.Calendar;

import java.util.Locale;

public class DatePrintArray
{	still pending

	public static void main(String[] args) 
	{
		Calendar c = Calendar.getInstance();
		
		System.out.println(c.getDisplayName(Calendar.MONTH, Calendar.LONG,Locale.ENGLISH));
		
		System.out.println(c.getTime().toString());
	}

}
