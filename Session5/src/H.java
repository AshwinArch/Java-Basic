class  G
{ 
	void test()
	{
		System.out.println("I am from Test");
	}
	static 
	{
		G g1=new G();
		g1.test();
	}
	public static void main(String[] args) 
	{
		System.out.println(" Done ");	}
}
