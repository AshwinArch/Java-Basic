class E 
{
	int i;
	E()
	{
	i=10;
	}
	void print()
	{
	System.out.println(i);
	}
}
class Manager4
{
	public static void main(String[] args) 
	{
		E b1=new E();
		b1.print();
		b1.i=1000;
		b1.print();
		System.out.println("Hello World!");
	}
}
