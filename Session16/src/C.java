class C 
{
	int i;
	{
		i=2000;
	}
	C()
	{
		i=5000;
	}
	public static void main(String[] args) 
	{
		C c1=new C();
		System.out.println(c1.i);
	}
}
