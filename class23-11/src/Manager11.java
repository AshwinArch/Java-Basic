class D 
{
	D(int i,double j)
	{
		System.out.println("int , double");
	}
	D(double i, double j)
	{
	System.out.println("double , double");	
	}
}
class Manager11
{
	public static void main(String[] args) 
	{
		D d1=new D(10,1.0);
		D d2=new D(1.4,2.3);
		System.out.println("Hello World!");
	}
}
