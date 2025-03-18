class X 
{
	X x;
	X(int x)
	{
	System.out.println(1);
	System.out.println(x);
	}
	int x(int x)
	{
	return x;
	}
	X x()
	{
	System.out.println(2);
	return x;
	}
}
class Manager
{
	public static void main(String[] args) 
	{
		X x1=new X(11);
		System.out.println("Main method !");
		x1.x(22);
		System.out.println(x1.x);
	}
}
