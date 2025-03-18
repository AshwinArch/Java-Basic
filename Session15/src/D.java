class D 
{
	int i;
	D()
	{
	System.out.println(i);
	this.i=10;
	}
	{
	i=5;
	}
}
class Manager
{
	public static void main(String[] args) 
	{
		D a1=new D();
		System.out.println(a1.i);
	}
}
