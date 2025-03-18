package Test2;

class Test
{
	int i;
	Test()
	{
	this(123);
	i=100;
	}
	{
	i=25;
	}
	Test(int i)
	{
	this.i=i;
	}
}
class Exam extends Test
{
	int j;
	Exam(int j)
	{
		this();
		j=200;	
	}
	Exam()
	{
	this.i=143;
	}
	{
	i=153;
	}
	public static void main(String[] args)
	{
	Test t1=new Test();
	System.out.println(t1.i);
	Test t2=new Test(22);
	System.out.println(t2.i);
	Exam e1=new Exam();
	System.out.println(e1.i);
	System.out.println(e1.j);
	Exam e2=new Exam(5);
	System.out.println(e2.i);
	System.out.println(e2.j);
	}
}