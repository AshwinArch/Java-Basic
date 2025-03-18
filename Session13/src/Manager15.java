class H 
{
	int i;
	H()
	{
	i=10;
	}
	H(int j)
	{
	i=j;
	}
}
class Manager15
{
	public static void main(String[] args) 
	{
		H d1=new H();
		H d2=new H(20);
		System.out.println(d1.i);
		System.out.println(d2.i);
	}
}
