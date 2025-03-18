package Test2;

class Test
{
	int i;
	Test()
	{
	i=100;
	}
	{
	i=25;
	}
}
class Test1 extends Test
{
	int j;
	Test1(int j)
	{
	j=200;	
	}
	public static void main(String[] args)
	{
	Test1 e1=new Test1(5);
	System.out.println(e1.i);
	System.out.println(e1.j);
	}
}