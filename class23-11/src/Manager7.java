class A 
{
	static int i;
	static void print1()
	{
	System.out.println(i);
	}
}
class B extends A 
{
	static int j;
	static void print2()
	{
	print1();
	System.out.println("j");
	}
}
class Manager7
{
	public static void main(String[] args) 
	{
		A a1=new A();
		System.out.println(a1.i);
		B b1=new B();
		System.out.println(b1.i);
		System.out.println(b1.i);
	}
}