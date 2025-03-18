package pack1; import pack2.A;

class Manager extends A
{
	Manager()
	{
		super(15);
	}
	//Manager(int i)
	//{super(this);}
	public static void main(String[] args) 
	{
		Manager a1=new Manager();
		System.out.println(a1.i);
	
		/*Manager a2=new Manager(10);
		System.out.println(a2.i);
	*/
	}
}
