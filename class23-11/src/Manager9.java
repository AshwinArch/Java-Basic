class B 
{
	B()
	{
	System.out.println("B()");
	}
	B(int i)
	{
	System.out.println("B(int)");
	}
}
class Manager9
{
	public static void main(String[] args) 
	{
		B b1=new B();
		B b2=new B(10);
		B b3=new B();
		B b4=new B(100);
		}
}
