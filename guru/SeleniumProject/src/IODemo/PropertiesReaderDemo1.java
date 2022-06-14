package IODemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReaderDemo1 
{

	public static void main(String[] args) throws IOException 
	{
		String data1 = System.getProperty("user.dir");
		FileInputStream fin = new FileInputStream(data1+"\\Prooperties\\ReadData.properties");
		
		Properties prop = new Properties();
		prop.load(fin);
		String data = prop.getProperty("openBrowser");
		System.out.println(data);
	}

}
