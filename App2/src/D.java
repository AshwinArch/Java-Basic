class D
{
	public static void main(String[] args) 
	{
		int i=0;
		test(i++);
		test(i);
	}
	public static void test(int i)
	{
		//System.out.println(i--);
		System.out.println(i);
	}
}
