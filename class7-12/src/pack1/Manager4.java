package pack1;

class Manager4
{
	enum Test
	{
		A, B, C;
	static int i;
	}
	public static void main(String[] args) 
	{
		Test t1=Test.A;
		t1.i=200;
		Test t2=Test.B;
		t2.i=300;
		System.out.println(t1.i);
	}
}
