class A
{
	int i;
	A(int i)
	{
	this.i=i;
	}
	A()
	{
	i=20;
	}
}
class B extends A
{
	int j;
	B()
	{
	j=20;
	}
	B(int i,int j)
	{
	super(i);
	this.j=j;
	}
}
class Manager
{
	public static void main(String[] args) 
	{
		A a1=new A();
		A a2=new A(100);
		B b1=new B();
		B b2=new B(1,2);
		System.out.println(b1.i);
		System.out.println(b2.j);
		System.out.println(a2.i);
//		System.out.println(a2.j);
//		System.out.println("Hello World!");
	}
}
