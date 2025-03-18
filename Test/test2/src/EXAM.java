package Test2;

class EXAM 
{
	int i=10;
	EXAM()
	{
	i=20;
	}
	{
	i=30;
	}
	static 
	{
	i=40;
	}
	public static void main(String[] args)
	{
	EXAM e1=new EXAM();
	System.out.println(e1.i);
	}
}