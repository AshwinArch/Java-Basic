package Test2;

class Exam1 
{
	static int i=10;
	Exam1(int i)
	{
	i=15;
	}
	{
	i=30;
	}
	public static void main(String[] args)
	{
	Exam1 e1=new Exam1(1);
	System.out.println(e1.i);
	e1.i=20;
	Exam1 e2=new Exam1(2);
	System.out.println(e2.i);
	}
}