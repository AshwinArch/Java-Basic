class Manager6 
{
	public static void main(String[] args) 
	{
		A a1=new A();
		System.out.println("--------");
		B b1=new B();
	}
}
class A
{
	A()
	{
	System.out.println("A-cons");
	}
}
class B extends A
{
	B()
	{
	System.out.println("B-cons");
	}
}
