class X
{
	static 
	{
		System.out.println("I am in the sib of X");	
	}
	static void test1()
	{
		System.out.println("I am in the test1 of X");
	}
	static void test2()
	{
		System.out.println("I am in the test2 of X");
	}
}
class Y
{
	static int i=20;
	static void test()
	{
		System.out.println("I am in the test of Y");	
	}
	static
	{
		System.out.println("I am in the sib of Y");
	}
}
class Manager
{
	public static void main(String args[])
	{
		System.out.println("I am in the main");
		System.out.println(Y.i);
		Y.test();
		X.test1();
		Y.test();
	}
}