package pack1;
class A
{
	int i;
	static int j;
	void test1()
	{
		System.out.println(i);
		System.out.println(j);
		test1();
		test2();
	}
	static void test2()
	{
		System.out.println(i);
		System.out.println(j);
		test1();
		test2();
	}
}