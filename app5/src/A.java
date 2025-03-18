class  A
{
	static 
	{
	System.out.println("I am in the sib of A");
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
	System.out.println("i am in the test of B");
	}
	static 
	{
	System.out.println("I am in the sib of B");
	}
}
class Manager2
{
	public static void main(String args[])
	{
	System.out.println("I am in the Main");
	System.out.println(B.i);
	B.test();
	B.test();
	}
}