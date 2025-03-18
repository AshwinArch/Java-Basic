class U 
{
	static 
	{
		System.out.println("I am in the sib of U");	
	}
	static void test1()
	{
		System.out.println("I am in the test1 of U");
	}
	static void test2()
	{
		System.out.println("I am in the test2 of U");
	}
}
class V
{
	static int i=20;
	static void test()
	{
		System.out.println("I am in the test of V");	
	}
	static
	{
		System.out.println("I am in the sib of V");
	}
}
class Manager
{
	public static void main(String args[])
	{
		System.out.println("I am in the main");
		U.test1();
		U.test2();
		V.test();
	}
}