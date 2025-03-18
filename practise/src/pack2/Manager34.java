class Prog27
{
	Prog27() throws ClassNotFoundException
	{
		Class.forName("-----");// TODO Auto-generated constructor stub
	}
}
class D1 extends Prog27
{
	D1() 
	{	super();
	}
	void test()
	{
		System.out.println("Done");
	}
}
class Manager34
{
	public static void main(String[] args) 
	{
		try
		{
		D1 d=new D1();
		d.test();
		}
		catch(ClassNotFoundException Ex)
		{
			System.out.println(Ex);
		}
	}
}
