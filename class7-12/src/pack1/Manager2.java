package pack1;

enum Test2
{
	A(10), B(20), C;
	int i;
	Test2(int i)
	{
		this.i=i;
	}
	Test2()
	{}
	int get()
	{
	return i;
	}
}
class Manager2
{
	public static void main(String[] args) 
	{
		Test2 t1=Test2.B;
		System.out.println(t1.i);
		System.out.println(t1.get());
		System.out.println(t1);
		Test2 t2=Test2.C;
		System.out.println(t2.i);
		System.out.println(t2.get());
		System.out.println(t2);
	}
}
