package pack1;
interface A
{
	int i=10;
	void test1();
	class B{}
	interface C{int j=20;}	 
	enum D{X, Y, Z}
}
class Manager1
{
	public static void main(String[] args) 
	{
		System.out.println(A.i);
		A.B b1=new A.B();
		System.out.println(A.C.j);
		//A.D a=A.D.X;
		//System.out.println(a.ordinal());
		System.out.println(A.D.X);
	}
}
