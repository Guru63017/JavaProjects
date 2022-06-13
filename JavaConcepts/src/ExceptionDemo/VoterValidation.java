package ExceptionDemo;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class VoterValidation {

	public static void main(String[] args) throws Throwable
	{
		voterDetails(17);
	}
	static void voterDetails(int age)throws SQLException,FileNotFoundException
	{
		if(age>=18)
		{
			System.out.println("valid voter");
		}
		else
		{
			System.out.println("voter age not valid");
//			throw new NullPointerException();
//			throw new ArrayIndexOutOfBoundsException();
//			throw new NumberFormatException();
//			throw new Exception();
//			throw new FileNotFoundException();
//			throw new SQLException();
		}
		System.out.println("continue.......");
		System.out.println("Done");
	}
}
