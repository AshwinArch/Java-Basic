class B
{
	int i;
	static int j;
	B(int i, int j)
	{
		i=i;
		j=j;
	}
	void print()
	{
	System.out.println(i);
	System.out.println(j);
	}
	public static void main(String args[])
	{
	B b1=new B(10,20);
	b1.print();
	}
}