package Practies;

public class BedzDemo1P 
{
	public static void main(String[] args)
	{
		int grossAmount=15000;
		//int netAmount=grossAmunt-totalcharges;//they to dont know who is totalcharges
		BedzDemo1P bp1=new BedzDemo1P();
		//int netAmount=grossAmount-bp1.housecharges2();
		//System.out.println(netAmount);
		//int taxcal=3*bp1.housecharges2();
		//System.out.println(taxcal);
		int charges=bp1.housecharges2();
		int netAmount=grossAmount-charges;
		System.out.println(netAmount);
		int taxcal=3*netAmount;
		System.out.println(taxcal);
		}
	void houseCharges()
	{
		int rent=1200;
		int childfee=1000;
		int totalcharges=rent+childfee;
		System.out.println(totalcharges);
	}
	int housecharges2()
	{
		System.out.println("housecharges2 is invoking");
		int rent=1200;
		int childfee=1000;
		int totalcharges=rent+childfee;	
		System.out.println(totalcharges);
		return totalcharges;
	}
}
