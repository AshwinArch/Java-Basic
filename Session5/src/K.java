class K
{ 
	int i;
	static void test1() 
	{ 
		B b1=new B();
		b1.test2();
		System.out.println(b1.i);
	}
	void test2()
	{
	B b1=new B();
	b1.test3();
	System.out.println(i);
	System.out.println(b1.i);
	}
	void test3()
	{
	B b1=new B();
	System.out.println(i);
	System.out.println(b1.i);
	}
	class Manager
	{
		public static void main(String args[])
		{
		B.test1();
		B b1=new B();
		b1.test3();
		b1.test2();
		System.out.println(b1.i);
		}
	}