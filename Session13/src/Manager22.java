class Z 
{
	Z()
	{
	this(10);
	System.out.println("Z()");
	}
	Z(int i)
	{
	System.out.println("Z(int)");
	}
}
class Manager22
{
	public static void main(String[] args) 
	{
		Z z1=new Z();
	}
}
