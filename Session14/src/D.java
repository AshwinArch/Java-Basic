class Manager 
{   static int j;
	int i=10;
    
	Manager()
	{
		System.out.println("Manager()");
	}
	Manager(int i)
	{
	System.out.println("Manager(int)");
	}
	Manager(int i,double j)
	{
	System.out.println("Manager(int,double)");
	}
	Manager(double i)
	{
	System.out.println("double(Manager)");
	}
	{
		System.out.println("IIB_Manager");
	}
	static
	{
	System.out.println("SIB _ Manager");
	}
}
class D
{
	public static void main(String[] args) 
	{
		Manager m1=new Manager();
		Manager m2=m1;
		Manager m11=new Manager(1);
		Manager m12=new Manager(1.9);
		Manager m13=new Manager(1,2.9);
		System.out.println(m2.j);
		System.out.println(m1.i);
		
	}
}
