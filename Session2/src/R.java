class R
{
	public static void main(String[] args) 
	{
		int i=0;
		i=i++ + get(i) + ++i + i*10;
		System.out.println(i);
	}
	static int get(int i)
	{
		return i*1;
	}
}
