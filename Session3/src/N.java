class N
{
	static void test()
	{
		System.out.println("I am in the N-Class");
	}
} 
class O
{
	static void test()
	{
		System.out.println("I am in the O-Class");
	}
} 
class P
{
	static void test()
	{
		System.out.println("I am in the P-Class");
	}
} 
class Q
{
	public static void main(String[] args)
	{
		test();
		N.test();
		O.test();
		P.test();
		test();
	}
	static void test()
	{
		System.out.println("I am in the Q-Class");
	}
} 