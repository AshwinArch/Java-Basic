class F 
{
int i;
static int j;
F()
	{
		i=10;
		j=20;
	}
F(int i)
	{
		this.i=i;
		j=i;
	}
	{
		i=1000;
		j=2000;
	}
static 
	{
		j=1;
	}
void test()
	{
		System.out.println(i);
		System.out.println(j);
	}
static void test2()
	{
		System.out.println(j);
	}
}
class Manager
{
	public static void main(String[] args) 
	{
		F d1=new F();
		System.out.println(d1.i);
		System.out.println(d1.j);
		F d2=new F();
		System.out.println(d1.i);
		System.out.println(d2.j);
	}
}
