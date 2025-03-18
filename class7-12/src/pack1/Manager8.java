package pack1;
class Manager8
{
	enum Test
	{
		A, B, C;
	}
	public static void main(String[] args) 
	{
		Test t1=Test.valueOf("C");
		//System.out.println(t1.ordinal());
		System.out.println(t1);
	}
}
