package pack1;

class A
{
	class B
	{
	}
	static class C
	{
	}
}
class Manager4
{
	public static void main(String[] args) 
	{
		A.B b1=new A().new B();
		A.C c1=new A.C();
		A a1=new A();
		A.B b2=a1.new B();
		A.C c2=new A.C();
		System.out.println("Hello World!");
	}
}
