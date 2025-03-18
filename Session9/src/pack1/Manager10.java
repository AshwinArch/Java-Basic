package pack1;
class Manager10
{
	enum Test
	{
		A, B, C, D;
	}
	public static void main(String[] args) 
	{
		Test t=Test.C;
		switch(t)
		{
		case A:
			{
				System.out.println("A");
			}
		case B:
			{
				System.out.println("AB");
			}		
		case C:
			{
				System.out.println("ABC");
				break;
			}		
		case D:
			{
				System.out.println("ABCD");
			}
		}
	}
}
