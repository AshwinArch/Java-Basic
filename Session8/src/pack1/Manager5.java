package pack1;

class Manager5
{
	enum Enum5
	{
		Test1(10), Test2(20);

		Enum5(int i)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) 
	{
		Enum5 a1=Enum5.Test1; 
		System.out.println(a1);
		/*System.out.println("---------");
		Enum4 a2=Enum4.A;
		System.out.println(a2);
	*/
	}
}
