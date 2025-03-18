class A
{
	static int i=10;
	static 
	{
		System.out.println("I am in the SIB of A");		
	}
}
class B
{
	static void test()
	{
	System.out.println(" I am in the test of B");
	}
	static 
	{
		System.out.println("I am in the SIB of B");		
	}
}
class C
{
	static int i=10;
	public static void main(String[] args)
	{
		System.out.println("I am in the Main");		
		System.out.println(A.i);
		B.test();
	}
}

