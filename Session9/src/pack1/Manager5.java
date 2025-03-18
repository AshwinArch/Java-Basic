package pack1;

enum Enum5
{
	A,
	B
	{
		void Test()
		{
			System.out.println("I am from CSCB");		
		}
	},
	C,
	D;
	void Test()
	{
		System.out.println("I am from Method");
	}
}
class Manager5
{
	public static void main(String[] args) 
	{
		Enum5 e1=Enum5.A;
		e1.Test();
		Enum5 e2=Enum5.B;
		e2.Test();
		Enum5 e3=Enum5.C;
		e3.Test();
		Enum5 e4=Enum5.D;
		e4.Test();
	}
}
