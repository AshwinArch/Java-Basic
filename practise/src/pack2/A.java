class  A
{
	void testA()
	{
		System.out.println("A");
	}
	public static void main(String[] args) 
	{
		class B extends A
		{
			void testB()
			{
				System.out.println("B");
			}
		}
		B b1=new B();
		b1.testA();
		b1.testB();
		
	}
}
