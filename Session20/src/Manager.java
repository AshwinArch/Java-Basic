class C  
{
	void test(int i)
	{
		System.out.println(1);
		assert i>10:"I should be > 10";
		System.out.println(2);
	}
}
class Manager
{
	public static void main(String[] args) 
	{
		C  c1=new C();
		c1.test(100);
		System.out.println("----------");
		c1.test(5);
		System.out.println("End");
	}
}
