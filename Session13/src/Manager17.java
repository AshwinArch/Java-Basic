class J 
{
	J()
	{
	System.out.println("J()");
	}
	J(int i)
	{
	System.out.println("J(int)");
	}
	{
	System.out.println("J-IIB");
	}
}
class Manager17
{
	public static void main(String[] args) 
	{
		J j1=new J();
		J j2=new J(12);
	}
}
