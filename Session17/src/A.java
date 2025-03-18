class A 
{
	int i=1000;
	{
	i=2000;
	}
	A()
	{
	i=5000;
	}
	public static void main(String[] args) 
	{
		A a1=new A();
		System.out.println(a1.i);
	}
}
