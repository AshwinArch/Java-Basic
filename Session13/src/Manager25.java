class V 
{
	V()
	{
		this(10);
		System.out.println("V()");
	}

	V(int i)
	{
		this();
		System.out.println("V()");
	}
}
class Manager25
{
	public static void main(String[] args) 
	{
		V v1=new V();
		System.out.println("Hello World!");
	}
}
