class V 
{
	V()
	{
		this();
		System.out.println("V()");
	}
}
class Manager24
{
	public static void main(String[] args) 
	{
		V v1=new V();
		System.out.println("Hello World!");
	}
}
