class L
{
	public static void main(String[] args) 
	{
		int i=0;
		int j=i++ + i-- + test(++i) + ++i + test2(i--);
		System.out.println(i);
		System.out.println(j);
	}
	public static int test(int i)
	{
	return ++i;
	}
	public static int test2(int i)
	{
	return i++;
	}
}
