class C 
{
	C(int i)
	{
	System.out.println("C(int)");
	}
	C(double i)
	{
	System.out.println("C(double)");
	}
}
class Manager10
{
	public static void main(String[] args) 
	{
		C c1=new C(10);
		C c2=new C(10.0);
		System.out.println("Hello World!");
	}
}
