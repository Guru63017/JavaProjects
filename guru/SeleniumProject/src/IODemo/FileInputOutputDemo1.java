package IODemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputDemo1 
{

	public static void main(String[] args) throws IOException
	{
//		FileOutputStream fo1 = new FileOutputStream("D:\\GuruOnlineClass\\FrameWorks\\test1.txt");
		
		/**
		 * java.io.FileNotFoundException
		 */
//		FileInputStream f1 = new FileInputStream("D:\\GuruOnlineClass\\FrameWorks\\test2.txt");
		
//		File f1 = new File("D:\\GuruOnlineClass\\FrameWorks\\test3.txt");
//		f1.createNewFile();
//		File f2 = new File("D:\\GuruOnlineClass\\FrameWorks\\abc");
//		f2.mkdir();
		File f3 = new File("D:\\GuruOnlineClass\\FrameWorks\\RBG\\x\\y\\z");
		f3.mkdirs();
		
		System.out.println("Done");
	}
	public void funA()
	{
		
	}

}
