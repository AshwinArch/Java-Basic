class util1
{
	int i;
	util1()
	{
		i=10;
	}
}
class util2 extends util1
{
	int j;
	util2()
	{
	j=100;
	}
}
class util3 extends util2
{
	int k;
	util3()
	{
	k=1000;
	}
	void print()
	{
	System.out.println(i);
	System.out.println(j);
	System.out.println(k);
	}
}
class Manager4
{
	public static void main(String args[])
	{
	util3 u3=new util3();
	u3.print();
	}
}