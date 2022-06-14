package IODemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlReader 
{
	public static void main(String[] args) throws IOException 
	{
		String filePath = System.getProperty("user.dir");
		String fullPath = filePath+"\\Prooperties\\testData.xlsx";
		FileInputStream fin = new FileInputStream(fullPath);
		XSSFWorkbook book = new XSSFWorkbook(fin);
		XSSFSheet sheet = book.getSheet("TestData");
		int rowsize = sheet.getLastRowNum();
		System.out.println(rowsize+1);
		for(int i=0; i<=rowsize; i++)
		{
			XSSFRow row = sheet.getRow(i);
			for(int j=0; j<row.getLastCellNum(); j++)
			{
				XSSFRow row1 = sheet.getRow(i);
				XSSFCell cell = row.getCell(j);
				String cellData = cell.getStringCellValue();
				System.out.print(cellData+"\t");
				System.out.print("");

			}
			System.out.println();

		}
	}

}
