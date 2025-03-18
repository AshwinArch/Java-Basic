class H 
{
	int i;
	H()
	{
	System.out.println(i);
	this.i=30;
	}
	H(int i)
	{
	this();
	System.out.println(i);
	i=130;
	}
	{
	System.out.println(i);
	i=230;
	}
}
class Manager
{
	public static void main(String[] args) 
	{
		H h1=new H();
		System.out.println("----------");
		H h2=new H(500);
		System.out.println("----------");
		System.out.println(h1.i+":"+h2.i);
		}
}
