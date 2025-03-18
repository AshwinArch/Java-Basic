class Manager5
{
	public static void main(String[] args)
	{
		test1 t1=new test1();
		System.out.println("--------");
		test2 t2=new test2();
		System.out.println("--------");
		test3 t3=new test3();
		System.out.println("--------");
	
	}
}
class test1
{
	{	
		System.out.println("test1");
	}
}
class test2 extends test1
{
	test2()
	{	
		System.out.println("test2");
	}
}
class test3 extends test2
{
	test3()
	{
		System.out.println("test3");
	}
}