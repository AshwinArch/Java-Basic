package pack1;

interface A
{
	class B{}
	static class C{}
	class D implements A
	{}
	class Manager2
	{
		public static void main(String[] args) 
		{
			A.C c1=new A.C();
			A.B b1=new D.B();
			System.out.println("Done");
		//	A.B b2=new A().new B();
		}
	}
}
