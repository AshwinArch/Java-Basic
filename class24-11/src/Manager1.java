class Manager1
{
	public static void main(String[] args) 
	{
		C c1=new C();
		c1.print();
	}
}
class B
{
	int i;
	B()
	{
		i=10;
	}
}
class C extends B
{
	int j;
	C()
	{
		j=20;
	}
	void print()
	{
	System.out.println(i);
	System.out.println(j);
	}
}