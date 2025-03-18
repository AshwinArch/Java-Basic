class F 
{
	int i;
	F()
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
		F b1=new F();
		System.out.println(b1.i);
	}
}
