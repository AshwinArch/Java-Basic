class B 
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
	B()
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
		B b1=new B();
		System.out.println(b1.i);
		System.out.println(b1.j);
	}
}
