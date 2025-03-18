class C
{
	int i;
	void test(C b)
	{
		System.out.println(b.i);	
		System.out.println(i);	
	}
}
class Manager10
{
	public static void main(String args[])
	{
	C b1=new C();
	b1.i=100;
	C b2=new C();
	b2.i=200;
	b2.test(b1);
	}

}