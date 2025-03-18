class Manager 
{
	void test(int i)
	{
		assert i>10;
		System.out.println("Test-End");
	}
}
class B
{
	public static void main(String[] args) 
	{
		Manager b1=new Manager();
		b1.test(100);
		System.out.println("--------");
		b1.test(5);
	}
}
