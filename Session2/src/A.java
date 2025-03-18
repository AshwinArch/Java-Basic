class A 
{
	public static void main(String[] args) 
	{
		int i=0;
		int j=i++ + ++i + --i + test(++i);
		System.out.println(i);
		System.out.println(j);
	}
	static int test(test1(i))
	{
	return --i;
	}
	static int test1(int i)
	{
	return i++;
	}
}
