class C 
{
	static 
	{
	j=10;
	}
	{
	i=20;
	}
	int i=200;
	static int j=100;
	C()
	{
	System.out.println(i);
	System.out.println(j);
	i=500;
	j=200;
	}
}
class Manager
{
	public static void main(String[] args) 
	{
		C c1=new C();
		System.out.println(c1.i);
		System.out.println(c1.j);
	}
}
