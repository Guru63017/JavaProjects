package IODemo;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NewFileCreaterDemo  
{
	
	public static void main(String[] args) throws IOException
	{
		Date d1 = new Date();
		SimpleDateFormat s1 = new SimpleDateFormat("ss mm HH");
		String update = s1.format(d1);
		File f1 = new File("C:\\Users\\malli\\Desktop\\ScreenShots\\NewFileCreaterDemo\\File1.txt"+update+"");
		f1.createNewFile();
		System.out.println("Done");
	}

}
 