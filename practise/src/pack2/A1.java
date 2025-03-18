interface I
{
	void method();
}
class  A1
{
	public A1()
	{
		class C implements I
		{
			public void method()
			{
				System.out.println("method");
			}
		}
		C c1=new C();
		c1.method();
	}
	public static void main(String[] args) 
	{			A1 b1=new A1();
	}
}
