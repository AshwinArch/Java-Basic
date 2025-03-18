class J
{
	public static void main(String[] args) 
	{
		int i=10;
		i=i++ + test(i++) + i ;
		System.out.println(i);
	}
	public static int test(int i)
	{
	return i++;
	}
}
