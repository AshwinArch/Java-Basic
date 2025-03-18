class X 
{
	X()
	{
	System.out.println("X()");
	}
	X(int i)
	{
	this();
	System.out.println("X(int)");
	}
}
class Manager23
{
	public static void main(String[] args) 
	{
		X x1=new X();
		System.out.println("----------");
		X x2=new X(10);
		System.out.println("----------");
	}
}
