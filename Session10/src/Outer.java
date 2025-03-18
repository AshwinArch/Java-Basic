class Outer 
{
	int i;
	static int j;
	void test1()
	{
		System.out.println(i);
		System.out.println(j);
		test1();
		test2();
		A a1=new A();
		B b1=new B();
	}
	static void test2() 
	{
//		System.out.println(i);
		System.out.println(j);
//		test1();
		test2();
//		A a1=new A();
		B b1=new B();
	}

	class A
	{
		int k;
//		static int l;
		void test3()
		{
			System.out.println(i);
			System.out.println(j);
			test1();
			test2();
			System.out.println(k);
//			System.out.println(l);
			test3();
//			test4();
			B b1=new B();
		}
/*		static void test4() 
		{
			System.out.println(i);
			System.out.println(j);
			test1();
			test2();
			System.out.println(k);
			System.out.println(l);
			test3();
			test4();
			B b1=new B();
			}
		*/
	}
	static class B
	{
		int m;
		static int n;
		void test5()
		{
//			System.out.println(i);
			System.out.println(j);
//			test1();
			test2();
			System.out.println(m);
			System.out.println(n);
			test5();
			test6();
//			A a1=new A();
		}
		void test6()
		{
//			System.out.println(i);
			System.out.println(j);
//			test1();
			test2();
//			System.out.println(m);
			System.out.println(n);
			test5();
			test6();
//			A a1=new A();
		}
	}
}