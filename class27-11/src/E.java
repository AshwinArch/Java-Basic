class E 
{
	{
		int i=10;
	}
	static 
	{
		j=20;
	}
	{
		i=10;
	}
	static 
	{
		j=40;
	}
	int i=50;
	{
		i=60;
	}
	static int j=70;
	static 
	{
		j=80;
	}
}
class Manager
{
	public static void main(String[] args) 
	{
		E f1=new E();
		System.out.println(f1.i);
		System.out.println(f1.j);
		System.out.println(E.j);
	}
}
