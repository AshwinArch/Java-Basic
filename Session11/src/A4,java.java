public class A4
{
	static int i;
	static int j;
	static class D
	{
		static void test()
		{
		test2();
		}
	}
	void test2()
	{
	System.out.println(i);
	System.out.println(j);
	}
}
public static void main(String[] args) 
	{
		A4 a1=new A4();
		A4.D e1=a1.new D();
		e1.test();
	}
}
