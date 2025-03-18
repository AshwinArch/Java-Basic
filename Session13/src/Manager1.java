class Manager1
{
	public static void main(String arg[])
	{
		B1 b1=new B1();
		System.out.println("----------");
		B2 b2 = new B2();
	}
}
class B1
{
	B1()
	{
		System.out.println("B1-cons");
	}
	{
		System.out.println("IIB-B1");
	}
}

class B2 extends B1
{
	B2()
	{
		System.out.println("B2-cons");
	}
	{
		System.out.println("B2-IIB");
	}
}