package FinalDemo;

public class FinalizeDemo1 
{

	public static void main(String[] args) 
	{
		FinalizeDemo1 f1 = new FinalizeDemo1();
		FinalizeDemo1 f2 = new FinalizeDemo1();
		FinalizeDemo1 f3 = new FinalizeDemo1();
		FinalizeDemo1 f4 = new FinalizeDemo1();
		FinalizeDemo1 f5 = new FinalizeDemo1();
		f1 = f5;
		f2 = f5;
		f3 = f5;
		f4 = f5;
		new FinalizeDemo1(); //AnnonimusObject
//		new FinalizeDemo1(); 
//		new FinalizeDemo1(); 
//		System.gc();
		System.out.println("Done");
		System.gc();
	}
	public void funA()
	{
		System.out.println("funA of FinalizeDemo1");
	}
	public void finalize()
	{
		System.out.println("finalize of FinalizeDemo1");
	}
}
