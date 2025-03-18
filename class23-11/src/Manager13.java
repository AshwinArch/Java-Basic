class F
{
	int i=10;
	F()
	{
	System.out.println("From cons:"+i);
	}
}
class Manager13
{
	public static void main(String[] args) 
	{
		F b1=new F();
		System.out.println("From Main :"+b1.i);
	}
}
