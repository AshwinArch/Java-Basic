class D 
{
	int i;
	static int j;
	D()
	{
	i=10;
	j=20;
	}
	D(int i)
	{
	this.i=i;
	j=i;
	}
	{
	i=1000;
	j=2000;
	}
	static 
	{
	j=1;
	}
	void test()
	{
	System.out.println(i);
	System.out.println(j);
	}
	static void test2()
	{
	System.out.println(j);
	}
}
class Manager
{
	public static void main(String[] args) 
	{
		D d1=new D();
		System.out.println(d1.i);
		System.out.println(d1.j);
	
		D d2=new D(20);
		System.out.println(d1.i);
		System.out.println(d2.j);
	
	}
}
