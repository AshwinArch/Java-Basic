class D 
{
	int i=10;
	static int j;
	{
	i=100;
	}
	static
	{
	j=200;
	}
	D()
	{
	System.out.println(i);
	System.out.println(j);
	i=1;
	j=2;
	}
}
class Manager
{
	public static void main(String[] args) 
	{
		D d1=new D();
		System.out.println(d1.i);
		System.out.println(d1.j);
	}
}
