class K 
{
	K()
	{
		System.out.println("K()");
	}
	K(int i)
	{
		System.out.println("K(int)");
	}
	{
		System.out.println("1st IIB");
	}
	{
		System.out.println("2nd IIB");
	}
}
class Manager18
{
	public static void main(String[] args) 
	{
		K k1=new K();
		K k2=new K(10);
	}
}
