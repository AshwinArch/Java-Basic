class C1
{
	static 
	{
	System.out.println("C1-SIB");
	}
	C1()
	{
		System.out.println("C1-cons");
	}
	{
		System.out.println("IIB-C1");
	}
}

class C2 extends C1
{
	
	static 
	{
	System.out.println("C2-SIB");
	}
	C2()
	{
		System.out.println("C2-cons");
	}
	{
		System.out.println("IIB-C2");
	}
}
class Manager2
{
	public static void main(String arg[])
	{
		C2 c2=new C2();
		System.out.println("---------");
		C1 c1=new C1();
	}
}
