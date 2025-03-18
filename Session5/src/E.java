class A
{
	int i;
	A()
	{
	System.out.println(1);
	}
}
class B extends A
	{
		B(int i)
		{
		System.out.println(2);
		this.i=i;
		}
	}
class Manager
	{
		public static void main(String args[])
		{
			B b1=new B(20);
			System.out.println(b1.i);
		}
	}
