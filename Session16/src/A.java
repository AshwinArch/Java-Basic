class A 
{
	static int i;
	public static void main(String[] args) 
	{
		
		System.out.println("Main method !");
		test();
		System.out.println("Main ends !");
	}
	public static void test()
	{
		System.out.println(i);
	}
}
