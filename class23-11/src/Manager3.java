class A1
{
	{
		System.out.println("A1-IIB");
	}
}
class A2 extends A1
{
	{
		System.out.println("A2.IIB");
	}
}
class Manager3
{
	public static void main(String args[])
	{
	A2 a=new A2();
	}
}