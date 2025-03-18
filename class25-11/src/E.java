class E 
{
	int i;
	E()
	{
	System.out.println(i);
	this.i=25;
	}
	{
	System.out.println(i);
	i=5;
	}
	{
	System.out.println(i);
	i=10;
	}
}
class Manager
{
	public static void main(String[] args) 
	{
		E b1=new E();
		System.out.println(b1.i);
	}
}
