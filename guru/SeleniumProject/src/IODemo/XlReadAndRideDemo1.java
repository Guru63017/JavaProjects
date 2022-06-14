package IODemo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlReadAndRideDemo1 
{
	public static void main(String[] args) throws IOException 
	{
		String data = System.getProperty("user.dir");
		FileInputStream fin = new FileInputStream(data+"\\Prooperties\\testData.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fin);
		XSSFSheet sheet = book.getSheet("TestData");
		XSSFRow row = sheet.getRow(1);
		XSSFCell cell = row.getCell(2); 
		String cellData = cell.getStringCellValue();
		System.out.println(cellData);
	}

}
