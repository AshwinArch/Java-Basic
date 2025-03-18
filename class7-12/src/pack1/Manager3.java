package pack1;

enum Test3
{
	A, B, C;
	static int i;
	Test3()
	{	}
	void method()
	{
	System.out.println(i);
	}
}
class Manager3
{
	public static void main(String[] args) 
	{
		Test3 t1=Test3.C;
		t1.method();
		System.out.println(t1);
		System.out.println(t1.i);
	}
}
