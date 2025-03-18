class A 
{
	static 
	{
		System.out.println("I am in the SIB of A");
	}
	static void test1()
	{
		System.out.println("I am in the test1 of A");
	}
	static void test2()
	{
		System.out.println("I am in the test2 of A");
	}
}
class B
{
	static int i=20;
	static void test()
	{
		System.out.println("I am in the test of B");
	}
	static 
	{
		System.out.println("I am in the SIB of B");
	}
}
class Manager
{
	public static void main(String args[])
	{
		System.out.println("I am in the Main");
		System.out.println(B.i);
		A.test1();
		A.test2();
		B.test();
	}

}