class I 
{
	int i=test();
	I()
	{
	System.out.println(1);
	}
	{
	System.out.println(2);
	}
	int test()
	{
	System.out.println(3);
	return 100;
	}
}
class Manager
{
	public static void main(String[] args) 
	{
		I i1=new I();
		System.out.println(i1.i);
	}
}
