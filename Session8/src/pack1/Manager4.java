package pack1;

class Man
{
	enum Enum4
	{
	A, B, C, D;
	static int i;
	Enum4()
		{
			System.out.println("Constructor");
		}
		{
		System.out.println(i);
		System.out.println("IIB");
		i++;
		}
		{
		System.out.println(i);
		}
		static
		{
		System.out.println("SIB");
		}
	}
}
class Manager4 extends Man
{
	public static void main(String[] args) 
	{
		Enum4 a1=Enum4.B; 
		/*System.out.println(a1);
		System.out.println("---------");
		Enum4 a2=Enum4.A;
		System.out.println(a2);
	*/
	}
}
