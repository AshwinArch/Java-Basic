class D 
{
	void test(int i)
	{
		System.out.println(1);
		assert i>10;
		System.out.println(2);
	}
}
class E
{
	void test(int i)
	{
		System.out.println(3);
		assert i<10;
		System.out.println(4);
	}
}
class Manager1
{
	public static void main(String[] args) 
	{
		D d1=new D();
		E e1=new E();
		d1.test(100);
		e1.test(1999);
		System.out.println("---------");
		d1.test(5);
		e1.test(5);
	}
}
