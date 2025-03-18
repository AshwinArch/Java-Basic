class C 
{
	int i;
	int j;
	C()
	{
		i=10;
	}
	void print()
	{
		System.out.println(j);
	}
	int set(int j)
	{
		i=j;
		return j;
	}
	int get()
	{
		return i;
	}
}
class Manager3
{
	public static void main(String[] args) 
	{
		C c1=new C();
		c1.print();
		c1.print();
		System.out.println(c1.get());
		c1.set(40);
		c1.print();
		int i=c1.set(50);
		System.out.println(i);
		c1.i=60;
		c1.print();
		i=c1.set(90);
		System.out.println(i);
		System.out.println("Hello World!");
	}
}
