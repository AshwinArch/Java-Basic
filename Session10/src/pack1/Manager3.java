package pack1;

class Outer 
{
	class A
	{
	}
	static class B
	{
	}
}
class Manager3
{
	public static void main(String[] args) 
	{
		Outer.A o1=new Outer().new A();
		Outer.B o2=new Outer.B();
		Outer o3=new Outer();
		Outer.A a2=o3.new A();
		Outer.B b2=new Outer.B();
		System.out.println("Hello World!");
	}
}
