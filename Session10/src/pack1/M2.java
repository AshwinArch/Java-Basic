package pack1;

class M2
{
	class A	{}
	static class B{}
	public static void main(String[] args) 
	{
		M2 m1=new M2();
		A x1=m1.new A();
		B b1=new B();
		M2.B b2=new M2.B();
		System.out.println("Hello World!");
	}
}
