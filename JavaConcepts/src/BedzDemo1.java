
public class BedzDemo1 
{
	public static void main(String[] args) 
	{
		int grossSalary = 10000;

		// in these case we dont know who is totalCharges
		//int netsalary = grossSalary - totalCharges;
		BedzDemo1 bd1 = new BedzDemo1();
//		int netsalary = grossSalary - bd1.houseCharges2();
//		System.out.println(netsalary);
//		System.out.println(taxcall);
		int charges = bd1.houseCharges2();
		int netsalary = grossSalary - charges;
		System.out.println(netsalary);
		int taxcall = 30*netsalary;
		System.out.println(taxcall);
		
	}
//	void housecharges1()
//	{
//		int rent = 1000;
//		int childFee = 2000;
//		int totalCharges = rent + childFee;
//		System.out.println(totalCharges);
//	}
	int houseCharges2()
	{
		System.out.println("houseCharges2 is invoking");
		int rent = 1000;
		int childFee = 2000;
		int totalCharges = rent + childFee;	
//		System.out.println(totalCharges);
		return totalCharges;
	}
}
