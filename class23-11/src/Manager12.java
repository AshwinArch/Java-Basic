class E 
{
	int i;
	E()
	{
	System.out.println("From Cons." + i);
	}
}
class Manager12
{
	public static void main(String[] args) 
	{
		E e1=new E();
		System.out.println("From Main :" + e1.i);
	}
}