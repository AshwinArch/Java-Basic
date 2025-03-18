class  A
{
	int i;
	A()
	{
	this(10);
	}
	A(int i)
	{
	this.i=i;
	}
}
class Manager
{
	public static void main(String[] args)
	{
		A a1=new A();
		A a2=new A(20);
		System.out.println(a1.i);
		System.out.println(a2.i);
	}
}
