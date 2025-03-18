package pack1;

enum Test3
{
	A, B, C;
	static int i;
	Test3()
	{
	System.out.println(i);
	}
}
class Manager
{
	public static void  main(String args[])
	{
	Test3 t1=new Test3();
	System.out.println(t1);
	}
}
